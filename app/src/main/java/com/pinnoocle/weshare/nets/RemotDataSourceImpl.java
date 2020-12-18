package com.pinnoocle.weshare.nets;


import android.content.Context;

import com.pinnoocle.weshare.bean.EvaluationBean;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.bean.SpecBean;

import java.util.Map;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by whs on 2017/5/18
 */

public class RemotDataSourceImpl implements RemotDataSource {

    private static Context mContext;

    @Override
    public void login(Map<String, String> queryMap, getCallback callback) {

    }

    @Override
    public void homePage(Map<String, String> queryMap, getCallback callback) {
        Observable<HomeBean> observable = RetrofitHelper.getInstance(mContext).getServer().homePage(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(HomeBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void recommend(Map<String, String> queryMap, getCallback callback) {
        Observable<RecommendBean> observable = RetrofitHelper.getInstance(mContext).getServer().recommend(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecommendBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(RecommendBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void goodsDetail(Map<String, String> queryMap, getCallback callback) {
        Observable<GoodsDetailBean> observable = RetrofitHelper.getInstance(mContext).getServer().goodsDetail(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GoodsDetailBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(GoodsDetailBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void spec(Map<String, String> queryMap, getCallback callback) {
        Observable<SpecBean> observable = RetrofitHelper.getInstance(mContext).getServer().spec(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpecBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(SpecBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void goodsEvaluation(Map<String, String> queryMap, getCallback callback) {
        Observable<EvaluationBean> observable = RetrofitHelper.getInstance(mContext).getServer().goodsEvaluation(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<EvaluationBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(EvaluationBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }


    private static class Laydz {
        private static RemotDataSourceImpl instance = new RemotDataSourceImpl();
    }


    public static RemotDataSourceImpl getInstance(Context context) {
        mContext = context;
        return Laydz.instance;
    }
}
