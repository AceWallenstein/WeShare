package com.pinnoocle.weshare.mine;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.GridOrderAdapter;
import com.pinnoocle.weshare.widget.RoundImageView;
import com.pinnoocle.weshare.widget.TagsGridView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MineFragment extends Fragment {

    @BindView(R.id.iv_head)
    RoundImageView ivHead;
    @BindView(R.id.tv_nickname)
    TextView tvNickname;
    @BindView(R.id.tv_modification_personal_data)
    TextView tvModificationPersonalData;
    @BindView(R.id.tv_identification)
    TextView tvIdentification;
    @BindView(R.id.gridView)
    TagsGridView gridView;
    @BindView(R.id.grid_my_service)
    TagsGridView gridMyService;
    private Unbinder unbinder;

    private int[] icon = {R.mipmap.to_be_paid, R.mipmap.ready_for_shipment, R.mipmap.to_be_received, R.mipmap.flash_sale,
            R.mipmap.flash_sale};
    private String[] iconName = {"待付款", "待发货", "待收货", "团抢订单", "抽奖订单"};
    private SimpleAdapter sim_adapter;
    private ArrayList<Map<String, Object>> data_list;

    private int[] serviceIcon = {R.mipmap.mark, R.mipmap.shopping_cart_full, R.mipmap.qr_code, R.mipmap.recharge_account,
            R.mipmap.suggestions, R.mipmap.invite_friends, R.mipmap.address, R.mipmap.lucky_draw_records};
    private String[] serviceIconName = {"收藏", "购物车", "邀请推广", "账户明细", "建议", "朋友圈", "收货地址", "抽奖记录"};
    private ArrayList<Map<String, Object>> serviceDataList;
    private GridOrderAdapter gridOrderAdapter;
        private int num = 199;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        grid();
        gridMyService();
    }


    private void grid() {
        data_list = new ArrayList<>();
        //获取数据
        getData();
        //新建适配器
//        String[] from = {"image", "text"};
//        int[] to = {R.id.image, R.id.text};
//        sim_adapter = new SimpleAdapter(getContext(), data_list, R.layout.grid_item_order, from, to);
        //配置适配器
        gridOrderAdapter = new GridOrderAdapter(getActivity(), data_list, num);
        gridView.setAdapter(gridOrderAdapter);
        gridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }

    public List<Map<String, Object>> getData() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }
        return data_list;
    }

    private void gridMyService() {
        serviceDataList = new ArrayList<>();
        //获取数据
        getServiceData();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter = new SimpleAdapter(getContext(), serviceDataList, R.layout.gird_item_service, from, to);
        //配置适配器
        gridMyService.setAdapter(sim_adapter);
        gridMyService.setSelector(new ColorDrawable(Color.TRANSPARENT));
    }

    public List<Map<String, Object>> getServiceData() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < serviceIcon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", serviceIcon[i]);
            map.put("text", serviceIconName[i]);
            serviceDataList.add(map);
        }
        return serviceDataList;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


    @OnClick(R.id.tv_modification_personal_data)
    public void onViewClicked() {
    }
}
