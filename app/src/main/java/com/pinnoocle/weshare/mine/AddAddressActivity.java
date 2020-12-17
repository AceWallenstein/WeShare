package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxj.xpopup.XPopup;
import com.lxj.xpopupext.listener.CityPickerListener;
import com.lxj.xpopupext.popup.CityPickerPopup;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.AddressBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

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

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_add_addresss);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {

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
                        String name = edName.getText().toString();
                        String phone = edPhone.getText().toString();
                        String address = edArea.getText().toString()+ edAddress.getText().toString();
                        AddressBean addressBean = new AddressBean(name, phone, address);
                        Intent intent = new Intent();
                        intent.putExtra("addressBean",addressBean);
                        setResult(1,intent);
                        finish();
                    }
                }
                break;
    }

}

    private void showCitiesDialog() {
        CityPickerPopup popup = new CityPickerPopup(AddAddressActivity.this);
        popup.setCityPickerListener(new CityPickerListener() {
            @Override
            public void onCityConfirm(String province, String city, String area, View v) {
                edArea.setText(province+city+area);
            }

            @Override
            public void onCityChange(String province, String city, String area) {
            }
        });
        new XPopup.Builder(AddAddressActivity.this)
                .asCustom(popup)
                .show();
    }

}
