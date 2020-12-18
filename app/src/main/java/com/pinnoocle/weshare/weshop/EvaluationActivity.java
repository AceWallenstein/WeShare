package com.pinnoocle.weshare.weshop;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.androidkun.xtablayout.XTabLayout;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.FragmentAdapter;
import com.pinnoocle.weshare.bean.EvaluationBean;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EvaluationActivity extends BaseActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.xTablayout)
    XTabLayout xTablayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private List<Fragment> fragments = new ArrayList<>();
    private DataRepository dataRepository;
    private int page;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {

    }


    private void initSubView(EvaluationBean.DataBean data) {
        List<String> titles = new ArrayList<>();
        titles.add("全部(3)");
        titles.add("好评(3)");
        titles.add("中评(0)");
        titles.add("差评(0)");
        for (int i = 0; i < titles.size(); i++) {
            fragments.add(new AppraiseFragment(titles.get(i)));
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

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        goodsEvaluation();
    }

    private void goodsEvaluation() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", Constants.token);
        map.put("method", "goods.getgoodscomment");
        map.put("goods_id", getIntent().getStringExtra(Constants.GOODS_ID));
        map.put("page", page + "");
        map.put("limit", "2");
        dataRepository.goodsEvaluation(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(EvaluationActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(EvaluationActivity.this);
                EvaluationBean evaluationBean = (EvaluationBean) data;
                if (evaluationBean.isStatus()) {
                    initSubView(evaluationBean.getData());
                }
            }
        });

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