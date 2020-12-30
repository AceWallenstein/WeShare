package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.text.TextUtils;
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
import com.pinnoocle.weshare.bean.GetAreaIdBean;
import com.pinnoocle.weshare.bean.SaveUserShipBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.event.AddAddressEvent;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddAddressActivity extends BaseActivity {
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
    private String districtName;
    private String cityName;
    private String provinceName;
    private DataRepository dataRepository;

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_add_addresss);
        ButterKnife.bind(this);
        initView();
        mPicker.init(this);
        initData();
    }


    private void initView() {

    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
    }

    private void saveUserShip() {
        if(TextUtils.isEmpty(area_id)){
            return;
        }
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.saveusership");
        map.put("site_token", "123456");
        map.put("area_id", area_id);
        map.put("user_name", edName.getText().toString());
        map.put("detail_info", edAddress.getText().toString().trim());
        map.put("tel_number", edPhone.getText().toString());
        dataRepository.saveUserShip(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(AddAddressActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(AddAddressActivity.this);
                SaveUserShipBean saveUserShipBean = (SaveUserShipBean) data;
                if (saveUserShipBean.isStatus()) {
                    ToastUtils.showToast(saveUserShipBean.getMsg());
                    EventBus.getDefault().post(new AddAddressEvent());
                    finish();
                }


            }
        });
    }

    private void getAreaId() {

        Map<String, String> map = new HashMap<>();
        map.put("method", "user.saveusership");
        map.put("site_token", "123456");
        map.put("city_name", cityName);
        map.put("county_name", districtName);
        map.put("province_name", provinceName);
        dataRepository.getAreaId(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
            }

            @Override
            public void onSuccess(Object data) {
                GetAreaIdBean getAreaIdBean = (GetAreaIdBean) data;
                if (getAreaIdBean.isStatus()) {
                    area_id = String.valueOf(getAreaIdBean.getData());
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
                        //保存地址到服务器
//                        getAreaId();
                        saveUserShip();
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
                edArea.setText(province.getName()+" " + city.getName() +" "+ district.getName());
                area_id = district.getId();
                provinceName = province.getName();
                cityName = city.getName();
                districtName = district.getName();
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
