package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.FragmentAdapter;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;


import java.util.ArrayList;
import java.util.List;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        List<String> titles = new ArrayList<>();
        titles.add("全部");
        titles.add("待付款");
        titles.add("待发货");
        titles.add("待收货");
        titles.add("待评价");
        titles.add("团购订单");
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(OrderFragment.newInstance(titles.get(i)));
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
            tvTabTitle.setText(titles.get(i));
            if(i==0){
                tvTabTitle.setTextColor(getResources().getColor(R.color.juice));
            }else {
                tvTabTitle.setTextColor(getResources().getColor(R.color.light_black));
            }
        }
        xTablayout.addOnTabSelectedListener(new MyTabSelectedListener());
        int type = getIntent().getIntExtra("type", 0);
        viewPager.setCurrentItem(type);
        xTablayout.getTabAt(type).select();

    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
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