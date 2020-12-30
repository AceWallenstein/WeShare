package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.interfaces.OnConfirmListener;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.AddressAdapter;
import com.pinnoocle.weshare.bean.AddressBean;
import com.pinnoocle.weshare.bean.RemoveShipBean;
import com.pinnoocle.weshare.bean.SetDefShipBean;
import com.pinnoocle.weshare.bean.UpdateTotalPriceEvent;
import com.pinnoocle.weshare.bean.UserShipBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.AddAddressEvent;
import com.pinnoocle.weshare.event.SelectAddressEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;
import com.timmy.tdialog.TDialog;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddressActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tv_add_address)
    TextView tvAddAddress;
    private AddressAdapter adapter;
    private List<AddressBean> list;
    private DataRepository dataRepository;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_addresss);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(AddAddressEvent event) {
        getUserShip();
    }

    private void initView() {
        adapter = new AddressAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.setmOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<UserShipBean.DataBean>() {
            @Override
            public void onItemViewClick(View view, int position, UserShipBean.DataBean dataBean) {
                switch (view.getId()) {
                    case R.id.ll_check:
                        setDefShip(dataBean.getId());
                        break;

                    case R.id.tv_edit:
                        Intent intent = new Intent(AddressActivity.this, EditAddressActivity.class);
                        intent.putExtra(Constants.KEY_DATABEAN, dataBean);
                        startActivity(intent);
                        break;
                    case R.id.tv_delete:
                        new XPopup.Builder(AddressActivity.this).asConfirm("确定要删除该地址吗", "",
                                new OnConfirmListener() {
                                    @Override
                                    public void onConfirm() {
                                        removeShip(dataBean.getId());
                                    }
                                })
                                .show();
                        break;

                    default:

//                        EventBus.getDefault().post(new SelectAddressEvent(dataBean));
//                        finish();
//                        break;
                }
            }
        });
    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        getUserShip();
    }

    private void getUserShip() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.getusership");
        map.put("site_token", "123456");
        dataRepository.getUserShip(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(AddressActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(AddressActivity.this);
                UserShipBean userShipBean = (UserShipBean) data;
                if (userShipBean.isStatus()) {
                    List<UserShipBean.DataBean> dataBeanList = userShipBean.getData();
                    adapter.setData(dataBeanList);
                }


            }
        });
    }

    private void setDefShip(int id) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.setdefship");
        map.put("site_token", "123456");
        map.put("id", id + "");
        dataRepository.setDefShip(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(AddressActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(AddressActivity.this);
                SetDefShipBean setDefShipBean = (SetDefShipBean) data;
                if (setDefShipBean.isStatus()) {
                    getUserShip();
                }


            }
        });
    }

    private void removeShip(int id) {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.removeship");
        map.put("site_token", "123456");
        map.put("id", id + "");
        dataRepository.removeShip(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(AddressActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(AddressActivity.this);
                RemoveShipBean removeShipBean = (RemoveShipBean) data;
                ToastUtils.showToast(removeShipBean.getMsg());
                if (removeShipBean.isStatus()) {
                    getUserShip();
                }
            }
        });
    }


    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(String message) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1 && requestCode == 1) {
//            if (data == null) {
//                return;
//            }
//            Serializable serializable = data.getSerializableExtra("addressBean");
//            AddressBean addressBean = (AddressBean) serializable;
//            list.add(addressBean);
//            adapter.setData(list);
    }

    @OnClick({R.id.iv_back, R.id.tv_add_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_add_address:
                ActivityUtils.startActivity(this, AddAddressActivity.class);
                break;
        }

    }

}
