package com.pinnoocle.weshare.weshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.AppraiseAdapter;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class AppraiseFragment extends Fragment implements OnRefreshLoadMoreListener, BaseAdapter.OnItemClickListener {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private Unbinder unbinder;
    private int page = 1;
    private AppraiseAdapter appraiseAdapter;
    private List<GoodsBean> list;
    private List<GoodsBean> mDatas = new ArrayList<>();
    private String type;

    public AppraiseFragment(String type) {
        this.type = type;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appraise, container, false);
        unbinder = ButterKnife.bind(this, view);
        if (type.equals("全部(3)") || type.equals("好评(3)"))
            initView();
        initData();
        return view;
    }


    private void initView() {
        appraiseAdapter = new AppraiseAdapter(getContext());
        list = new ArrayList<>();
        recycleView.setAdapter(appraiseAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        refresh.setOnRefreshLoadMoreListener(this);
        appraiseAdapter.setOnItemClickListener(this);
    }

    private void initData() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        refresh.finishLoadMoreWithNoMoreData();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        refresh.finishRefresh();
    }

    @Override
    public void onItemViewClick(View view, int position) {

    }

}
