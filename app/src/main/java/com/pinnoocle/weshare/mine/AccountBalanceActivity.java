package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import butterknife.ButterKnife;

public class AccountBalanceActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_account_balance);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
