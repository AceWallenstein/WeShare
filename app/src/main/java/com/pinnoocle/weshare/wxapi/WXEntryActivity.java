package com.pinnoocle.weshare.wxapi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.MainActivity;
import com.pinnoocle.weshare.MyApp;
import com.pinnoocle.weshare.bean.UserLoginBean;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.HttpUtils;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class WXEntryActivity extends AppCompatActivity implements IWXAPIEventHandler {
    private static final int RETURN_MSG_TYPE_LOGIN = 1;
    private static final int RETURN_MSG_TYPE_SHARE = 2;
    private IWXAPI api;
    private DataRepository dataRepository;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //如果没回调onResp，八成是这句没有写
        api = WXAPIFactory.createWXAPI(this, MyApp.WX_APPID);
        api.handleIntent(getIntent(), this);    // 这一句报错
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        setIntent(intent);
        api.handleIntent(intent, this);
    }

    // 微信发送请求到第三方应用时，会回调到该方法
    @Override
    public void onReq(BaseReq req) {
    }

    // 第三方应用发送到微信的请求处理后的响应结果，会回调到该方法
    //app发送消息给微信，处理返回消息的回调
    @Override
    public void onResp(BaseResp resp) {
        switch (resp.errCode) {

            case BaseResp.ErrCode.ERR_AUTH_DENIED:
            case BaseResp.ErrCode.ERR_USER_CANCEL:
                if (RETURN_MSG_TYPE_SHARE == resp.getType()) ToastUtils.showToast("分享失败");
                else ToastUtils.showToast("登录失败");
                break;
            case BaseResp.ErrCode.ERR_OK:
                switch (resp.getType()) {
                    case RETURN_MSG_TYPE_LOGIN:
                        //拿到了微信返回的code,立马再去请求access_token
                        String code = ((SendAuth.Resp) resp).code;
                        FastData.setWxCode(code);
//                        getAccessToken();
                        //就在这个地方，用网络库什么的或者自己封的网络api，发请求去咯，注意是get请求
                        dataRepository = Injection.dataRepository(this);
                        wxLogin(code);
                        break;

                    case RETURN_MSG_TYPE_SHARE:
                        ToastUtils.showToast("微信分享成功");
                        finish();
                        break;
                }
                break;
        }
    }

    private void wxLogin(String code) {
        Map<String, String> map = new HashMap<>();
        map.put("method", "user.applogin");
        map.put("site_token", "123456");
        map.put("code", code);
        dataRepository.wxLogin(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                String string = info;
            }

            @Override
            public void onSuccess(Object data) {
                UserLoginBean userLoginBean = (UserLoginBean) data;
                if (userLoginBean.isStatus()) {
                    String token = userLoginBean.getData().getToken();
                    FastData.setToken(token);
                    ActivityUtils.startActivityAndFinish(WXEntryActivity.this, MainActivity.class);
                }


            }

        });
    }

}