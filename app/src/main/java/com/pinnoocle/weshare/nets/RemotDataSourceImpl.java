package com.pinnoocle.weshare.nets;


import android.content.Context;

import com.pinnoocle.weshare.bean.AddCartBean;
import com.pinnoocle.weshare.bean.ChildCatBean;
import com.pinnoocle.weshare.bean.DeleteCartBean;
import com.pinnoocle.weshare.bean.EvaluationBean;
import com.pinnoocle.weshare.bean.GetAreaIdBean;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.OrderBean;
import com.pinnoocle.weshare.bean.OrderDetailsBean;
import com.pinnoocle.weshare.bean.OrderStatusNumBean;
import com.pinnoocle.weshare.bean.PersonalCenterBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.bean.RemoveShipBean;
import com.pinnoocle.weshare.bean.SaveUserShipBean;
import com.pinnoocle.weshare.bean.SetDefShipBean;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.UserLoginBean;
import com.pinnoocle.weshare.bean.TopCatBean;
import com.pinnoocle.weshare.bean.UserInfoBean;
import com.pinnoocle.weshare.bean.UserPointLogBean;
import com.pinnoocle.weshare.bean.UserShipBean;

import java.util.Map;

import okhttp3.ResponseBody;
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
    public void getProductInfo(Map<String, String> queryMap, getCallback callback) {
        Observable<ResponseBody> observable = RetrofitHelper.getInstance(mContext).getServer().getProductInfo(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(ResponseBody s) { // 请求成功
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

    @Override
    public void personalCenter(Map<String, String> queryMap, getCallback callback) {
        Observable<PersonalCenterBean> observable = RetrofitHelper.getInstance(mContext).getServer().personalCenter(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PersonalCenterBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(PersonalCenterBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void shoppingCartList(Map<String, String> queryMap, getCallback callback) {
        Observable<ShoppingCartListBean> observable = RetrofitHelper.getInstance(mContext).getServer().shoppingCartList(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShoppingCartListBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(ShoppingCartListBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void deleteCart(Map<String, String> queryMap, getCallback callback) {
        Observable<DeleteCartBean> observable = RetrofitHelper.getInstance(mContext).getServer().deleteCart(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DeleteCartBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(DeleteCartBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void getUserShip(Map<String, String> queryMap, getCallback callback) {
        Observable<UserShipBean> observable = RetrofitHelper.getInstance(mContext).getServer().getUserShip(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserShipBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(UserShipBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void saveUserShip(Map<String, String> queryMap, getCallback callback) {
        Observable<SaveUserShipBean> observable = RetrofitHelper.getInstance(mContext).getServer().saveUserShip(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SaveUserShipBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(SaveUserShipBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void addCart(Map<String, String> queryMap, getCallback callback) {
        Observable<AddCartBean> observable = RetrofitHelper.getInstance(mContext).getServer().addCart(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AddCartBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(AddCartBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void setDefShip(Map<String, String> queryMap, getCallback callback) {
        Observable<SetDefShipBean> observable = RetrofitHelper.getInstance(mContext).getServer().setDefShip(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SetDefShipBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(SetDefShipBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void removeShip(Map<String, String> queryMap, getCallback callback) {
        Observable<RemoveShipBean> observable = RetrofitHelper.getInstance(mContext).getServer().removeShip(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RemoveShipBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(RemoveShipBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void getAreaId(Map<String, String> queryMap, getCallback callback) {
        Observable<GetAreaIdBean> observable = RetrofitHelper.getInstance(mContext).getServer().getAreaId(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GetAreaIdBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(GetAreaIdBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void getOrderStatusNum(Map<String, String> queryMap, getCallback callback) {
        Observable<OrderStatusNumBean> observable = RetrofitHelper.getInstance(mContext).getServer().getOrderStatusNum(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OrderStatusNumBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(OrderStatusNumBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void UserPointLog(Map<String, String> queryMap, getCallback callback) {
        Observable<UserPointLogBean> observable = RetrofitHelper.getInstance(mContext).getServer().UserPointLog(queryMap);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserPointLogBean>() {
                    @Override
                    public void onCompleted() { // 完成请求后

                    }

                    @Override
                    public void onError(Throwable e) { // 异常处理
                        callback.onFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(UserPointLogBean s) { // 请求成功
                        callback.onSuccess(s);
                    }
                });
    }

    @Override
    public void getGoodsList(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<GoodsBean> observable = RetrofitHelper.getInstance(mContext).getServer().getGoodsList(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<GoodsBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(GoodsBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void getTopCat(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<TopCatBean> observable = RetrofitHelper.getInstance(mContext).getServer().getTopCat(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<TopCatBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(TopCatBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void getChildCat(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<ChildCatBean> observable = RetrofitHelper.getInstance(mContext).getServer().getChildCat(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<ChildCatBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(ChildCatBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void getUserInfo(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<UserInfoBean> observable = RetrofitHelper.getInstance(mContext).getServer().getUserInfo(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<UserInfoBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(UserInfoBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void getOrderList(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<OrderBean> observable = RetrofitHelper.getInstance(mContext).getServer().getOrderList(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<OrderBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(OrderBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void orderDetails(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<OrderDetailsBean> observable = RetrofitHelper.getInstance(mContext).getServer().orderDetails(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<OrderDetailsBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(OrderDetailsBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }

    @Override
    public void wxLogin(Map<String, String> queryMap, getCallback callback) {
        {
            Observable<UserLoginBean> observable = RetrofitHelper.getInstance(mContext).getServer().wxLogin(queryMap);
            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<UserLoginBean>() {
                        @Override
                        public void onCompleted() { // 完成请求后

                        }

                        @Override
                        public void onError(Throwable e) { // 异常处理
                            callback.onFailure(e.getMessage());
                        }

                        @Override
                        public void onNext(UserLoginBean s) { // 请求成功
                            callback.onSuccess(s);
                        }
                    });
        }
    }


    private static class Laydz {
        private static RemotDataSourceImpl instance = new RemotDataSourceImpl();
    }


    public static RemotDataSourceImpl getInstance(Context context) {
        mContext = context;
        return Laydz.instance;
    }
}
