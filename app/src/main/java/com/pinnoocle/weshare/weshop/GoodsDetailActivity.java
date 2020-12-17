package com.pinnoocle.weshare.weshop;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lxj.xpopup.XPopup;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.mine.OrderConfirmActivity;
import com.pinnoocle.weshare.mine.ShopCarActivity;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.widget.DialogCoupons;
import com.pinnoocle.weshare.widget.DialogPledge;
import com.pinnoocle.weshare.widget.DialogShopCar;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.listener.OnPageChangeListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GoodsDetailActivity extends BaseActivity implements OnPageChangeListener {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_goods_title)
    TextView tvGoodsTitle;
    @BindView(R.id.iv_share)
    ImageView ivShare;
    @BindView(R.id.tv_share)
    TextView tvShare;
    @BindView(R.id.ll_share)
    LinearLayout llShare;
    @BindView(R.id.tv_price)
    TextView tvPrice;
    @BindView(R.id.tv_underlined_price)
    TextView tvUnderlinedPrice;
    @BindView(R.id.ll_price)
    LinearLayout llPrice;
    @BindView(R.id.tv_sales)
    TextView tvSales;
    @BindView(R.id.tv_discount)
    TextView tvDiscount;
    @BindView(R.id.tv_discount_content)
    TextView tvDiscountContent;
    @BindView(R.id.rl_discount)
    RelativeLayout rlDiscount;
    @BindView(R.id.tv_selected)
    TextView tvSelected;
    @BindView(R.id.tv_selected_content)
    TextView tvSelectedContent;
    @BindView(R.id.rl_select)
    RelativeLayout rlSelect;
    @BindView(R.id.tv_pledge)
    TextView tvPledge;
    @BindView(R.id.tv_pledge_1)
    TextView tvPledge1;
    @BindView(R.id.tv_pledge_2)
    TextView tvPledge2;
    @BindView(R.id.rl_pledge)
    RelativeLayout rlPledge;
    @BindView(R.id.tv_appraise)
    TextView tvAppraise;
    @BindView(R.id.tv_more)
    TextView tvMore;
    @BindView(R.id.rl_appraise)
    RelativeLayout rlAppraise;
    @BindView(R.id.goods_banner)
    Banner banner;
    @BindView(R.id.banner_indicator)
    TextView bannerIndicator;
    @BindView(R.id.iv_mark)
    ImageView ivMark;
    @BindView(R.id.iv_customer_service)
    ImageView ivCustomerService;
    @BindView(R.id.iv_shop_car)
    ImageView ivShopCar;
    private List<Integer> mList;
    private boolean flag = false;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_goods_detail);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mList = new ArrayList<>();
        mList.add(R.mipmap.delete_2);
        mList.add(R.mipmap.delete_3);
        mList.add(R.mipmap.delete_4);
        banner.isAutoLoop(false)
                .setAdapter(new BannerImageAdapter<Integer>(mList) {
                    @Override
                    public void onBindView(BannerImageHolder holder, Integer data, int position, int size) {
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data)
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                .into(holder.imageView);
                    }
                })
                .isAutoLoop(false)
                .addOnPageChangeListener(this);
        bannerIndicator.setText("1/" + mList.size());
//        banner.setCurrentItem(0);
    }

    @OnClick({R.id.iv_back, R.id.ll_share, R.id.rl_discount, R.id.rl_select, R.id.rl_pledge, R.id.tv_more, R.id.tv_add_shop_car, R.id.tv_buy, R.id.iv_mark, R.id.iv_customer_service, R.id.iv_shop_car})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.ll_share:
                break;
            case R.id.rl_discount:
                showCouponsDialog();
                break;
            case R.id.rl_select:
                showSelectDialog();
                break;
            case R.id.rl_pledge:
                showPledgeDialog();
                break;
            case R.id.tv_more:
                ActivityUtils.startActivity(this, AppraiseActivity.class);
                break;
            case R.id.tv_add_shop_car:
                showShopCarDialog();
                break;
            case R.id.tv_buy:
                ActivityUtils.startActivity(this, OrderConfirmActivity.class);
                break;
            case R.id.iv_mark:
                flag = !flag;
                if (flag) {
                    ivMark.setImageResource(R.mipmap.mark_star);
                } else {
                    ivMark.setImageResource(R.mipmap.bg_mark_star);
                }
                break;
            case R.id.iv_customer_service:
                break;

            case R.id.iv_shop_car:
                ActivityUtils.startActivity(this, ShopCarActivity.class);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        banner.destroy();
    }

    private void showShopCarDialog() {
        new XPopup.Builder(this)
                .enableDrag(false)
                .asCustom(new DialogShopCar(this, getSupportFragmentManager()))
                .show();
    }

    private void showCouponsDialog() {
        new XPopup.Builder(this)
                .enableDrag(false)
                .asCustom(new DialogCoupons(this))
                .show();
    }

    private void showSelectDialog() {
        new XPopup.Builder(this)
                .enableDrag(false)
                .asCustom(new DialogShopCar(this, getSupportFragmentManager()))
                .show();
    }

    private void showPledgeDialog() {
        new XPopup.Builder(this)
                .enableDrag(false)
                .asCustom(new DialogPledge(this))
                .show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int realposition = position + 1;
        bannerIndicator.setText(realposition + "/" + mList.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
