package com.pinnoocle.weshare.weshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.GoodsAdapter;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/*
商品列表
 */
public class GoodsListFragment extends Fragment implements OnRefreshLoadMoreListener, BaseAdapter.OnItemClickListener {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private Unbinder unbinder;
    private int page = 1;
    private GoodsAdapter goodsAdapter;
    private List<GoodsBean> list;
    private List<GoodsBean> mDatas = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_goods_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }


    private void initView() {
        goodsAdapter = new GoodsAdapter(getContext());
        list = new ArrayList<>();
        recycleView.setAdapter(goodsAdapter);
        recycleView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        refresh.setOnRefreshLoadMoreListener(this);
        goodsAdapter.setOnItemClickListener(this);
    }

    private void initData() {
        GoodsBean goodsBean = new GoodsBean("居家日用百货 任选5款blablablablablabla...", "14.50", "15.51", "", "172");
        for (int i = 0; i < 10 ; i++) {
            list.add(goodsBean);
        }
        mDatas.addAll(list);
        goodsAdapter.setData(mDatas);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        initData();
        if (page > 3) {
            refresh.finishLoadMoreWithNoMoreData();
        }else {
            refresh.finishLoadMore();
        }
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        mDatas.clear();
        initData();
        refresh.finishRefresh();
    }

    @Override
    public void onItemViewClick(View view, int position) {
        Intent intent = new Intent();
        ActivityUtils.startActivity(getContext(),GoodsDetailActivity.class);
    }
}
