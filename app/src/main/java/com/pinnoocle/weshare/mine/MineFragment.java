package com.pinnoocle.weshare.mine;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.Space;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.GridOrderAdapter;
import com.pinnoocle.weshare.bean.UserInfoBean;
import com.pinnoocle.weshare.common.Type;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.SaveImageUtils;
import com.pinnoocle.weshare.widget.RoundImageView;
import com.pinnoocle.weshare.widget.TagsGridView;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;
import com.timmy.tdialog.listener.OnViewClickListener;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread;

/*
个人中心
 */
public class MineFragment extends Fragment implements AdapterView.OnItemClickListener {

    @BindView(R.id.iv_head)
    RoundImageView ivHead;
    @BindView(R.id.tv_nickname)
    TextView tvNickname;
    @BindView(R.id.tv_modification_personal_data)
    TextView tvModificationPersonalData;
    @BindView(R.id.tv_identification)
    TextView tvIdentification;
    @BindView(R.id.gridView)
    TagsGridView gridView;
    @BindView(R.id.grid_my_service)
    TagsGridView gridMyService;
    @BindView(R.id.grid_my_extension)
    TagsGridView gridMyExtension;
    @BindView(R.id.iv_setting)
    ImageView ivSetting;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.ll_available_balance)
    LinearLayout llAvailableBalance;
    @BindView(R.id.ll_account_balance)
    LinearLayout llAccountBalance;
    @BindView(R.id.ll_my_coupons)
    LinearLayout llMyCoupons;
    @BindView(R.id.ll_my_jinyuan)
    LinearLayout llMyJinyuan;
    @BindView(R.id.ll_my_asset)
    LinearLayout llMyAsset;
    @BindView(R.id.rl_person_data)
    RelativeLayout rlPersonData;
    @BindView(R.id.space)
    CardView space;
    @BindView(R.id.tv_all_order)
    TextView tvAllOrder;
    @BindView(R.id.space1)
    CardView space1;
    @BindView(R.id.iv_membership_area)
    ImageView ivMembershipArea;
    @BindView(R.id.ll_my_service)
    LinearLayout llMyService;
    @BindView(R.id.space2)
    CardView space2;
    @BindView(R.id.space_head)
    Space spaceHead;
    @BindView(R.id.tv_available_balance)
    TextView tvAvailableBalance;
    @BindView(R.id.account_income)
    TextView tvAccountIncome;
    @BindView(R.id.tv_advertising_wallet)
    TextView tvAdvertisingWallet;
    @BindView(R.id.tv_jinyuan_num)
    TextView tvJinyuanNum;
    private Unbinder unbinder;

    //    private int[] icon = {R.mipmap.to_be_paid, R.mipmap.ready_for_shipment, R.mipmap.to_be_received, R.mipmap.flash_sale,
//            R.mipmap.flash_sale};
    private int[] icon = {R.mipmap.to_be_paid, R.mipmap.ready_for_shipment, R.mipmap.to_be_received, R.mipmap.flash_sale
    };
    //    private String[] iconName = {"待付款", "待发货", "待收货", "团抢订单", "抽奖订单"};
    private String[] iconName = {"待付款", "待发货", "待收货", "团抢订单"};
    private SimpleAdapter sim_adapter;
    private ArrayList<Map<String, Object>> data_list;

    //    private int[] serviceIcon = {R.mipmap.mark, R.mipmap.shopping_cart_full, R.mipmap.qr_code, R.mipmap.recharge_account,
//            R.mipmap.suggestions, R.mipmap.invite_friends, R.mipmap.address, R.mipmap.lucky_draw_records};
    private int[] serviceIcon = {R.mipmap.shopping_cart_full, R.mipmap.coupon_my, R.mipmap.address, R.mipmap.luck_draw1,
            R.mipmap.customer_service1, R.mipmap.mark, R.mipmap.cooperation, R.mipmap.suggestions};
    //    private String[] serviceIconName = {"收藏", "购物车", "邀请推广", "账户明细", "建议", "朋友圈", "收货地址", "抽奖记录"};
    private String[] serviceIconName = {"购物车", "我的券", "收货地址", "转奖记录", "官方客服", "我的收藏", "商务合作", "建议"};

    private int[] myExtensionIcon = {R.mipmap.crown, R.mipmap.horn_extension, R.mipmap.invitation, R.mipmap.wechat_tutor
    };
    private String[] myExtensionName = {"会员中心", "邀请推广", "我的邀请", "我的导师"};


    private ArrayList<Map<String, Object>> serviceDataList;
    private GridOrderAdapter gridOrderAdapter;
    private int num = 199;
    private List<String> mList;
    private int currentPosition;
    private ArrayList<Map<String, Object>> myExtensionDataList;
    private DataRepository dataRepository;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }


    private void initView() {
        grid();
        gridMyExtension();
        gridMyService();
    }


    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
        getUserInfo();
        mList = new ArrayList<>();
        mList.add("https://img.zcool.cn/community/013de756fb63036ac7257948747896.jpg");
        mList.add("https://img.zcool.cn/community/01639a56fb62ff6ac725794891960d.jpg");
        mList.add("https://img.zcool.cn/community/01270156fb62fd6ac72579485aa893.jpg");
        mList.add("https://img.zcool.cn/community/01233056fb62fe32f875a9447400e1.jpg");
        mList.add("https://img.zcool.cn/community/016a2256fb63006ac7257948f83349.jpg");
    }

    private void getUserInfo() {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.info");
        map.put("site_token", "123456");
        dataRepository.getUserInfo(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                UserInfoBean userInfoBean = (UserInfoBean) data;
                if (userInfoBean.isStatus()) {
                    UserInfoBean.DataBean dataBean = userInfoBean.getData();
                    tvAvailableBalance.setText(userInfoBean.getData().getBalance());
                    tvAccountIncome.setText(userInfoBean.getData().getCommission()+"");
                    tvIdentification.setText(userInfoBean.getData().getGrade_name());
//                    tvAdvertisingWallet.setText(userInfoBean.getData());广告钱包
                    tvJinyuanNum.setText(userInfoBean.getData().getGrade()+"");
                    tvNickname.setText(userInfoBean.getData().getNickname());
                    Glide.with(getContext()).load(userInfoBean.getData().getAvatar()).centerCrop().into(ivHead);
                }


            }
        });
    }


    private void grid() {
        data_list = new ArrayList<>();
        //获取数据
        getData();
        //新建适配器
//        String[] from = {"image", "text"};
//        int[] to = {R.id.image, R.id.text};
//        sim_adapter = new SimpleAdapter(getContext(), data_list, R.layout.grid_item_order, from, to);
        //配置适配器
        gridOrderAdapter = new GridOrderAdapter(getActivity(), data_list, num);
        gridView.setAdapter(gridOrderAdapter);
        gridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), OrderActivity.class);
                switch (position) {
                    case 0: //待付款
                        intent.putExtra("type", Type.Payment);
                        startActivity(intent);
                        break;
                    case 1: //待发货
                        intent.putExtra("type", Type.Delivery);
                        startActivity(intent);
                        break;
                    case 2: //待收货
                        intent.putExtra("type", Type.Received);
                        startActivity(intent);
                        break;
                    case 3: //团购
                        intent.putExtra("type", Type.GroupPurchase);
                        startActivity(intent);
                        break;
                    case 4: //抽奖
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public List<Map<String, Object>> getData() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data_list.add(map);
        }
        return data_list;
    }

    private void gridMyService() {
        serviceDataList = new ArrayList<>();
        //获取数据
        getServiceData();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter = new SimpleAdapter(getContext(), serviceDataList, R.layout.gird_item_service, from, to);
        //配置适配器
        gridMyService.setAdapter(sim_adapter);
        gridMyService.setSelector(new ColorDrawable(Color.TRANSPARENT));
        gridMyService.setOnItemClickListener(this);
    }

    public List<Map<String, Object>> getServiceData() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < serviceIcon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", serviceIcon[i]);
            map.put("text", serviceIconName[i]);
            serviceDataList.add(map);
        }
        return serviceDataList;
    }

    private void gridMyExtension() {
        myExtensionDataList = new ArrayList<>();
        //获取数据
        getMyExtension();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter = new SimpleAdapter(getContext(), myExtensionDataList, R.layout.gird_item_my_extension, from, to);
        //配置适配器
        gridMyExtension.setAdapter(sim_adapter);
        gridMyExtension.setSelector(new ColorDrawable(Color.TRANSPARENT));
        gridMyExtension.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0://会员中心
                        break;
                    case 1://邀请推广
                        showPopUpWindow();
                        break;
                    case 2://我的邀请
                        break;
                    case 3://我的导师
                        break;
                }
            }
        });
    }

    public List<Map<String, Object>> getMyExtension() {
        //cion和iconName的长度是相同的，这里任选其一都可以
        for (int i = 0; i < myExtensionIcon.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", myExtensionIcon[i]);
            map.put("text", myExtensionName[i]);
            myExtensionDataList.add(map);
        }
        return myExtensionDataList;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


    @OnClick({R.id.tv_modification_personal_data, R.id.ll_available_balance, R.id.ll_account_balance, R.id.ll_my_coupons, R.id.iv_membership_area
            , R.id.iv_head, R.id.tv_all_order, R.id.ll_my_jinyuan})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_available_balance:
                ActivityUtils.startActivity(getActivity(), AvailableBalanceActivity.class);
                break;
            case R.id.ll_account_balance:
                ActivityUtils.startActivity(getActivity(), AccountBalanceActivity.class);
                break;
            case R.id.ll_my_coupons:
                ActivityUtils.startActivity(getActivity(), MyCouponsActivity.class);
                break;
            case R.id.iv_membership_area:
                ActivityUtils.startActivity(getActivity(), OpenMembershipActivity.class);
                break;
            case R.id.tv_modification_personal_data:
                ActivityUtils.startActivity(getActivity(), PersonalDataActivity.class);
                break;

            case R.id.tv_all_order:
                Intent intent = new Intent(getContext(), OrderActivity.class);
                intent.putExtra("type", Type.All);
                startActivity(intent);
                break;
            case R.id.iv_head:
                ActivityUtils.startActivity(getActivity(), PersonalDataActivity.class);
                break;
            case R.id.ll_my_jinyuan:
                ActivityUtils.startActivity(getActivity(), JinYuanActivity.class);
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0://购物车
                ActivityUtils.startActivity(getActivity(), ShoppingCartActivity.class);
                break;
            case 1://我的券
                ActivityUtils.startActivity(getActivity(), MyCouponsActivity.class);
                break;
            case 2://收货地址
                ActivityUtils.startActivity(getActivity(), AddressActivity.class);
                break;
            case 3://转奖记录
                break;
            case 4:// 官方客服
                break;
            case 5://朋友圈 我的收藏
                ActivityUtils.startActivity(getActivity(), MyCollectionActivity.class);
                break;
            case 6://商务合作
                break;
            case 7://建议
                ActivityUtils.startActivity(getActivity(), AdviseActivity.class);
                break;

        }
    }

    private void showPopUpWindow() {
//        new XPopup.Builder(getContext())
//                .asCustom(new CustomPopup(getContext()))
//                .show();
        new TDialog.Builder(getActivity().getSupportFragmentManager())
                .setLayoutRes(R.layout.custom_popup)    //设置弹窗展示的xml布局
                .setScreenWidthAspect(getContext(), 1f)   //设置弹窗宽度(参数aspect为屏幕宽度比例 0 - 1f)
                .setScreenHeightAspect(getContext(), 1f)
                .setOnBindViewListener(new OnBindViewListener() {   //通过BindViewHolder拿到控件对象,进行修改
                    @Override
                    public void bindView(BindViewHolder bindViewHolder) {
                        Banner banner = bindViewHolder.getView(R.id.banner);
                        banner.setBannerGalleryEffect(20, 20, 20)
                                .isAutoLoop(false)
                                .setAdapter(new BannerImageAdapter<String>(mList) {
                                    @Override
                                    public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                                        currentPosition = position - 1;
                                        //图片加载自己实现
                                        Glide.with(holder.itemView)
                                                .load(R.mipmap.delete_9)
                                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                                .into(holder.imageView);
                                    }
                                })
                                .setIndicator(new CircleIndicator(getContext()));
                    }
                })
                .addOnClickListener(R.id.ll_share, R.id.ll_save_pic, R.id.tv_title)   //添加进行点击控件的id
                .setOnViewClickListener(new OnViewClickListener() {     //View控件点击事件回调
                    @Override
                    public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
                        switch (view.getId()) {
                            case R.id.ll_save_pic:
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            final Bitmap myBitmap = Glide.with(getContext())//上下文
                                                    .asBitmap() //必须
                                                    .load(mList.get(currentPosition))//url
                                                    .centerCrop()
                                                    .into(500, 500)
                                                    .get();
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    SaveImageUtils.saveImageToGallerys(getContext(), myBitmap);
                                                }
                                            });

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }).start();
                                break;
                        }
                    }
                })
                .create()   //创建TDialog
                .show();    //展示
    }

}
