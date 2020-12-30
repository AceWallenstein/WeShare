package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.FragmentAdapter;
import com.pinnoocle.weshare.bean.OrderStatusNumBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.Type;
import com.pinnoocle.weshare.event.GoodsSearchEvent;
import com.pinnoocle.weshare.event.OrderSearchEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    List<Fragment> fragments = new ArrayList<>();
    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.tv_search)
    TextView tvSearch;
    private DataRepository dataRepository;
    private List<Integer> orderStatusNums;
    private List<Integer> orderTypes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
//        initTabLayout();
        initOrderTypes();
    }

    private void initOrderTypes() {
        orderTypes.add(Type.All);
        orderTypes.add(Type.Payment);
        orderTypes.add(Type.Delivery);
        orderTypes.add(Type.Received);
        orderTypes.add(Type.Comment);
        orderTypes.add(Type.AfterSale);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        getOrderStatusNum();
    }

    private void getOrderStatusNum() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "order.getorderstatusnum");
        map.put("site_token", "123456");
        map.put("is_tqm", 1 + "");// 1 表示普通订单 ,2 团购订单
        dataRepository.getOrderStatusNum(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(OrderActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(OrderActivity.this);
                orderStatusNums = new ArrayList<>();
                OrderStatusNumBean saveUserShipBean = (OrderStatusNumBean) data;
                if (saveUserShipBean.isStatus()) {
                    orderStatusNums.add(saveUserShipBean.getData().get_$1()); //待付款
                    orderStatusNums.add(saveUserShipBean.getData().get_$2()); //待发货
                    orderStatusNums.add(saveUserShipBean.getData().get_$3()); //待收货
                    orderStatusNums.add(saveUserShipBean.getData().get_$4()); // 完成
                    orderStatusNums.add(saveUserShipBean.getData().getIsAfterSale()); //售后
                    initTabLayout();
                }


            }
        });
    }

    private void initTabLayout() {
        List<String> titles = new ArrayList<>();
        titles.add("全部");
        titles.add("待付款");
        titles.add("待发货");
        titles.add("待收货");
        titles.add("待评价");
        titles.add("售后");
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(OrderFragment.newInstance(orderTypes.get(i) + ""));
        }
        FragmentAdapter adatper = new FragmentAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(6);
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);
        for (int i = 0; i < xTablayout.getTabCount(); i++) {
            XTabLayout.Tab tab = xTablayout.getTabAt(i);
            tab.setCustomView(R.layout.item_tab_layout);
            TextView tvTabTitle = tab.getCustomView().findViewById(R.id.tvTabTitle);
            TextView tabRed = tab.getCustomView().findViewById(R.id.tabRed);
            if (i > 0) {
                int j = i - 1;
                if (orderStatusNums.get(j) > 0) {
                    tabRed.setText(orderStatusNums.get(j) + "");
                    tabRed.setVisibility(View.VISIBLE);
                }
            }
            tvTabTitle.setText(titles.get(i));
            if (i == 0) {
                tvTabTitle.setTextColor(getResources().getColor(R.color.juice));
            } else {
                tvTabTitle.setTextColor(getResources().getColor(R.color.light_black));
            }
        }
        xTablayout.addOnTabSelectedListener(new MyTabSelectedListener());
        int type = getIntent().getIntExtra("type", 0);
        viewPager.setCurrentItem(type);
        xTablayout.getTabAt(type).select();
    }


    @OnClick({R.id.iv_back, R.id.tv_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_search:
                search();
                break;
        }
    }

    private void search() {
        if (edSearch.getText().toString().equals("")) {
            ToastUtils.showToast("搜索内容不能为空");
        } else {
            String searchName = edSearch.getText().toString();
            EventBus.getDefault().post(new OrderSearchEvent(searchName));
        }
    }

    class MyTabSelectedListener implements XTabLayout.OnTabSelectedListener {
        @Override
        public void onTabSelected(XTabLayout.Tab tab) {
            int position = tab.getPosition();

            /**在这里记录TabLayout选中后内容更新已读标记**/

            View customView = tab.getCustomView();
            customView.findViewById(R.id.tabRed).setVisibility(View.GONE);
            TextView textView = (TextView) customView.findViewById(R.id.tvTabTitle);
            textView.setTextColor(getResources().getColor(R.color.juice));
        }

        @Override
        public void onTabUnselected(XTabLayout.Tab tab) {
            View customView = tab.getCustomView();
            TextView textView = (TextView) customView.findViewById(R.id.tvTabTitle);
            textView.setTextColor(getResources().getColor(R.color.light_black));
        }

        @Override
        public void onTabReselected(XTabLayout.Tab tab) {

        }
    }

}