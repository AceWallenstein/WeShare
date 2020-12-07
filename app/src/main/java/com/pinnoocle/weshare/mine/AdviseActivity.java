package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import butterknife.ButterKnife;

public class AdviseActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_advise);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
