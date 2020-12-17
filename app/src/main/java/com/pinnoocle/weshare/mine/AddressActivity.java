package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.AddressAdapter;
import com.pinnoocle.weshare.bean.AddressBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import java.io.Serializable;
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
    private List<AddressBean> list;

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
        adapter.setmOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<AddressBean>() {
            @Override
            public void onItemViewClick(View view, int position, AddressBean addressBean) {
                if (getIntent().getStringExtra("from")!=null) {
                    Intent i = new Intent();
                    i.putExtra("addressBean", addressBean);
                    setResult(1, i);
                    finish();
                }
            }
        });
    }

    private void initData() {
        AddressBean addressBean = new AddressBean("筱筱", "155******77", "安徽省 合肥市 蜀山区 **街道 **路 **号 **大厦 **楼**号****");
        list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(addressBean);
        }
        adapter.setData(list);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && requestCode == 1) {
            Serializable serializable = data.getSerializableExtra("addressBean");
            AddressBean addressBean = (AddressBean) serializable;
            list.add(addressBean);
            adapter.setData(list);
        }
    }

    @OnClick({R.id.iv_back, R.id.tv_add_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_add_address:
                ActivityUtils.startActivityForResult(this, AddAddressActivity.class, 1);
                break;
        }

    }

}
