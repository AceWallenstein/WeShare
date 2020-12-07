package com.pinnoocle.weshare.weshop;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.MenuAdapter;
import com.pinnoocle.weshare.adapter.RecommendAdapter;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.utils.ScreenUtil;
import com.pinnoocle.weshare.widget.TagsGridView;
import com.to.aboomy.banner.Banner;
import com.to.aboomy.banner.IndicatorView;
import com.to.aboomy.banner.ScaleInTransformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class WeShopFragment extends Fragment implements AdapterView.OnItemClickListener {

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
    private int[] icon = {R.mipmap.groupon_seckill, R.mipmap.hot_selling_mall, R.mipmap.luck_draw, R.mipmap.recommend,
            R.mipmap.tiao_sao_market};
    private String[] iconName = {"团购秒杀", "热卖商城", "0元抽奖", "想买与推荐", "跳蚤市场"};

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
        return view;
    }

    private void initView() {
        initMenus();
        grid();
        initBanner();
        initRecommend();
        initGoodsList();
        gridView.setOnItemClickListener(this);
    }


    private void initMenus() {
        menus.add("推荐");
        menus.add("食品");
        menus.add("洗护");
        menus.add("百货");
        menus.add("儿童母婴");
        menus.add("家居");
        menus.add("美妆");
        menus.add("饰品");
        menus.add("女装");
        menus.add("男装");
        menus.add("鞋靴");
        menus.add("箱包");
        menus.add("数码家电");
        menus.add("服务");
        rvMenus.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        MenuAdapter menuAdapter = new MenuAdapter(getContext());
        menuAdapter.setData(menus);
        menuAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                ToastUtils.showToast(menus.get(position));
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
        } else if (position == 1) {
        } else if (position == 2) {
        } else if (position == 3) {
        } else if (position == 4) {
        }
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