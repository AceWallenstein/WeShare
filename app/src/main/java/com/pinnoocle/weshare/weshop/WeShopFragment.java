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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.GoodsAdapter;
import com.pinnoocle.weshare.adapter.MenuAdapter;
import com.pinnoocle.weshare.adapter.RecommendAdapter;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.ScreenUtil;
import com.pinnoocle.weshare.widget.TagsGridView;
import com.to.aboomy.banner.Banner;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.ScaleInTransformer;

import org.greenrobot.eventbus.EventBus;

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
public class WeShopFragment extends Fragment implements AdapterView.OnItemClickListener, BaseAdapter.OnItemClickListener {

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


    private Unbinder unbinder;
    //    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend,
//            R.mipmap.tiao_sao_market};
    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend};
//    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐", "跳蚤市场"};

    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐"};

    List<String> menus = new ArrayList<>();
    private SimpleAdapter sim_adapter;
    private ArrayList<Map<String, Object>> data_list;

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
        initBanner();
        initRecommend();
        initGoodsList();
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
    private void initData() {

    }


    private void initMenus() {

        rvMenus.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        MenuAdapter menuAdapter = new MenuAdapter(getContext());
//        menuAdapter.setData(menus);
        menuAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                if (position == 0)
                    return;
                Intent intent = new Intent(getContext(), GoodsListActivity.class);
                intent.putExtra("title", menus.get(position));
                getActivity().startActivity(intent);

            }
        });
        rvMenus.setAdapter(menuAdapter);
    }


    private void initBanner() {
        List<String> mList = new ArrayList<>();
        mList.add("https://img.zcool.cn/community/013de756fb63036ac7257948747896.jpg");
        mList.add("https://img.zcool.cn/community/01639a56fb62ff6ac725794891960d.jpg");
        mList.add("https://img.zcool.cn/community/01270156fb62fd6ac72579485aa893.jpg");
        mList.add("https://img.zcool.cn/community/01233056fb62fe32f875a9447400e1.jpg");
        mList.add("https://img.zcool.cn/community/016a2256fb63006ac7257948f83349.jpg");

        IndicatorView qyIndicator = new IndicatorView(getContext())
                .setIndicatorColor(Color.DKGRAY)
                .setIndicatorSelectorColor(Color.WHITE);
        banner.setIndicator(qyIndicator)
                .setHolderCreator(new ImageHolderCreator())
                .setPageMargin(ScreenUtil.dip2px(getContext(), 10), ScreenUtil.dip2px(getContext(), 10))
                .setPageTransformer(true, new ScaleInTransformer())
                .setPages(mList);
    }

    private int dip2px(float dp) {
        return (int) (dp * getContext().getResources().getDisplayMetrics().density);
    }

    private void initRecommend() {
        rvRecommend.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        RecommendAdapter recommendAdapter = new RecommendAdapter(getContext());
        RecommendBean bean = new RecommendBean("Ray竹炭纤维面膜", "抢购价:￥38.90", "10月31日16点56分截止", "");
        RecommendBean bean1 = new RecommendBean("Ray竹炭纤维面膜", "抢购价:￥38.90", "10月31日16点56分截止", "");
        List<RecommendBean> list = new ArrayList<>();
        list.add(bean);
        list.add(bean1);
        recommendAdapter.setData(list);
        recommendAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {

            }
        });
        rvRecommend.setAdapter(recommendAdapter);
    }

    private void initGoodsList() {
        rvRecommend.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecommendAdapter recommendAdapter = new RecommendAdapter(getContext());
        GoodsAdapter goodsAdapter = new GoodsAdapter(getContext());
        RecommendBean bean = new RecommendBean("Ray竹炭纤维面膜", "抢购价:￥38.90", "10月31日16点56分截止", "");
        RecommendBean bean1 = new RecommendBean("Ray竹炭纤维面膜", "抢购价:￥38.90", "10月31日16点56分截止", "");

        GoodsBean goodsBean = new GoodsBean("居家日用百货 任选5款blablablablablabla...", "14.50", "15.51", "", "172");
        List<RecommendBean> list = new ArrayList<>();
        List<GoodsBean> list_ = new ArrayList<>();
        list.add(bean);
        list.add(bean1);
        list_.add(goodsBean);
        list_.add(goodsBean);
        list_.add(goodsBean);
        list_.add(goodsBean);
        list_.add(goodsBean);
        list_.add(goodsBean);
        recommendAdapter.setData(list);
        recommendAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                ActivityUtils.startActivity(getContext(),GoodsDetailActivity.class);
            }
        });
        rvRecommend.setAdapter(recommendAdapter);
        goodsAdapter.setData(list_);
        goodsAdapter.setOnItemClickListener(this);
        rvFavorite.setAdapter(goodsAdapter);
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
        startActivity(intent);
    }

    public class ImageHolderCreator implements com.to.aboomy.banner.HolderCreator {
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