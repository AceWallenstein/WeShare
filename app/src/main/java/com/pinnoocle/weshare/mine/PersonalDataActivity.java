package com.pinnoocle.weshare.mine;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.luck.picture.lib.PictureSelector;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.lxj.xpopup.XPopup;
import com.lxj.xpopupext.listener.CityPickerListener;
import com.lxj.xpopupext.popup.CityPickerPopup;
import com.pedaily.yc.ycdialoglib.dialog.select.CustomSelectDialog;
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

    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_personal_data);
        ButterKnife.bind(this);
        initView();
    }

    protected void initView() {
        dataList.add("男");
        dataList.add("女");
    }


    @OnClick({R.id.go_back, R.id.iv_avater, R.id.tv_gender, R.id.tv_city, R.id.tv_confirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.go_back:
                finish();
                break;
            case R.id.iv_avater:
                rxPermissionTest();

                break;
            case R.id.tv_gender:
                initSexDialog();
                break;
            case R.id.tv_city:
                showCitiesDialog();
                break;
            case R.id.tv_confirm:
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

    private void rxPermissionTest() {
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                .subscribe(granted -> {
                    if (granted) {
//                        showCustomDialog();
                    } else {
                        showCustomDialog();
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
}
