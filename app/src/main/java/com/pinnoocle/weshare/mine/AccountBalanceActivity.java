package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import butterknife.ButterKnife;
/*
账户余额
 */
public class AccountBalanceActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        //        initTransparent();
        setThisStatusBarColor(R.drawable.gradient_color);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_account_balance);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
