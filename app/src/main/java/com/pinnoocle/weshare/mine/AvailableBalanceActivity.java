package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.ButterKnife;

/*
可用余额
 */
public class AvailableBalanceActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
//        initTransparent();
        setThisStatusBarColor(R.drawable.gradient_color);
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_available_balance);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
