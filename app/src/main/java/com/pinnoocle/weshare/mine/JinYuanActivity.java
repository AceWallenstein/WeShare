package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
可用余额
 */
public class JinYuanActivity extends BaseActivity {
    @BindView(R.id.go_back)
    ImageView goBack;
    @BindView(R.id.my_jinyuan_money)
    TextView myJinyuanMoney;
    @BindView(R.id.immediate_withdrawal)
    TextView immediateWithdrawal;
    @BindView(R.id.rl_earn_jinyuan)
    RelativeLayout rlEarnJinyuan;
    @BindView(R.id.rl_income_detail)
    RelativeLayout rlIncomeDetail;

    protected void onCreate(Bundle savedInstanceState) {
        //        initTransparent();
        setThisStatusBarColor(R.drawable.gradient_color_jinyuan);
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_jinyuan);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick({R.id.go_back, R.id.immediate_withdrawal, R.id.rl_earn_jinyuan, R.id.rl_income_detail})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.go_back:
                finish();
                break;
            case R.id.immediate_withdrawal:
                break;
            case R.id.rl_earn_jinyuan:
                ActivityUtils.startActivity(this, SignInActivity.class);
                break;
            case R.id.rl_income_detail:
                ActivityUtils.startActivity(this, JinYuanDetailActivity.class);
                break;
        }
    }
}
