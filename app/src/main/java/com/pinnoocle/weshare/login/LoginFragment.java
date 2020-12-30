package com.pinnoocle.weshare.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.MainActivity;
import com.pinnoocle.weshare.MyApp;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.UserLoginBean;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class LoginFragment extends Fragment {
    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.rl_login)
    RelativeLayout rlLogin;
    @BindView(R.id.tv_login2)
    TextView tvLogin2;
    private Unbinder unbinder;
    private IWXAPI api;
    private DataRepository dataRepository;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }



    private void initView() {

    }

    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.rl_login, R.id.tv_login2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_login:
                weChatAuth();
//                ActivityUtils.startActivityAndFinish(getActivity(), MainActivity.class);
                break;
            case R.id.tv_login2:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content, new OtherLoginFragment()).commit();
                break;
        }
    }

    private void weChatAuth() {
        if (!MyApp.mWxApi.isWXAppInstalled()) {
            ToastUtils.showToast("您还未安装微信客户端");
            return;
        }
        if (api == null) {
            api = WXAPIFactory.createWXAPI(getContext(), MyApp.WX_APPID, true);
        }
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "wx_login_duzun";
        api.sendReq(req);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
