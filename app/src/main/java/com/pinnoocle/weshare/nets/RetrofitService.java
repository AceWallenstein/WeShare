package com.pinnoocle.weshare.nets;

import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.bean.UserLogin;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by whs on 2017/2/17
 * Retrofit 接口
 */

public interface RetrofitService {
    // 登录
    @POST("")
    Observable<UserLogin> login(@QueryMap Map<String, String> queryMap);

    // 首页
    @POST("api.html")
    Observable<HomeBean> homePage(@QueryMap Map<String, String> queryMap);
    // 首页猜你喜欢
    @POST("api.html")
    Observable<RecommendBean> recommend(@QueryMap Map<String, String> queryMap);
}
