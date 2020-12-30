package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;

import com.pinnoocle.weshare.adapter.MyCouponsAdapter;
import com.pinnoocle.weshare.adapter.OrderAdapter;
import com.pinnoocle.weshare.bean.OrderBean;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyCouponsFragment extends Fragment  implements OnRefreshLoadMoreListener {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private String type;
    private int page = 1;
    private List<OrderBean.DataBean.ListBean> dataBeanList = new ArrayList<>();

    private Unbinder unbinder;
    private MyCouponsAdapter adapter;

    public MyCouponsFragment(String type) {
        this.type = type;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_coupons, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }


    private void initView() {
        recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new MyCouponsAdapter(getContext());
        recycleView.setAdapter(adapter);
        refresh.setOnRefreshLoadMoreListener(this);

    }

    private void initData() {

    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
//        order(page);
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
//        order(page);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
