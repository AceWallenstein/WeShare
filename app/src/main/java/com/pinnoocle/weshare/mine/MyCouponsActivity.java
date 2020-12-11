package com.pinnoocle.weshare.mine;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.ButterKnife;
/*
我的优惠券
 */
public class MyCouponsActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_my_coupons);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }
}
