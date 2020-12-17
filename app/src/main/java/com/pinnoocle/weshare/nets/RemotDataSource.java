package com.pinnoocle.weshare.nets;

import java.util.Map;

import okhttp3.MultipartBody;

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

}
