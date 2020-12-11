package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.AddressAdapter;
import com.pinnoocle.weshare.bean.AddressBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddressActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tv_add_address)
    TextView tvAddAddress;
    private AddressAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_addresss);
        ButterKnife.bind(this);
        initView();
        initData();
    }



    private void initView() {
        adapter = new AddressAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    private void initData() {
        AddressBean addressBean = new AddressBean("xiaoxiao", "12113451234", "天安门广场");
        List<AddressBean> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(addressBean);
        }
        adapter.setData(list);
    }

    @OnClick({R.id.iv_back, R.id.tv_add_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_add_address:
                ActivityUtils.startActivity(this,AddAddressActivity.class);
                break;
        }
    }
}
