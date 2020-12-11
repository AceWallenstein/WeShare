package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.ButterKnife;
/*
开通会员
 */
public class OpenMembershipActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_open_membership);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
