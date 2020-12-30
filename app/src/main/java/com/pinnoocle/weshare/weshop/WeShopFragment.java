package com.pinnoocle.weshare.weshop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.dd.ShadowLayout;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.MenuAdapter;
import com.pinnoocle.weshare.adapter.RecommendAdapter;
import com.pinnoocle.weshare.adapter.TqmAdapter;
import com.pinnoocle.weshare.bean.AddCartBean;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.GoodsSearchEvent;
import com.pinnoocle.weshare.mine.ShoppingCartActivity;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.ScreenUtil;
import com.pinnoocle.weshare.widget.TagsGridView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.sunfusheng.marqueeview.MarqueeView;
import com.to.aboomy.banner.Banner;
import com.to.aboomy.banner.HolderCreator;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.ScaleInTransformer;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/*
你我共享
 */
public class WeShopFragment extends Fragment implements AdapterView.OnItemClickListener, BaseAdapter.OnItemClickListener, OnRefreshLoadMoreListener {

    @BindView(R.id.ed_search)
    EditText edSearch;
    @BindView(R.id.rv_menus)
    RecyclerView rvMenus;
    @BindView(R.id.gridView)
    TagsGridView gridView;
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.rv_recommend)
    RecyclerView rvRecommend;
    @BindView(R.id.rv_favorite)
    RecyclerView rvFavorite;
    @BindView(R.id.iv_menu)
    ImageView ivMenu;
    @BindView(R.id.tv_recommend)
    TextView tvRecommend;
    @BindView(R.id.iv_right)
    ImageView ivRight;
    @BindView(R.id.rl_recommend)
    RelativeLayout rlRecommend;
    @BindView(R.id.tv_favorite)
    TextView tvFavorite;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    @BindView(R.id.scrollview)
    NestedScrollView scrollview;
    @BindView(R.id.fab_top)
    ShadowLayout fab_top;
    @BindView(R.id.marqueeView)
    MarqueeView marqueeView;
    @BindView(R.id.iv_picture)
    ImageView ivPicture;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.iv_picture1)
    ImageView ivPicture1;
    @BindView(R.id.tv_type1)
    TextView tvType1;
    @BindView(R.id.tv_time1)
    TextView tvTime1;
    @BindView(R.id.iv_picture2)
    ImageView ivPicture2;
    @BindView(R.id.tv_type2)
    TextView tvType2;
    @BindView(R.id.tv_time2)
    TextView tvTime2;
    @BindView(R.id.cardView)
    CardView cardView;
    @BindView(R.id.cardView1)
    CardView cardView1;
    @BindView(R.id.cardView2)
    CardView cardView2;


    private Unbinder unbinder;
    //    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend,
//            R.mipmap.tiao_sao_market};
    private int[] icon = {R.mipmap.food, R.mipmap.wash, R.mipmap.baihuo, R.mipmap.children, R.mipmap.home_furnishing,
            R.mipmap.beautiful, R.mipmap.ornaments, R.mipmap.women_wear, R.mipmap.shoes, R.mipmap.home_more};
//    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐", "跳蚤市场"};

    private String[] iconName = {"食品", "洗护", "百货", "儿童母婴", "家居", "美妆", "饰品", "女装", "鞋靴", "更多"};

    List<HomeBean.DataBeanXX.CategoryBean> menus = new ArrayList<>();
    private SimpleAdapter sim_adapter;
    private ArrayList<Map<String, Object>> data_list;
    private DataRepository dataRepository;
    private MenuAdapter menuAdapter;
    private int page = 1;
    private RecommendAdapter recommendAdapter;
    private List<RecommendBean.DataBean.ListBean> recommendList = new ArrayList<>();
    private TqmAdapter tqmAdapter;
    private String notice_list;
    private List<String> titles = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        marqueeView.startFlipping();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        marqueeView.stopFlipping();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_we_shop, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }


    private void initView() {
        initMenus();
//        grid();
        initTqmList();//团购推荐
        initRecommend();
        refresh.setOnRefreshLoadMoreListener(this);
//        initGoodsList();
        gridView.setOnItemClickListener(this);
        edSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    ((InputMethodManager) edSearch.getContext().getSystemService(Context.INPUT_METHOD_SERVICE))
                            .hideSoftInputFromWindow(
                                    getActivity().getCurrentFocus().getWindowToken(),
                                    InputMethodManager.HIDE_NOT_ALWAYS);
                    if (edSearch.getText().toString().equals("")) {
                        ToastUtils.showToast("搜索内容不能为空");
                    } else {
                        Intent intent = new Intent(getContext(), GoodsListActivity.class);
                        intent.putExtra("title", "热卖商城");
                        String searchName = edSearch.getText().toString();
//                        EventBus.getDefault().post(new GoodsSearchEvent(searchName));
                        intent.putExtra("searchName", searchName);
                        getActivity().startActivity(intent);
                    }
                    return true;
                }
                return false;
            }
        });
        scrollview.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > 0) {
                    fab_top.setVisibility(View.VISIBLE);
                } else {
                    fab_top.setVisibility(View.GONE);
                }
            }
        });
    }

    private void initTqmList() {

    }

    private void initMarqueeView() {
        marqueeView.startWithList(titles);
        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
//                Intent intent1 = new Intent(getContext(), NoticeActivity.class);
//                intent1.putExtra("id", adList.get(position).getId());
//                startActivity(intent1);
            }
        });
    }

    private void initTqmList_() {  //不使用
        rvRecommend.setLayoutManager(new GridLayoutManager(getContext(), 2));
        tqmAdapter = new TqmAdapter(getContext());
//        tqmAdapter.setData(list_);
        tqmAdapter.setOnItemClickListener(this);
        rvRecommend.setAdapter(tqmAdapter);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
        homePage();
        recommend();
    }


    private void homePage() {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "app.index");
        map.put("site_token", "123456");
        dataRepository.homePage(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                HomeBean homeBean = (HomeBean) data;
                if (homeBean.isStatus()) {
                    menus = homeBean.getData().getCategory();
                    menuAdapter.setData(menus);
                    if (homeBean.getData().getBanner().isStatus()) {
                        List<HomeBean.DataBeanXX.BannerBean.DataBean.ListBean> list = homeBean.getData().getBanner().getData().getList();
                        initBanner(list);
                    }
                    notice_list = homeBean.getData().getNotice_list();
                    try {
                        dealJson(notice_list);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    initMarqueeView();
                    if (homeBean.getData().getTqm_list().isStatus()) {
//                        tqmAdapter.setData(homeBean.getData().getTqm_list().getData());
//                        List<ImageView> pics = new ArrayList<>();
//                        List<TextView> type = new ArrayList<>();
//                        List<TextView> time = new ArrayList<>();
//                        pics.add(ivPicture);
//                        pics.add(ivPicture1);
//                        pics.add(ivPicture2);
//                        type.add(tvType);
//                        type.add(tvType1);
//                        type.add(tvType2);
//                        time.add(tvTime);
//                        time.add(tvTime1);
//                        time.add(tvTime2);
//
//                        List<HomeBean.DataBeanXX.TqmListBean.DataBean> data1 = homeBean.getData().getTqm_list().getData();
//                        for (int i = 0; i < data1.size(); i++) {
//                           Glide.with(getContext()).load(data1.get(i).getImage_url()).centerCrop().into( pics.get(i));
//                            type.get(i).setText(data1.get(i).getCat_name());
//                            time.get(i).setText(data1.get(i).getEnd_time()+"截止");
//                            ;
//                        }
                        List<HomeBean.DataBeanXX.TqmListBean.DataBean> data1 = homeBean.getData().getTqm_list().getData();
                        Glide.with(getContext()).load(data1.get(0).getImage_url()).centerCrop().into(ivPicture);
                        tvTime.setText(data1.get(0).getEnd_time() + "截止");  //团抢
                        List<HomeBean.DataBeanXX.TqmList2Bean.DataBean> data2 = homeBean.getData().getTqm_list2().getData();
                        Glide.with(getContext()).load(data2.get(0).getImage_url()).centerCrop().into(ivPicture1);
                        tvTime1.setText(data2.get(0).getStart_time() + "开抢");//即将团抢

                    }

                }
            }
        });
    }

    private void dealJson(String notice_list) throws JSONException {
        JSONObject jsonObject = new JSONObject(notice_list);
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            List<String> list = new ArrayList<>();
            JSONObject jsonObject1 = (JSONObject) jsonObject.get(key);
            String title = jsonObject1.getString("title");
            titles.add(title);
        }
    }

    private void recommend() {
        refresh.setNoMoreData(false);
        Map<String, String> map = new HashMap<>();
        map.put("method", "goods.getlist");
        map.put("site_token", "123456");
        map.put("where", "{\"hot\":1,\"is_tqm\":1}");
        map.put("page", page + "");
        dataRepository.recommend(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                refresh.finishRefresh(false);
            }

            @Override
            public void onSuccess(Object data) {
                refresh.finishRefresh();
                RecommendBean recommendBean = (RecommendBean) data;
                if (recommendBean.isStatus()) {
                    if (recommendBean.getData().getPage() <= recommendBean.getData().getTotal_page()) {
                        recommendList.addAll(recommendBean.getData().getList());
                        recommendAdapter.setData(recommendList);
                        refresh.finishLoadMore();
                    } else {
                        refresh.finishLoadMoreWithNoMoreData();
                    }
                }
            }
        });
    }

    private void addCart(int product_id, int nums) {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "cart.add");
        map.put("site_token", "123456");
        map.put("product_id", product_id + "");
        map.put("nums", nums + "");
        dataRepository.addCart(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                AddCartBean addCartBean = (AddCartBean) data;
                if (addCartBean.isStatus()) {
                    ToastUtils.showToast("加入购物车成功！");
                }

            }

        });
    }


    private void initMenus() {
        rvMenus.setLayoutManager(new GridLayoutManager(getContext(), 5));
        menuAdapter = new MenuAdapter(getContext());
//        menuAdapter.setData(menus);
        menuAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                if (position == 9) {
                    Intent intent = new Intent(getContext(), GoodClassificationActivity.class);
                    getActivity().startActivity(intent);
                    return;
                }
                Intent intent = new Intent(getContext(), GoodsListActivity.class);
                intent.putExtra("title", menus.get(position).getName());
                intent.putExtra("cat_id", menus.get(position).getId() + "");
                getActivity().startActivity(intent);

            }
        });
        rvMenus.setAdapter(menuAdapter);
    }


    private void initBanner(List<HomeBean.DataBeanXX.BannerBean.DataBean.ListBean> list) {
        List<String> mList = new ArrayList<>();
        for (HomeBean.DataBeanXX.BannerBean.DataBean.ListBean listBean : list) {
            mList.add(listBean.getImg());
        }
        IndicatorView qyIndicator = new IndicatorView(getContext())
                .setIndicatorColor(Color.DKGRAY)
                .setIndicatorSelectorColor(Color.WHITE);
        banner.setIndicator(qyIndicator)
                .setHolderCreator(new ImageHolderCreator() {
                    @Override
                    public View createView(Context context, int index, Object o) {
                        ImageView iv = new ImageView(context);
                        iv.setScaleType(ImageView.ScaleType.FIT_XY);
                        Glide.with(iv).load(o).apply(new RequestOptions().transform(new RoundedCorners(ScreenUtil.dip2px(getContext(), 10)))).into(iv);
                        //内部实现点击事件
                        iv.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
//                                ToastUtils.showToast(list.get(index).getCode());
                            }
                        });
                        return iv;
                    }
                })
                .setPageMargin(ScreenUtil.dip2px(getContext(), 10), ScreenUtil.dip2px(getContext(), 10))
                .setPageTransformer(true, new ScaleInTransformer())
                .setPages(mList);
    }

    private int dip2px(float dp) {
        return (int) (dp * getContext().getResources().getDisplayMetrics().density);
    }


    private void initRecommend() {
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recommendAdapter = new RecommendAdapter(getContext());
//        recommendAdapter.setData(list_);
        recommendAdapter.setOnItemClickListener(this);
        rvFavorite.setAdapter(recommendAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            ActivityUtils.startActivity(getContext(), GroupSeckillActivity.class);
        } else if (position == 1) {
            Intent intent = new Intent(getContext(), GoodsListActivity.class);
            intent.putExtra("title", "热卖商城");
            getActivity().startActivity(intent);
        } else if (position == 2) {
            ToastUtils.showToast("此功能正在开发，让我们一起期待更多精彩功能！");
        } else if (position == 3) {
            ToastUtils.showToast("此功能正在开发，让我们一起期待更多精彩功能！");

        } else if (position == 4) {
        }
    }

    @Override
    public void onItemViewClick(View view, int position) {
        RecommendBean.DataBean.ListBean listBean = recommendList.get(position);
        if (view.getId() == R.id.iv_shop_car) {
            addCart(listBean.getProduct().getId(), 1);
            return;
        }
        Intent intent = new Intent(getContext(), GoodsDetailActivity.class);
        if (listBean != null) {
            intent.putExtra(Constants.ID, listBean.getId() + "");
            startActivity(intent);
        }
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        recommend();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        recommendList.clear();
        recommend();
    }

    @OnClick({R.id.fab_shop_car, R.id.fab_top, R.id.cardView, R.id.cardView1, R.id.cardView2, R.id.tv_more, R.id.rl_group_skill})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fab_shop_car:
                ActivityUtils.startActivity(getContext(), ShoppingCartActivity.class);
                break;
            case R.id.fab_top:
                scrollview.scrollTo(0, 0);
                break;
            case R.id.cardView:
                break;
            case R.id.cardView1:
                break;
            case R.id.cardView2:
                ActivityUtils.startActivity(getContext(), GroupSeckillActivity.class);
                break;
            case R.id.tv_more:
                Intent intent = new Intent(getContext(), GoodsListActivity.class);
                intent.putExtra("title", "热卖商城");
                getActivity().startActivity(intent);                break;
            case R.id.rl_group_skill:
                ActivityUtils.startActivity(getContext(), GroupSeckillActivity.class);
                break;

        }
    }

    public class ImageHolderCreator implements HolderCreator {
        @Override
        public View createView(final Context context, final int index, Object o) {
            ImageView iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(iv).load(o).apply(new RequestOptions().transform(new RoundedCorners(ScreenUtil.dip2px(getContext(), 10)))).into(iv);
            //内部实现点击事件
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            return iv;
        }
    }


    private void grid() {
        data_list = new ArrayList<Map<String, Object>>();
        //获取数据
        getData();
        //新建适配器
        String[] from = {"image", "text"};
        int[] to = {R.id.image, R.id.text};
        sim_adapter = new SimpleAdapter(getContext(), data_list, R.layout.item, from, to);
        //配置适配器
        gridView.setAdapter(sim_adapter);
        gridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}