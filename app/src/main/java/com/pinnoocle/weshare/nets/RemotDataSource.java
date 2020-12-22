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

    void spec(Map<String, String> queryMap, getCallback callback);

    void goodsEvaluation(Map<String, String> queryMap, getCallback callback);

    void personalCenter(Map<String, String> queryMap, getCallback callback);

    void shoppingCartList(Map<String, String> queryMap, getCallback callback);

    void deleteCart(Map<String, String> queryMap, getCallback callback);

    void getUserShip(Map<String, String> queryMap, getCallback callback);

    void saveUserShip(Map<String, String> queryMap, getCallback callback);

    void addCart(Map<String, String> queryMap, getCallback callback);

}
