package com.pinnoocle.weshare.weshop;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lxj.xpopup.XPopup;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.mine.OrderConfirmActivity;
import com.pinnoocle.weshare.mine.ShopCarActivity;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.widget.DialogCoupons;
import com.pinnoocle.weshare.widget.DialogPledge;
import com.pinnoocle.weshare.widget.DialogShopCar;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.listener.OnPageChangeListener;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    TextView tvNoMemberPrice;
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
    @BindView(R.id.tv_evaluation)
    TextView tvEvaluation;
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
    @BindView(R.id.tv_stock)
    TextView tvStock;
    @BindView(R.id.tv_content)
    TextView tvContent;
    private List<String> bannerList;
    private boolean flag = false;
    private DataRepository dataRepository;
    private DialogPledge dialogPledge;
    private List<GoodsDetailBean.DataBean.ServiceBean> service;
    private int specId;//规格id
    private GoodsDetailBean.DataBean dataBean;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_goods_detail);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
//        initBanner();
//        banner.setCurrentItem(0);

    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        goodsDetail();
    }

    private void goodsDetail() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", Constants.token);
        map.put("method", "goods.getdetial");
        map.put("site_token", "123456");
        map.put("id", getIntent().getStringExtra(Constants.ID));
        dataRepository.goodsDetail(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(GoodsDetailActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(GoodsDetailActivity.this);
                GoodsDetailBean goodsDetailBean = (GoodsDetailBean) data;
                if (goodsDetailBean.isStatus()) {
                    tvGoodsTitle.setText(goodsDetailBean.getData().getName());
                    tvPrice.setText(goodsDetailBean.getData().getPrice());
                    tvNoMemberPrice.setText("非会员："+goodsDetailBean.getData().getCostprice());
                    tvStock.setText("库存：" + goodsDetailBean.getData().getTotal_stock());
                    tvSales.setText("销量：" + goodsDetailBean.getData().getBuy_count());
                    initBanner(goodsDetailBean.getData().getAlbum());
                    service = goodsDetailBean.getData().getService();
                    dataBean = goodsDetailBean.getData();
                    specId = goodsDetailBean.getData().getProduct().getId();
                    tvContent.setText(Html.fromHtml(goodsDetailBean.getData().getIntro(), imgGetter, null));
                    tvEvaluation.setText("评价（"+goodsDetailBean.getData().getComments_count()+"条）");
                }
            }
        });
    }

    private void initBanner(List<String> album) {
        bannerList = new ArrayList<>();
        bannerList = album;
        banner.isAutoLoop(false)
                .setAdapter(new BannerImageAdapter<String>(bannerList) {
                    @Override
                    public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data)
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                .into(holder.imageView);
                    }
                })
                .isAutoLoop(false)
                .addOnPageChangeListener(this);
        bannerIndicator.setText("1/" + bannerList.size());
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
                Intent intent = new Intent(this, EvaluationActivity.class);
                intent.putExtra(Constants.GOODS_ID,getIntent().getStringExtra(Constants.ID));
                startActivity(intent);
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
                .asCustom(new DialogShopCar(this, getSupportFragmentManager(),dataBean ))
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
                .asCustom(new DialogShopCar(this, getSupportFragmentManager(),dataBean))
                .show();
    }

    private void showPledgeDialog() {
        dialogPledge = new DialogPledge(this,service);
        new XPopup.Builder(this)
                .enableDrag(false)
                .asCustom(dialogPledge)
                .show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int realposition = position + 1;
        bannerIndicator.setText(realposition + "/" + bannerList.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    Html.ImageGetter imgGetter = new Html.ImageGetter() {
        public Drawable getDrawable(String source) {
            Log.i("RG", "source---?>>>" + source);
            Drawable drawable = null;
            URL url;
            try {
                url = new URL(source);
                Log.i("RG", "url---?>>>" + url);
                drawable = Drawable.createFromStream(url.openStream(), ""); // 获取网路图片
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(),
                    drawable.getIntrinsicHeight());
            Log.i("RG", "url---?>>>" + url);
            return drawable;
        }
    };

}
