package com.pinnoocle.weshare.nets;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.BuildConfig;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.HomeBean;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by whs on 2017/2/17
 * Retrofit 初始化
 */


public class RetrofitHelper {
    private Context mContext;

    public NetworkMonitor networkMonitor;
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;
    private final HttpLoggingInterceptor logging;

    public static RetrofitHelper getInstance(Context context) {
        if (instance == null) {
            instance = new RetrofitHelper(context);

        }
        return instance;
    }

    private RetrofitHelper(Context mContext) {
        this.mContext = mContext;
        networkMonitor = new LiveNetworkMonitor(mContext);
        logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.addNetworkInterceptor(new MyNetworkInterceptor());
        okHttpClientBuilder.addInterceptor(new UrlInterceptor());
        if (BuildConfig.DEBUG) {
            okHttpClientBuilder.addInterceptor(logging);
        }

        //5秒超时
        okHttpClientBuilder.connectTimeout(20, TimeUnit.SECONDS);

        mRetrofit = new Retrofit.Builder()
                .baseUrl(mContext.getResources().getString(R.string.serverhost))
                .client(okHttpClientBuilder.build())
                //.addConverterFactory(SimpleXmlConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(initGson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }

    private Gson initGson() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        return gson;
    }


    private class MyNetworkInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            if (networkMonitor.isConnected()) {
                Log.d("requestUrl", chain.request().url().toString());
                return chain.proceed(chain.request());
            } else {
                //throw new NoNetworkException();
                ToastUtils.showToast("无网络连接，请检查网络");
            }
            return null;
        }
    }

    private class UrlInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Log.i("requestUrl", chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /**
     * 常规接口
     *
     * @return
     */
    public RetrofitService getServer() {
        return mRetrofit.create(RetrofitService.class);
    }

    private class CategoryBeanTypeAdapter extends TypeAdapter<HomeBean.DataBeanXX.CategoryBean> {
        @Override
        public void write(JsonWriter out, HomeBean.DataBeanXX.CategoryBean value) throws IOException {

        }

        /*
                "id": 14,
				"name": "食品",
				"sort": 1,
				"image_id": "dc756d5fcf9274597d2a2721706d7d36",
				"image_url": "https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768098995dfc35ab51e15.png"
         */
        @Override
        public HomeBean.DataBeanXX.CategoryBean read(JsonReader in) throws IOException {
            HomeBean.DataBeanXX.CategoryBean user = new HomeBean.DataBeanXX.CategoryBean();
            in.beginObject();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "id":
                        user.setId(in.nextInt());
                        break;
                    case "name":
                        user.setName(in.nextString());
                        break;
                    case "sort":
                        user.setSort(in.nextInt());
                        break;
                    case "image_id":
                        user.setImage_id(in.nextString());
                        break;
                    case "image_url":
                        String url = in.nextString();
                        user.setImage_url(url);
                        break;
                }
            }
            in.endObject();
            return user;
        }
    }
}
