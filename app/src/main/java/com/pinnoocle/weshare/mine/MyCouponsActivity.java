package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
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

/*
我的优惠券
 */
public class MyCouponsActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private List<Fragment> fragments = new ArrayList<>();
    private String[] type = new String[]{"","no_used","yes_used","invalid"};

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_my_coupons);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        initTabLayout();
    }

    private void initTabLayout() {
        List<String> titles = new ArrayList<>();
        titles.add("全部");
        titles.add("未使用");
        titles.add("已使用");
        titles.add("已过期/失效");
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(new MyCouponsFragment(type[i]));
        }
        FragmentAdapter adatper = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adatper);
        viewPager.setOffscreenPageLimit(4);
        //将TabLayout和ViewPager关联起来。
        xTablayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(0);
        xTablayout.getTabAt(0).select();
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
    }
}
