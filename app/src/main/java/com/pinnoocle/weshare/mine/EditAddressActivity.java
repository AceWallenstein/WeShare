package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lljjcoder.Interface.OnCityItemClickListener;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.citywheel.CityConfig;
import com.lljjcoder.style.citypickerview.CityPickerView;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.SaveUserShipBean;
import com.pinnoocle.weshare.bean.UserShipBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.AddAddressEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditAddressActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ed_area)
    TextView edArea;
    @BindView(R.id.tv_weixin_address)
    TextView tvWeixinAddress;
    @BindView(R.id.tv_save)
    TextView tvSave;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.ed_phone)
    EditText edPhone;
    @BindView(R.id.ed_address)
    EditText edAddress;

    CityPickerView mPicker = new CityPickerView();
    String area_id;
    private DataRepository dataRepository;
    private UserShipBean.DataBean dataBean;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_edit_addresss);
        ButterKnife.bind(this);
        initView();
        mPicker.init(this);
        initData();
    }


    private void initView() {

    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        Serializable serializableExtra = getIntent().getSerializableExtra(Constants.KEY_DATABEAN);
        dataBean = (UserShipBean.DataBean) serializableExtra;
        edName.setText(dataBean.getName().trim());
        edPhone.setText(dataBean.getMobile().trim());
        edArea.setText(dataBean.getArea_name().trim());
        edAddress.setText(dataBean.getAddress().trim());
        area_id = String.valueOf(dataBean.getArea_id());
    }

    private void editUserShip() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.editship");
        map.put("site_token", "123456");
        map.put("area_id", area_id);
        map.put("name", edName.getText().toString());
        map.put("mobile", edPhone.getText().toString());
        map.put("id", dataBean.getId()+"");
        map.put("address", edAddress.getText().toString().trim());
        dataRepository.saveUserShip(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(EditAddressActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(EditAddressActivity.this);
                SaveUserShipBean saveUserShipBean = (SaveUserShipBean) data;
                if (saveUserShipBean.isStatus()) {
                    ToastUtils.showToast(saveUserShipBean.getMsg());
                    EventBus.getDefault().post(new AddAddressEvent());
                    finish();
                }


            }
        });
    }

    @OnClick({R.id.iv_back, R.id.ed_area, R.id.tv_weixin_address, R.id.tv_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.ed_area:
                showCitiesDialog();
                break;
            case R.id.tv_weixin_address:
                break;
            case R.id.tv_save:
                if (edName.getText().toString().trim().equals("")) {
                    ToastUtils.showToast("请输入收货人姓名");
                } else if (edPhone.getText().toString().trim().equals("")) {
                    ToastUtils.showToast("请输入收货人联系电话");
                } else if (edArea.getText().toString().trim().equals("")) {
                    ToastUtils.showToast("请选择省市区");
                } else if (edAddress.getText().toString().trim().equals("")) {
                    ToastUtils.showToast("请输入街道小区楼层");
                } else {
                    String telRegex = "[1][3456789]\\d{9}";
                    boolean matches = edPhone.getText().toString().matches(telRegex);
                    if (matches == false) {
                        ToastUtils.showToast("手机号码格式不正确");
                    } else {
                        //保存修改的地址到服务器
                        editUserShip();
                    }
                }
                break;
        }

    }

    private void showCitiesDialog() {
//        CityPickerPopup popup = new CityPickerPopup(AddAddressActivity.this);
//        popup.setCityPickerListener(new CityPickerListener() {
//            @Override
//            public void onCityConfirm(String province, String city, String area, View v) {
//                edArea.setText(province+city+area);
//            }
//
//            @Override
//            public void onCityChange(String province, String city, String area) {
//            }
//        });
//        new XPopup.Builder(AddAddressActivity.this)
//                .asCustom(popup)
//                .show();
        CityConfig cityConfig = new CityConfig.Builder().build();
        mPicker.setConfig(cityConfig);

//监听选择点击事件及返回结果
        mPicker.setOnCityItemClickListener(new OnCityItemClickListener() {
            @Override
            public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {
                edArea.setText(province.getName() +" "+ city.getName()+" " + district.getName());
                area_id = district.getId();
                //省份province
                //城市city
                //地区district
            }

            @Override
            public void onCancel() {

            }
        });

        //显示
        mPicker.showCityPicker();
    }

}
