package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.widget.ImageView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
建议
 */
public class AdviseActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_advise);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }
}
