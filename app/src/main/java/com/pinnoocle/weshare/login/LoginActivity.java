package com.pinnoocle.weshare.login;

import android.os.Bundle;

import com.pinnoocle.weshare.MainActivity;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_login);
        ButterKnife.bind(this);
        initView();
        if(FastData.getToken()!=null){
            ActivityUtils.startActivityAndFinish(this, MainActivity.class);
        }
    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().replace(R.id.content,new LoginFragment()).commit();
    }
}

