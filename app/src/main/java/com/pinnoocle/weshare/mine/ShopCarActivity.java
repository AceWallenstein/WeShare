package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ShopCarItemAdapter;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
购物车
 */
public class ShopCarActivity extends BaseActivity {
    @BindView(R.id.go_home)
    ImageView goHome;
    @BindView(R.id.tv_all_select)
    TextView tvAllSelect;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.checkbox)
    CheckBox checkbox;
    @BindView(R.id.ll_all_select)
    LinearLayout llAllSelect;
    @BindView(R.id.tv_settlement)
    TextView tvSettlement;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_shop_car);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        ShopCarItemAdapter adapter = new ShopCarItemAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    /*
    返回首页
     */
    @OnClick(R.id.go_home)
    public void onViewClicked() {
        EventBus.getDefault().post("1");
        finish();
    }

    @OnClick({R.id.tv_all_select, R.id.tv_cancel, R.id.ll_all_select,R.id.tv_settlement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_all_select:
                break;
            case R.id.tv_cancel:
                break;
            case R.id.ll_all_select:
                break;
            case R.id.tv_settlement:
                ActivityUtils.startActivity(this,OrderConfirmActivity.class);
                break;
        }
    }
}
