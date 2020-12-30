package com.pinnoocle.weshare;

import android.app.Application;
import android.content.Context;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class MyApp extends Application {
    private static Application sContext;
    public static final String WX_APPID = "wxc6b50a63ba0ca8f9";
    public static final String WX_APPSecret = "6d41418578edf90b0b191fb7c0a7624d";

    public static IWXAPI mWxApi;

    public static Context getInstanse() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        ToastUtils.init(this);
        FastData.getInstance();
        mWxApi = WXAPIFactory.createWXAPI(this, WX_APPID, true);
        mWxApi.registerApp(WX_APPID);
    }
}
