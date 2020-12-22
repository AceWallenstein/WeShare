package com.pinnoocle.weshare.mine;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.bumptech.glide.Glide;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.lxj.xpopup.XPopup;
import com.lxj.xpopupext.listener.CityPickerListener;
import com.lxj.xpopupext.popup.CityPickerPopup;
import com.pedaily.yc.ycdialoglib.dialog.select.CustomSelectDialog;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.MainActivity;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;
import com.pinnoocle.weshare.widget.RoundImageView;
import com.tbruyelle.rxpermissions3.RxPermissions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.qqtheme.framework.picker.OptionPicker;
import cn.qqtheme.framework.widget.WheelView;

/*
个人资料
 */
public class PersonalDataActivity extends BaseActivity {


    @BindView(R.id.go_back)
    ImageView goBack;
    @BindView(R.id.iv_avater)
    RoundImageView ivAvater;
    @BindView(R.id.tv_gender)
    TextView tvGender;
    @BindView(R.id.tv_city)
    TextView tvCity;
    @BindView(R.id.tv_confirm)
    TextView tvConfirm;

    private List<String> dataList = new ArrayList<>();
    private AMapLocationClient locationClient;
    protected String[] needPermissions = {
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE
    };

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_personal_data);
        ButterKnife.bind(this);
        initView();
        initLocation();
    }

    protected void initView() {
        dataList.add("男");
        dataList.add("女");
    }

    private void initLocation() {
        //初始化client
        locationClient = new AMapLocationClient(this.getApplicationContext());
        //设置定位参数
        locationClient.setLocationOption(getDefaultOption());
        // 设置定位监听
        locationClient.setLocationListener(locationListener);
    }


    @OnClick({R.id.go_back, R.id.iv_avater, R.id.tv_city, R.id.tv_confirm, R.id.tv_location})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.go_back:
                finish();
                break;
            case R.id.iv_avater:
                rxPermissionTest();

                break;
//            case R.id.tv_gender:
//                initSexDialog();
//                break;
            case R.id.tv_city:
                showCitiesDialog();
                break;
            case R.id.tv_confirm:
                break;
            case R.id.tv_location:

                rxPermission();
                break;
        }
    }

    private void showCitiesDialog() {
        CityPickerPopup popup = new CityPickerPopup(PersonalDataActivity.this);
        popup.setCityPickerListener(new CityPickerListener() {
            @Override
            public void onCityConfirm(String province, String city, String area, View v) {
                tvCity.setText(city);
            }

            @Override
            public void onCityChange(String province, String city, String area) {
            }
        });
        new XPopup.Builder(PersonalDataActivity.this)
                .asCustom(popup)
                .show();
    }
    private void rxPermission() {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(needPermissions)
                .subscribe(granted -> {
                    if (granted) {
                       locationClient.startLocation();
                    } else {
                        // Oups permission denied
                    }
                });
    }
    private void rxPermissionTest() {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(granted -> {
                    if (granted) {
//                        showCustomDialog();
                        showCustomDialog();
                    } else {
                        // Oups permission denied
                    }
                });
    }

    private void showCustomDialog() {
        final List<String> names = new ArrayList<>();
        names.add("拍照");
        names.add("相册");
        showDialog(new CustomSelectDialog.SelectDialogListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                if (position == 0) {
                    openCamera();
                } else {
                    openAlbum();
                }
            }
        }, names);
    }

    private CustomSelectDialog showDialog(CustomSelectDialog.SelectDialogListener listener,
                                          List<String> names) {
        CustomSelectDialog dialog = new CustomSelectDialog(this,
                R.style.transparentFrameWindowStyle, listener, names);
        dialog.setItemColor(R.color.black, R.color.black);
        //判断activity是否finish
        if (!this.isFinishing()) {
            dialog.show();
        }
        return dialog;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        List<LocalMedia> selectList = PictureSelector.obtainMultipleResult(data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case PictureConfig.REQUEST_CAMERA:
                    for (LocalMedia localMedia : selectList) {
                        String compressPath = localMedia.getCompressPath();
//                        File file = new File(compressPath);
//                        upLoadPic(file);
                        Glide.with(this).load(compressPath).into(ivAvater);

                    }
                    break;
                case PictureConfig.CHOOSE_REQUEST:
                    for (LocalMedia localMedia : selectList) {
                        String compressPath = localMedia.getCompressPath();
//                        File file = new File(compressPath);
//                        upLoadPic(file);
                        Glide.with(this).load(compressPath).into(ivAvater);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void openAlbum() {
        PictureSelector.create(this)
                .openGallery(PictureMimeType.ofImage())
                .selectionMode(PictureConfig.SINGLE)
                .enableCrop(true)
                .compress(true)
                .forResult(PictureConfig.CHOOSE_REQUEST);
    }

    private void openCamera() {
        PictureSelector.create(this)
                .openCamera(PictureMimeType.ofImage())
                .enableCrop(true)
                .compress(true)
                .forResult(PictureConfig.REQUEST_CAMERA);
    }

    private void initSexDialog() {
        OptionPicker picker = new OptionPicker(PersonalDataActivity.this, dataList);
        picker.setDividerRatio(WheelView.DividerConfig.FILL);
        picker.setSubmitText("确定");
        picker.setSubmitTextColor(0xffEA5740);
        picker.setSubmitTextSize(16);
        picker.setCancelText("取消");
        picker.setCancelTextColor(0xff666666);
        picker.setCancelTextSize(16);
        picker.setTextColor(0xff374459);
        picker.setDividerColor(0xffE6EAF0);
        picker.setTopLineColor(0xffE6EAF0);
        picker.setCycleDisable(true);
        picker.setAnimationStyle(R.style.main_menu_anim_style);
        picker.setOnOptionPickListener(new OptionPicker.OnOptionPickListener() {
            @Override
            public void onOptionPicked(int index, String item) {
                tvGender.setText(item);
            }
        });
        picker.show();
    }

    AMapLocationListener locationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation location) {
            if (null != location) {

                StringBuffer sb = new StringBuffer();
                //errCode等于0代表定位成功，其他的为定位失败，具体的可以参照官网定位错误码说明
                if (location.getErrorCode() == 0) {
//                    sb.append("国    家    : " + location.getCountry() + "\n");
//                    sb.append("省            : " + location.getProvince() + "\n");
//                    sb.append("市            : " + location.getCity() + "\n");
//                    sb.append("城市编码 : " + location.getCityCode() + "\n");
//                    sb.append("区            : " + location.getDistrict() + "\n");
//                    sb.append("区域 码   : " + location.getAdCode() + "\n");
//                    sb.append("地    址    : " + location.getAddress() + "\n");
                    tvCity.setText(location.getCity());
                    //定位完成的时间
                } else {
//                    //定位失败
//                    sb.append("定位失败" + "\n");
//                    sb.append("错误码:" + location.getErrorCode() + "\n");
//                    sb.append("错误信息:" + location.getErrorInfo() + "\n");
//                    sb.append("错误描述:" + location.getLocationDetail() + "\n");
                }
            } else {
//                tvResult.setText("定位失败，loc is null");
            }
        }
    };
    private AMapLocationClientOption getDefaultOption(){
        AMapLocationClientOption mOption = new AMapLocationClientOption();
        mOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);//可选，设置定位模式，可选的模式有高精度、仅设备、仅网络。默认为高精度模式
        mOption.setGpsFirst(false);//可选，设置是否gps优先，只在高精度模式下有效。默认关闭
        mOption.setHttpTimeOut(30000);//可选，设置网络请求超时时间。默认为30秒。在仅设备模式下无效
        mOption.setInterval(2000);//可选，设置定位间隔。默认为2秒
        mOption.setNeedAddress(true);//可选，设置是否返回逆地理地址信息。默认是true
        mOption.setOnceLocation(false);//可选，设置是否单次定位。默认是false
        mOption.setOnceLocationLatest(false);//可选，设置是否等待wifi刷新，默认为false.如果设置为true,会自动变为单次定位，持续定位时不要使用
        AMapLocationClientOption.setLocationProtocol(AMapLocationClientOption.AMapLocationProtocol.HTTP);//可选， 设置网络请求的协议。可选HTTP或者HTTPS。默认为HTTP
        mOption.setSensorEnable(false);//可选，设置是否使用传感器。默认是false
        mOption.setWifiScan(true); //可选，设置是否开启wifi扫描。默认为true，如果设置为false会同时停止主动刷新，停止以后完全依赖于系统刷新，定位位置可能存在误差
        mOption.setLocationCacheEnable(true); //可选，设置是否使用缓存定位，默认为true
        mOption.setGeoLanguage(AMapLocationClientOption.GeoLanguage.DEFAULT);//可选，设置逆地理信息的语言，默认值为默认语言（根据所在地区选择语言）
        return mOption;
    }

}
