package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import butterknife.ButterKnife;

public class AvailableBalanceActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_available_balance);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
