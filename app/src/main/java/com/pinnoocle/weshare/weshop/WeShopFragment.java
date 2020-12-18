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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.MenuAdapter;
import com.pinnoocle.weshare.adapter.RecommendAdapter;
import com.pinnoocle.weshare.adapter.TqmAdapter;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.ScreenUtil;
import com.pinnoocle.weshare.widget.TagsGridView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.to.aboomy.banner.Banner;
import com.to.aboomy.banner.HolderCreator;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.ScaleInTransformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
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


    private Unbinder unbinder;
    //    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend,
//            R.mipmap.tiao_sao_market};
    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend};
//    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐", "跳蚤市场"};

    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐"};

    List<HomeBean.DataBeanXX.CategoryBean> menus = new ArrayList<>();
    private SimpleAdapter sim_adapter;
    private ArrayList<Map<String, Object>> data_list;
    private DataRepository dataRepository;
    private MenuAdapter menuAdapter;
    private int page = 1;
    private RecommendAdapter recommendAdapter;
    private List<RecommendBean.DataBean.ListBean> recommendList = new ArrayList<>();
    private TqmAdapter tqmAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
        grid();
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
                        getActivity().startActivity(intent);

                    }
                    return true;
                }
                return false;
            }
        });

    }

    private void initTqmList() {
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
        map.put("token", "b2fb4c51356d2087d859575b7e74cd4c");
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
                    if (homeBean.getData().getTqm_list().isStatus()) {
                        tqmAdapter.setData(homeBean.getData().getTqm_list().getData());
                    }

                }
            }
        });
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


    private void initMenus() {

        rvMenus.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        menuAdapter = new MenuAdapter(getContext());
//        menuAdapter.setData(menus);
        menuAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                if (position == 0)
                    return;
                Intent intent = new Intent(getContext(), GoodsListActivity.class);
//                intent.putExtra(Constants., menus.get(position).getId()+"");
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
                                ToastUtils.showToast(list.get(index).getCode());
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
        if (view.getId() == R.id.iv_shop_car) {
            ToastUtils.showToast("加入购物车");
            return;
        }
        Intent intent = new Intent(getContext(), GoodsDetailActivity.class);
        RecommendBean.DataBean.ListBean listBean = recommendList.get(position);
        if (listBean != null) {
            intent.putExtra(Constants.ID, listBean.getId()+"");
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