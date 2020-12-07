package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.widget.ImageView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShoppingCarActivity extends BaseActivity {
    @BindView(R.id.go_home)
    ImageView goHome;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_shopping_car);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

    }

    @OnClick(R.id.go_home)
    public void onViewClicked() {
        EventBus.getDefault().post("1");
        finish();
    }
}
