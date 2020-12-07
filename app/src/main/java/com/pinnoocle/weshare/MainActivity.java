package com.pinnoocle.weshare;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.adapter.MainAdapter;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.message.MessageFragment;
import com.pinnoocle.weshare.mine.MineFragment;
import com.pinnoocle.weshare.utils.StatusBarUtil;
import com.pinnoocle.weshare.weshop.WeShopFragment;
import com.pinnoocle.weshare.widget.NoScrollViewPager;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener, ViewPager.OnPageChangeListener {
    BottomNavigationBar bottomNavigationBar;
    BadgeItem badgeItem;
    NoScrollViewPager viewPager;
    private List<Fragment> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNavigationBar();
        initViewPager();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String message) {
        if (message.equals("1")) {
         viewPager.setCurrentItem(0);
        }
    }

    private void initViewPager() {
        mList = new ArrayList<>();
        mList.add(new WeShopFragment());
        mList.add(new MessageFragment());
        mList.add(new MineFragment());


        viewPager = findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(mList.size());
        viewPager.setOnPageChangeListener(this);
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager(), mList);
        viewPager.setAdapter(mainAdapter); //视图加载适配器
        viewPager.setNoScroll(true);
    }


    private void initBottomNavigationBar() {
        bottomNavigationBar = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.setTabSelectedListener(this);
        badgeItem = new BadgeItem().setBackgroundColor(Color.RED).setText("99");
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
//        bottomNavigationBar.setBarBackgroundColor(R.color.gray);
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.we_shop_unselect, "你我商城").setActiveColorResource(R.color.juice).setInActiveColorResource(R.color.grey))
                .addItem(new BottomNavigationItem(R.mipmap.message_unselect
                        , "消息").setActiveColorResource(R.color.juice).setInActiveColorResource(R.color.grey).setBadgeItem(badgeItem))
                .addItem(new BottomNavigationItem(R.mipmap.mine_unselect, "个人中心").setActiveColorResource(R.color.juice).setInActiveColorResource(R.color.grey))
                .setFirstSelectedPosition(0)
                .initialise();
    }

    @Override
    public void onTabSelected(int position) {
        viewPager.setCurrentItem(position, false);
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (position == 0) {
            initTransparent();
        } else if (position == 1) {
            initTransparent();
        } else {
            initJuice();
        }
        StatusBarUtil.StatusBarLightMode(this);
        bottomNavigationBar.selectTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    /**
     * 手机返回键监听
     */
    long firstTime = 0;

    @Override
    public void onBackPressed() {
        long secondTime = System.currentTimeMillis();
        if (secondTime - firstTime > 800) { // 两次点击间隔大于800毫秒，不退出
            ToastUtils.showToast("再按一次退出程序");
            firstTime = secondTime; // 更新firstTime
        } else {
            finish();
        }
    }
}
