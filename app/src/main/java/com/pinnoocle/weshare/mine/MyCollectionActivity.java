package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.CollectionAdapter;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
我的收藏
 */
public class MyCollectionActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private CollectionAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_my_collection);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
        adapter = new CollectionAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        GoodsBean goodsBean = new GoodsBean("轻熟风chic树莓色垂感先手首要系带翻领双排扣过膝风衣外套女", "14.50", "15.51", "", "172", "120");
        List<GoodsBean> list = new ArrayList<>();
        list.add(goodsBean);
        list.add(goodsBean);
        list.add(goodsBean);
        list.add(goodsBean);
        adapter.setData(list);
    }


    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }
}
