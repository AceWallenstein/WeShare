package com.pinnoocle.weshare.weshop;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.FragmentTabAdapter;
import com.pinnoocle.weshare.common.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
商品列表
 */
public class GoodsListActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.tv_composite)
    TextView tvComposite;
    @BindView(R.id.rl_composite)
    RelativeLayout rlComposite;
    @BindView(R.id.tv_sales)
    TextView tvSales;
    @BindView(R.id.rl_sales)
    RelativeLayout rlSales;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(R.id.rl_price)
    RelativeLayout rlPrice;
    @BindView(R.id.tv_classification)
    TextView tvClassification;
    @BindView(R.id.rl_classification)
    RelativeLayout rlClassification;
    @BindView(R.id.content)
    FrameLayout content;
    private List<Fragment> fragments;
    private FragmentTabAdapter fragmentTabAdapter;
    private int currentPage;
    private TextView[] pageIds;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_goods_list);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        String title = getIntent().getStringExtra("title");
        tvTitle.setText(title);
        String type =title;
        fragments = new ArrayList<>();
        fragments.add(new GoodsListFragment(type));
        fragments.add(new GoodClassificationFragment());
        pageIds = new TextView[]{tvComposite, tvSales, tvPrice, tvClassification};
        fragmentTabAdapter = new FragmentTabAdapter(this, fragments, R.id.content);
        pageIds[0].setTextColor(getResources().getColor(R.color.juice));//设置选中第一页

    }

    private void switchPage(int page) {
        if (currentPage == page) {
            if (page == 0) {
                ToastUtils.showToast("综合");
            } else if (page == 1) {
                ToastUtils.showToast("销量");

            } else if (page == 2) {
                ToastUtils.showToast("价格");
            }

            return;
        }
        if (page < 3) {
            fragmentTabAdapter.setCurrentFragment(0);
        } else {
            fragmentTabAdapter.setCurrentFragment(1);
        }
        for (int i = 0; i < pageIds.length; i++) {
            if (i == page) {
                pageIds[i].setTextColor(getResources().getColor(R.color.juice));
            } else {
                pageIds[i].setTextColor(getResources().getColor(R.color.light_black3));
            }

        }
        currentPage = page;
    }


    @OnClick({R.id.iv_back, R.id.rl_composite, R.id.rl_sales, R.id.rl_price, R.id.rl_classification})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.rl_composite:
                switchPage(0);
                break;
            case R.id.rl_sales:
                switchPage(1);
                break;
            case R.id.rl_price:
                switchPage(2);
                break;
            case R.id.rl_classification:
                switchPage(3);
                break;
        }
    }
}
