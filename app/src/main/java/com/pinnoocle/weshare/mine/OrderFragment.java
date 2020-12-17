package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.OrderAdapter;
import com.pinnoocle.weshare.bean.OrderBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class OrderFragment extends Fragment implements OnRefreshLoadMoreListener {
    RecyclerView recycleView;
    //    private DataRepository dataRepository;
    SmartRefreshLayout refresh;
    private int page = 1;
    private OrderAdapter orderAdapter;
    private List<String> dataBeanList = new ArrayList<>();
    private Unbinder unbinder;
    private String type;

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
        List<OrderBean> list = new ArrayList<>();
        if (type.equals("全部")) {
            for (int i = 0; i < 4; i++) {
                list.add(new OrderBean(i));
            }
        } else if (type.equals("待付款")) {
            list.add(new OrderBean(1));
        } else if (type.equals("待发货")) {
            list.add(new OrderBean(2));
        } else if (type.equals("待收货")) {
            list.add(new OrderBean(0));
        } else if (type.equals("待评价")) {
            list.add(new OrderBean(3));
        } else if (type.equals("团购订单")) {
        }

        orderAdapter.setData(list);
        recycleView.setAdapter(orderAdapter);
        orderAdapter.setmOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<OrderBean>() {
            @Override
            public void onItemViewClick(View view, int position, OrderBean o) {
                int type = o.type;
                Intent intent = new Intent(getActivity(), OrderDetailsActivity.class);
                intent.putExtra("type", type);
////        intent.putExtra("order_id", dataBeanList.get(position).getOrder_id() + "");
                startActivity(intent);
            }
        });

//        order(page);
        refresh.setOnRefreshLoadMoreListener(this);
    }

//    private void order(int page) {
//        Map<String, String> map = new HashMap<>();
//        map.put("wxapp_id", FastData.getWxAppId());
//        map.put("shop_id", FastData.getShopId());
//        map.put("page", page + "");
//        map.put("status", "all");
//        dataRepository.orderList(map, new RemotDataSource.getCallback() {
//            @Override
//            public void onFailure(String info) {
//                refresh.finishRefresh();
//                refresh.finishLoadMore();
//            }
//
//            @Override
//            public void onSuccess(Object data) {
//                refresh.finishRefresh();
//                OrderBean orderBean = (OrderBean) data;
//                if (orderBean.getCode() == 1) {
//                    if (orderBean.getData().getList().getCurrent_page() == orderBean.getData().getList().getLast_page()) {
//                        refresh.finishLoadMoreWithNoMoreData();
//                    } else {
//                        refresh.finishLoadMore();
//                    }
//                    dataBeanList.addAll(orderBean.getData().getList().getData());
//                    orderAdapter.setData(dataBeanList);
//                }
//            }
//        });
//    }

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