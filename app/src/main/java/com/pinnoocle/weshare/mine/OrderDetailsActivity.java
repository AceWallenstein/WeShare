package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.OrderItemAdapter;
import com.pinnoocle.weshare.bean.OrderDetailsBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OrderDetailsActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.tv_order_state)
    TextView tvOrderState;
    @BindView(R.id.tv_order_limit_time)
    TextView tvOrderLimitTime;
    @BindView(R.id.ll_order_state)
    LinearLayout llOrderState;
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
    @BindView(R.id.tv_order_information)
    TextView tvOrderInformation;
    @BindView(R.id.tv_total_money)
    TextView tvTotalMoney;
    @BindView(R.id.tv_delivery_fee)
    TextView tvDeliveryFee;
    @BindView(R.id.tv_coupons)
    TextView tvCoupons;
    @BindView(R.id.tv_pay_mode)
    TextView tvPayMode;
    @BindView(R.id.rl_current_money)
    RelativeLayout rlCurrentMoney;
    @BindView(R.id.tv_pay_money)
    TextView tvPayMoney;
    @BindView(R.id.rl_pay_mode)
    RelativeLayout rlPayMode;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.tv_go_buy)
    TextView tvGoBuy;
    @BindView(R.id.rl_pay)
    RelativeLayout rl_pay;
    private OrderItemAdapter orderItemAdapter;
    private DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    /*

        } else if (type.equals("待付款")) {
            list.add(new OrderBean(1));
        } else if (type.equals("待发货")) {
            list.add(new OrderBean(2));
        } else if (type.equals("待收货")) {
            list.add(new OrderBean(0));
        } else if (type.equals("待评价")) {
            list.add(new OrderBean(3));
        } else if (type.equals("团购订单")) {
     */
    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        orderItemAdapter = new OrderItemAdapter(this);
        recyclerView.setAdapter(orderItemAdapter);


    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        orderDetails();
    }

    private void orderDetails() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "order.details");
        map.put("site_token", "123456");
        map.put("order_id", getIntent().getStringExtra(Constants.ORDER_ID));
        dataRepository.orderDetails(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(OrderDetailsActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(OrderDetailsActivity.this);
                OrderDetailsBean orderDetailsBean = (OrderDetailsBean) data;
                if (orderDetailsBean.isStatus()) {
                    int type = orderDetailsBean.getData().getOrder_type();
                    dealOrderType(type);
                    tvName.setText(orderDetailsBean.getData().getShip_name());
                    tvPhone.setText(orderDetailsBean.getData().getShip_mobile());
                    tvAddress.setText(orderDetailsBean.getData().getShip_area_name().trim()+orderDetailsBean.getData().getShip_address().trim());
                    orderItemAdapter.setData(orderDetailsBean.getData().getItems());
                    tvNum.setText("共计"+orderDetailsBean.getData().getItems().size()+"件商品，合计:");
                    tvMoney.setText("￥"+orderDetailsBean.getData().getGoods_amount());
                    tvTotalMoney.setText("￥"+orderDetailsBean.getData().getGoods_amount());
                    tvDeliveryFee.setText("￥"+orderDetailsBean.getData().getCost_freight());
                    tvCoupons.setText("￥"+orderDetailsBean.getData().getCoupon_pmt());
                    tvPayMode.setText(orderDetailsBean.getData().getPayment_name());
                    tvPayMoney.setText("￥"+orderDetailsBean.getData().getOrder_amount());

                }


            }
        });
    }

    private void dealOrderType(int type) {
        if (type == 1) {
        } else if (type == 2) {
            tvOrderState.setText("已付款，待发货");
            tvOrderLimitTime.setText("订单号：2019102848100549");
//            tvGoBuy.setVisibility(View.GONE);
//            tvCancel.setVisibility(View.GONE);
            rl_pay.setVisibility(View.GONE);
        } else if (type == 0) {
            tvOrderState.setText("卖家已发货");
            tvOrderLimitTime.setText("订单号：2019102848100549");
//            tvGoBuy.setVisibility(View.GONE);
//            tvCancel.setVisibility(View.GONE);
            rl_pay.setVisibility(View.GONE);

        } else if (type == 3) {
            tvOrderState.setText("已完成");
            tvOrderLimitTime.setText("订单号：2019102848100549");
//            tvGoBuy.setVisibility(View.GONE);
//            tvCancel.setVisibility(View.GONE);
            rl_pay.setVisibility(View.GONE);
        }
    }

    @OnClick({R.id.iv_back, R.id.tv_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
            case R.id.tv_cancel:
                finish();
                break;
        }
    }
}
