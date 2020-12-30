package com.pinnoocle.weshare.weshop;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
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
import com.pinnoocle.weshare.event.BuyCountSortEvent;
import com.pinnoocle.weshare.event.ComprehensiveEvent;
import com.pinnoocle.weshare.event.GoodsSearchEvent;
import com.pinnoocle.weshare.event.PriceSortEvent;

import org.greenrobot.eventbus.EventBus;

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
    @BindView(R.id.iv_sort_composite)
    ImageView ivSortComposite;
    @BindView(R.id.iv_sort_sales_top)
    ImageView ivSortSalesTop;
    @BindView(R.id.iv_sort_sales_down)
    ImageView ivSortSalesDown;
    @BindView(R.id.iv_sort_price_top)
    ImageView ivSortPriceTop;
    @BindView(R.id.iv_sort_price_down)
    ImageView ivSortPriceDown;
    private List<Fragment> fragments;
    private FragmentTabAdapter fragmentTabAdapter;
    private int currentPage;
    private TextView[] pageIds;

    private String cat_id;
    private boolean countFlag = false;
    private boolean priceFlag = false;
    private String searchName;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_goods_list);
        ButterKnife.bind(this);
        initView();
//        if(getIntent().getStringExtra("searchName")!=null){
//            String searchName = getIntent().getStringExtra("searchName");
//            if(!TextUtils.isEmpty(searchName)){
//                EventBus.getDefault().post(new GoodsSearchEvent(searchName));
//            }
//        }
    }

    private void initView() {
        String title = getIntent().getStringExtra("title");
        cat_id = getIntent().getStringExtra("cat_id");
        tvTitle.setText(title);
        fragments = new ArrayList<>();
        if (getIntent().getStringExtra("searchName") != null) {
            searchName = getIntent().getStringExtra("searchName");
        }
        fragments.add(new GoodsListFragment(cat_id, searchName));
        fragments.add(new GoodClassificationFragment());
        pageIds = new TextView[]{tvComposite, tvSales, tvPrice, tvClassification};
        fragmentTabAdapter = new FragmentTabAdapter(this, fragments, R.id.content);
        pageIds[0].setTextColor(getResources().getColor(R.color.juice));//设置选中第一页
        ivSortComposite.setImageResource(R.mipmap.sort_down_red);
        edSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    ((InputMethodManager) edSearch.getContext().getSystemService(Context.INPUT_METHOD_SERVICE))
                            .hideSoftInputFromWindow(
                                    GoodsListActivity.this.getCurrentFocus().getWindowToken(),
                                    InputMethodManager.HIDE_NOT_ALWAYS);
                    if (edSearch.getText().toString().equals("")) {
                        ToastUtils.showToast("搜索内容不能为空");
                    } else {
                        String searchName = edSearch.getText().toString();
                        EventBus.getDefault().post(new GoodsSearchEvent(searchName));
                    }
                    return true;
                }
                return false;
            }
        });

    }

    private void setSortViewStatus(ImageView imageView, int res) {
        ivSortComposite.setImageResource(R.mipmap.sort_down);
        ivSortPriceTop.setImageResource(R.mipmap.sort_top);
        ivSortPriceDown.setImageResource(R.mipmap.sort_down);
        ivSortSalesTop.setImageResource(R.mipmap.sort_top);
        ivSortSalesDown.setImageResource(R.mipmap.sort_down);

        imageView.setImageResource(res);
    }

    private void switchPage(int page) {

        if (page == 0) {
            EventBus.getDefault().post(new ComprehensiveEvent());
            setSortViewStatus(ivSortComposite, R.mipmap.sort_down_red);

        } else if (page == 1) {
            countFlag = !countFlag;
            if (countFlag) {
                setSortViewStatus(ivSortSalesTop, R.mipmap.sort_top_red);
            } else {
                setSortViewStatus(ivSortSalesDown, R.mipmap.sort_down_red);
            }
            EventBus.getDefault().post(new BuyCountSortEvent(countFlag));

        } else if (page == 2) {
            priceFlag = !priceFlag;
            if (priceFlag) {
                setSortViewStatus(ivSortPriceTop, R.mipmap.sort_top_red);
            } else {
                setSortViewStatus(ivSortPriceDown, R.mipmap.sort_down_red);
            }
            EventBus.getDefault().post(new PriceSortEvent(priceFlag));

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
