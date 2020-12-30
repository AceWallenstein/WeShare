package com.pinnoocle.weshare.widget;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.lxj.xpopup.core.BottomPopupView;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.bean.GoodsSku;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.SpecBean;
import com.pinnoocle.weshare.mine.OrderConfirmActivity;
import com.pinnoocle.weshare.mine.ShoppingCartActivity;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.timmy.tdialog.TDialog;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.ResponseBody;
import ren.qinc.numberbutton.NumberButton;

public class DialogShopCar extends BottomPopupView implements View.OnClickListener {
    private FragmentManager fm;
    private ImageView iv_close;
    private ImageView iv_shop;
    private TextView tv_price;
    private TextView tv_membership_price;
    private TextView tv_stock;
    private TextView tv_selected_num;
    private NumberButton numberButton;
    private TextView tv_buy;
    private TextView tv_add_shop_car;
    private boolean flag = false;
    private ImageView ivMark;
    private GoodsDetailBean.DataBean dataBean;
    private LinearLayout mSkuView;
    private DataRepository dataRepository;


    public DialogShopCar(@NonNull Context context, FragmentManager fm, GoodsDetailBean.DataBean DataBean) {
        super(context);
        this.fm = fm;
        this.dataBean = DataBean;
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.dialog_shop_car;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        initView();
        initListener();
//assert numberButton != null;
        initNumberButton(numberButton);
    }

    private void handleJson(List<String> mVals, String s) {
        String reg = "\\:\"(.*?)\"";

        Pattern pattern = Pattern.compile(reg);

        // 内容 与 匹配规则 的测试
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
//            // 包含前后的两个字符
//            System.out.println(matcher.group());
            // 不包含前后的两个字符
            mVals.add(matcher.group(1));
        }
    }


    private void initListener() {
        iv_close.setOnClickListener(this);
        tv_add_shop_car.setOnClickListener(this);
        tv_buy.setOnClickListener(this);
        findViewById(R.id.iv_customer_service).setOnClickListener(this);
        findViewById(R.id.iv_shop_car).setOnClickListener(this);
        ivMark.setOnClickListener(this);

    }

    private void initView() {
        iv_close = findViewById(R.id.iv_close);
        iv_shop = findViewById(R.id.iv_shop);
        tv_price = findViewById(R.id.tv_price);
        tv_membership_price = findViewById(R.id.tv_membership_price);
        tv_stock = findViewById(R.id.tv_stock);
        tv_selected_num = findViewById(R.id.tv_selected_num);
        numberButton = findViewById(R.id.number_button);
        tv_buy = findViewById(R.id.tv_buy);
        tv_add_shop_car = findViewById(R.id.tv_add_shop_car);
        ivMark = findViewById(R.id.iv_mark);
        mSkuView = findViewById(R.id.mSkuView);

        initData();
    }

    private void initData() {
        tv_price.setText("￥" + dataBean.getPrice() + "元");
        tv_membership_price.setText("会员价：" + dataBean.getCostprice());
        tv_stock.setText(dataBean.getStock() + "");
        Glide.with(getContext()).load(dataBean.getImage_url()).centerCrop().into(iv_shop);
        dataRepository = Injection.dataRepository(getContext());
//        getProductInfo();
        productInfo();

    }

    private void productInfo() {
        String spes_desc = dataBean.getSpes_desc();
        Log.d("------------", "productInfo: " + spes_desc);
        try {
            JSONObject jsonObject = new JSONObject(spes_desc);
            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                List<String> list = new ArrayList<>();
                JSONObject jsonObject1 = (JSONObject) jsonObject.get(key);
                Iterator<String> keys1 = jsonObject1.keys();
                if (keys1.hasNext()) {
                    String key2 = keys1.next();
                    String tag = (String) jsonObject1.getString(key2);
                    list.add(tag);
                }
                SkuView skuView = new SkuView(getContext());
                skuView.setSkuData(new GoodsSku(key, list));
                mSkuView.addView(skuView);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void getProductInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("site_token", "123456");
        map.put("method", "goods.getproductinfo");
        map.put("id", dataBean.getProduct().getId() + "");
        dataRepository.getProductInfo(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
//                Log.e("------------------", "onFailure: " + info);
            }

            @Override
            public void onSuccess(Object data) {
                ResponseBody responseBody = (ResponseBody) data;
                try {
                    String spec = responseBody.string();
                    JSONObject specObject = new JSONObject(spec);
                    JSONArray jsonArray = specObject.getJSONArray("default_spes_desc");
//                    for (int i = 0; i < jsonArray.length(); i++) {
//                        JSONObject spes_item = (JSONObject) jsonArray.get(i);
//
//                    }
//                    specObject.getJSONObject("")
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }

    private void initTag(TagFlowLayout flowLayout, List<String> mVals, String type) {
        TagAdapter<String> tagAdapter = new TagAdapter<String>(mVals) {
            @Override
            public View getView(FlowLayout parent, int position, String s) {
                TextView tv = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.tv_tag,
                        flowLayout, false);
                tv.setText(s);
                return tv;
            }

            @Override
            public void onSelected(int position, View view) {
                super.onSelected(position, view);
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(getContext().getResources().getColor(R.color.white));
                }
            }

            @Override
            public void unSelected(int position, View view) {
                super.unSelected(position, view);
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(getContext().getResources().getColor(R.color.light_black));
                }
            }
        };
        flowLayout.setAdapter(tagAdapter);
        flowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
//                ToastUtils.showToast(type + mVals.get(position));
                return true;
            }
        });
    }

    private void initNumberButton(NumberButton numberButton) {
        numberButton.setCurrentNumber(1);
        int buy_limit = dataBean.getBuy_limit();
        int stock = dataBean.getStock();
        numberButton.setBuyMax(buy_limit)
                .setInventory(dataBean.getStock())
                .setOnWarnListener(new NumberButton.OnWarnListener() {
                    @Override
                    public void onWarningForInventory(int inventory) {
                        ToastUtils.showToast("当前库存:" + inventory);
                    }

                    @Override
                    public void onWarningForBuyMax(int buyMax) {
                        ToastUtils.showToast("超过最大购买数:" + buyMax);
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_close:
                dismiss();
                break;
            case R.id.tv_add_shop_car:
                TDialog tDialog = new TDialog.Builder(fm)
                        .setLayoutRes(R.layout.dialog_add_shop_success)    //设置弹窗展示的xml布局
                        .setCancelableOutside(false)
//                .setDialogView(view)  //设置弹窗布局,直接传入View
                        .setGravity(Gravity.CENTER)     //设置弹窗展示位置
                        .setDimAmount(0.6f)     //设置弹窗背景透明度(0-1f)
                        .setCancelableOutside(false)     //弹窗在界面外是否可以点击取消
//                        .setDialogAnimationRes(R.style.animate_dialog)  //设置弹窗动画
                        .create()   //创建TDialog
                        .show();//展示
                postDelayed(() -> tDialog.dismiss(), 1000);
                break;
            case R.id.tv_buy:
                Intent intent = new Intent(getContext(), OrderConfirmActivity.class);
                getContext().startActivity(intent);
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
                ActivityUtils.startActivity(getContext(), ShoppingCartActivity.class);
                break;
        }
    }
}