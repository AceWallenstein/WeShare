package com.pinnoocle.weshare.nets;

import com.pinnoocle.weshare.bean.EvaluationBean;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by whs on 2017/6/7
 */

public interface RemotDataSource {
    interface getCallback {

        void onFailure(String info);

        void onSuccess(Object data);
    }

    void login(Map<String, String> queryMap, getCallback callback);

    void homePage(Map<String, String> queryMap, getCallback callback);

    void recommend(Map<String, String> queryMap, getCallback callback);

    void goodsDetail(Map<String, String> queryMap, getCallback callback);

    void getProductInfo(Map<String, String> queryMap, getCallback callback);

    void goodsEvaluation(Map<String, String> queryMap, getCallback callback);

    void personalCenter(Map<String, String> queryMap, getCallback callback);

    void shoppingCartList(Map<String, String> queryMap, getCallback callback);

    void deleteCart(Map<String, String> queryMap, getCallback callback);

    void getUserShip(Map<String, String> queryMap, getCallback callback);

    void saveUserShip(Map<String, String> queryMap, getCallback callback);

    void addCart(Map<String, String> queryMap, getCallback callback);

    void setDefShip(Map<String, String> queryMap, getCallback callback);

    void removeShip(Map<String, String> queryMap, getCallback callback);

    void getAreaId(Map<String, String> queryMap, getCallback callback);

    void getOrderStatusNum(Map<String, String> queryMap, getCallback callback);

    void UserPointLog(Map<String, String> queryMap, getCallback callback);

    void getGoodsList(Map<String, String> queryMap, getCallback callback);

    void getTopCat(Map<String, String> queryMap, getCallback callback);

    void getChildCat(Map<String, String> queryMap, getCallback callback);

    void getUserInfo(Map<String, String> queryMap, getCallback callback);

    void getOrderList(Map<String, String> queryMap, getCallback callback);

    void orderDetails(Map<String, String> queryMap, getCallback callback);
    void wxLogin(Map<String, String> queryMap, getCallback callback);

}
