package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ShopCartItemAdapter;
import com.pinnoocle.weshare.bean.DeleteCartBean;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.UpdateTotalPriceEvent;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.event.CartAllCheckedEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
购物车
 */
public class ShoppingCartActivity extends BaseActivity {
    @BindView(R.id.go_home)
    ImageView goHome;
    @BindView(R.id.tv_all_select)
    TextView tvAllSelect;
    @BindView(R.id.tv_cancel)
    TextView tvCancel;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.checkbox)
    CheckBox checkbox;
    @BindView(R.id.ll_all_select)
    LinearLayout llAllSelect;
    @BindView(R.id.tv_settlement)
    TextView tvSettlement;
    @BindView(R.id.tv_edit)
    TextView tvEdit;
    @BindView(R.id.tv_total_price)
    TextView tvTotalPrice;
    @BindView(R.id.tv_delete)
    TextView tv_delete;
    private DataRepository dataRepository;
    private ShopCartItemAdapter adapter;
    private List<ShoppingCartListBean.DataBean.ListBean> listBeans;
    private List<Integer> cartIdList;

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_shoppingcart);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(CartAllCheckedEvent event) {
        checkbox.setChecked(event.getAllChecked());
        updateTotalPrice();
        if (event.getAllChecked()) {
            tvAllSelect.setTextColor(getResources().getColor(R.color.grey));
            tvCancel.setTextColor(getResources().getColor(R.color.light_black));
        } else {
            tvAllSelect.setTextColor(getResources().getColor(R.color.light_black));
            tvCancel.setTextColor(getResources().getColor(R.color.grey));

        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(UpdateTotalPriceEvent event) {
        updateTotalPrice();
        ToastUtils.showToast("价格更新了没");
    }


    private void initView() {
        adapter = new ShopCartItemAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        shoppingCartList();
    }

    private void shoppingCartList() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", "b2fb4c51356d2087d859575b7e74cd4c");
        map.put("method", "cart.getlist");
        map.put("site_token", "123456");
        dataRepository.shoppingCartList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(ShoppingCartActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(ShoppingCartActivity.this);
                ShoppingCartListBean cartListBean = (ShoppingCartListBean) data;
                if (cartListBean.isStatus()) {
                    listBeans = cartListBean.getData().getList();
                    if (listBeans != null) {
                        adapter.setData(listBeans);
                        updateTotalPrice();
                    }
                }


            }

        });
    }

    private void deleteCart() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", "b2fb4c51356d2087d859575b7e74cd4c");
        map.put("method", "cart.del");
        map.put("site_token", "123456");
//        map.put("ids",cartIdList );
        dataRepository.deleteCart(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(ShoppingCartActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(ShoppingCartActivity.this);
                DeleteCartBean deleteCartBean = (DeleteCartBean) data;
                if (deleteCartBean.isStatus()) {
                    refreshEditStatus();
                    shoppingCartList();
                }


            }
        });
    }

    /*
    返回首页
     */
    @OnClick(R.id.go_home)
    public void onViewClicked() {
        EventBus.getDefault().post("1");
        finish();
    }

    @OnClick({R.id.tv_cancel, R.id.ll_all_select, R.id.tv_settlement, R.id.tv_edit, R.id.tv_delete})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.tv_cancel:
                for (ShoppingCartListBean.DataBean.ListBean listBean :
                        adapter.getData()) {
                    listBean.setIs_select(false);
                }
                checkbox.setChecked(false);
                updateTotalPrice();
                adapter.notifyDataSetChanged();

                break;
            case R.id.ll_all_select:
                checkbox.setChecked(!checkbox.isChecked());
                for (ShoppingCartListBean.DataBean.ListBean listBean :
                        adapter.getData()) {
                    listBean.setIs_select(checkbox.isChecked());
                }

                updateTotalPrice();
                adapter.notifyDataSetChanged();
                break;
            case R.id.tv_settlement:
                ActivityUtils.startActivity(this, OrderConfirmActivity.class);
                break;
            case R.id.tv_edit:
                refreshEditStatus();
                break;
            case R.id.tv_delete:
                cartIdList = new ArrayList();
                List<ShoppingCartListBean.DataBean.ListBean> adapterList = adapter.getData();
                for (int i = 0; i < adapterList.size(); i++) {
                    if (adapterList.get(i).isIs_select()) {
                        cartIdList.add(adapterList.get(i).getId());
                    }
                }
                if (cartIdList.size() == 0) {
                    ToastUtils.showToast("请选择需要删除的数据");
                } else {
                    deleteCart();
                    break;
                }
        }

    }

    private void refreshEditStatus() {
        boolean isEditStatus = "编辑" == tvEdit.getText().toString();
        String text;
        if (isEditStatus) {
            tvTotalPrice.setVisibility(View.GONE);
            tvSettlement.setVisibility(View.GONE);
            //删除按钮
            tv_delete.setVisibility(View.VISIBLE);
            text = "完成";
        } else {
            text = "编辑";
            tvTotalPrice.setVisibility(View.VISIBLE);
            tvSettlement.setVisibility(View.VISIBLE);
            tv_delete.setVisibility(View.GONE);

        }
        tvEdit.setText(text);
    }

    /*
        更新总价
     */
    private void updateTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCartListBean.DataBean.ListBean listBean :
                adapter.getData()) {
            if (listBean.isIs_select()) {
                totalPrice += listBean.getNums() * Double.parseDouble(listBean.getProducts().getPrice());
            }
        }
        tvTotalPrice.setText("合计：" + doubleToString(totalPrice));
    }
    public static String doubleToString(double num){
        //使用0.00不足位补0，#.##仅保留有效位
        return new DecimalFormat("0.00").format(num);
    }
}
