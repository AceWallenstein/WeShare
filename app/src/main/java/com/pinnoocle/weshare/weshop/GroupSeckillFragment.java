package com.pinnoocle.weshare.weshop;

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
import com.pinnoocle.weshare.adapter.GroupSeckillAdapter;
import com.pinnoocle.weshare.adapter.OrderAdapter;
import com.pinnoocle.weshare.mine.OrderDetailsActivity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class GroupSeckillFragment extends Fragment implements OnRefreshLoadMoreListener, OrderAdapter.OnItemClickListener {
    RecyclerView recycleView;
    //    private DataRepository dataRepository;
    SmartRefreshLayout refresh;
    private int page = 1;
    private GroupSeckillAdapter groupSeckillAdapter;
    private List<String> dataBeanList = new ArrayList<>();
    private Unbinder unbinder;
    private String type;

    public static GroupSeckillFragment newInstance(String type) {

        Bundle args = new Bundle();
        args.putString("type",type);
        GroupSeckillFragment fragment = new GroupSeckillFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null)
        {
            type = getArguments().getString("type");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_group_seckill, container, false);
        unbinder = ButterKnife.bind(this, v);
        initView(v);
        return v;
    }

    private void initView(View v) {
        recycleView = v.findViewById(R.id.recycleView);
        refresh = v.findViewById(R.id.refresh);
//        dataRepository = Injection.dataRepository(getContext());
        recycleView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        groupSeckillAdapter = new GroupSeckillAdapter(getContext());
        recycleView.setAdapter(groupSeckillAdapter);
        groupSeckillAdapter.setOnItemClickListener(this);

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

    @Override
    public void onItemViewClick(View view, int position) {
//        intent.putExtra("order_id", dataBeanList.get(position).getOrder_id() + "");
//        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}