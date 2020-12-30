package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.OrderAdapter;
import com.pinnoocle.weshare.bean.OrderBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.GoodsSearchEvent;
import com.pinnoocle.weshare.event.OrderSearchEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class OrderFragment extends Fragment implements OnRefreshLoadMoreListener {
    RecyclerView recycleView;
    //    private DataRepository dataRepository;
    SmartRefreshLayout refresh;
    private int page = 1;
    private OrderAdapter orderAdapter;
    private List<OrderBean.DataBean.ListBean> dataBeanList = new ArrayList<>();
    private Unbinder unbinder;
    private String type;
    private DataRepository dataRepository;
    private String keywords = "";

    public static OrderFragment newInstance(String type) {

        Bundle args = new Bundle();
        args.putString("type", type);
        OrderFragment fragment = new OrderFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            type = getArguments().getString("type");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_order, container, false);
        unbinder = ButterKnife.bind(this, v);
        initView(v);
        initData();
        return v;
    }


        /*
     titles.add("全部");
        titles.add("待付款");
        titles.add("待发货");
        titles.add("待收货");
        titles.add("待评价");
        titles.add("团购订单");
     */

    private void initView(View v) {
        recycleView = v.findViewById(R.id.recycleView);
        refresh = v.findViewById(R.id.refresh);
//        dataRepository = Injection.dataRepository(getContext());
        recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        orderAdapter = new OrderAdapter(getContext());
//        orderAdapter.setData(list);
        recycleView.setAdapter(orderAdapter);
        orderAdapter.setmOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<OrderBean.DataBean.ListBean>() {
            @Override
            public void onItemViewClick(View view, int position, OrderBean.DataBean.ListBean o) {
                Intent intent = new Intent(getActivity(), OrderDetailsActivity.class);
                intent.putExtra(Constants.ORDER_ID, o.getOrder_id());
                startActivity(intent);
            }
        });
        refresh.setOnRefreshLoadMoreListener(this);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
        order();
    }

    private void order() {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "order.getorderlist");
        map.put("site_token", "123456");
        map.put("is_tqm", "1");
        map.put("keywords", keywords);
        map.put("status", type);
        dataRepository.getOrderList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
                refresh.finishRefresh();
                refresh.finishLoadMore();
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                refresh.finishRefresh();
                OrderBean orderBean = (OrderBean) data;
//                if (orderBean.isStatus()) {
//                    if (orderBean.getData().getList().getCurrent_page() == orderBean.getData().getList().getLast_page()) {
//                        refresh.finishLoadMoreWithNoMoreData();
//                    } else {
//                        refresh.finishLoadMore();
//                    }
                dataBeanList.addAll(orderBean.getData().getList());
                orderAdapter.setData(dataBeanList);
            }

        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(OrderSearchEvent event) {
        keywords = event.getSearchName();
        dataBeanList.clear();
        order();
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

//    @Override
//    public void onItemViewClick(View view, int position) {
//        Intent intent = new Intent(getActivity(), OrderDetailsActivity.class);
//        intent.putExtra("type",type);
////        intent.putExtra("order_id", dataBeanList.get(position).getOrder_id() + "");
//        startActivity(intent);
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}