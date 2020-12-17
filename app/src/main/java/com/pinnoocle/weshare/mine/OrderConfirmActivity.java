package com.pinnoocle.weshare.mine;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.OrderAdapter;
import com.pinnoocle.weshare.adapter.OrderConfirmAdapter;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderConfirmActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.ll_name)
    LinearLayout llName;
    @BindView(R.id.iv_line)
    ImageView ivLine;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.tv_num)
    TextView tvNum;
    @BindView(R.id.tv_money)
    TextView tvMoney;
    @BindView(R.id.tv_total_money)
    TextView tvTotalMoney;
    @BindView(R.id.tv_coupon)
    TextView tvCoupon;
    @BindView(R.id.tv_delivery_fee)
    TextView tvDeliveryFee;
    @BindView(R.id.iv_pay_mode_wechat)
    ImageView ivPayModeWechat;
    @BindView(R.id.tv_pay_mode_wechat)
    TextView tvPayModeWechat;
    @BindView(R.id.iv_right_mark_1)
    ImageView ivRightMark1;
    @BindView(R.id.iv_pay_mode_balance)
    ImageView ivPayModeBalance;
    @BindView(R.id.tv_pay_mode_balance)
    TextView tvPayModeBalance;
    @BindView(R.id.iv_right_mark_2)
    ImageView ivRightMark2;
    @BindView(R.id.rl_pay_mode)
    LinearLayout rlPayMode;
    @BindView(R.id.tv_actual_payment)
    TextView tvActualPayment;
    @BindView(R.id.tv_actual_payment_money)
    TextView tvActualPaymentMoney;
    @BindView(R.id.tv_go_buy)
    TextView tvGoBuy;
    private OrderConfirmAdapter orderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirm);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        ivRightMark1.setVisibility(View.VISIBLE);
        ivRightMark2.setVisibility(View.GONE);

        //        dataRepository = Injection.dataRepository(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        orderAdapter = new OrderConfirmAdapter(this);
        recyclerView.setAdapter(orderAdapter);
    }

    @OnClick({R.id.iv_back, R.id.rl_pay_mode_wechat, R.id.rl_pay_mode_balance})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.rl_pay_mode_wechat:
                switchPayMode(ivRightMark1, ivRightMark2);
                break;
            case R.id.rl_pay_mode_balance:
                switchPayMode(ivRightMark2, ivRightMark1);
                break;
        }
    }

    private void switchPayMode(ImageView imageView1, ImageView imageView2) {
        if (imageView1.getVisibility() == View.GONE)
            imageView1.setVisibility(View.VISIBLE);
        if (imageView2.getVisibility() == View.VISIBLE)
            imageView2.setVisibility(View.GONE);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (getCurrentFocus() != null && getCurrentFocus().getWindowToken() != null) {
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
        return super.onTouchEvent(event);
    }
}
