package com.pinnoocle.weshare.nets;

import android.content.Context;

import java.util.Map;

/**
 * Created by whs on 2017/5/18
 */

public class DataRepository implements RemotDataSource {
    private Context mContext;

    private static DataRepository INSTANCE = null;


    private final RemotDataSourceImpl mRemoteDataSource;

    public static DataRepository getInstance(RemotDataSourceImpl remoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new DataRepository(remoteDataSource);
        }
        return INSTANCE;
    }

    private DataRepository(RemotDataSourceImpl remoteDataSource) {
        //this.mContext=context;
        this.mRemoteDataSource = remoteDataSource;
    }

    @Override
    public void login(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.login(queryMap, callback);
    }

    @Override
    public void homePage(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.homePage(queryMap, callback);
    }

    @Override
    public void recommend(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.recommend(queryMap, callback);

    }

    @Override
    public void goodsDetail(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.goodsDetail(queryMap, callback);
    }

    @Override
    public void spec(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.spec(queryMap, callback);

    }

    @Override
    public void goodsEvaluation(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.goodsEvaluation(queryMap, callback);

    }

    @Override
    public void personalCenter(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.personalCenter(queryMap, callback);
    }

    @Override
    public void shoppingCartList(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.shoppingCartList(queryMap, callback);

    }

    @Override
    public void deleteCart(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.deleteCart(queryMap, callback);

    }

    @Override
    public void getUserShip(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.getUserShip(queryMap, callback);

    }

    @Override
    public void saveUserShip(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.saveUserShip(queryMap, callback);

    }

    @Override
    public void addCart(Map<String, String> queryMap, getCallback callback) {
        mRemoteDataSource.addCart(queryMap, callback);
    }
}
