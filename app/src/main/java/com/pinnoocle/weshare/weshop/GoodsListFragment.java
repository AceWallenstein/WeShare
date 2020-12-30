package com.pinnoocle.weshare.weshop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.GoodsAdapter;
import com.pinnoocle.weshare.bean.AddCartBean;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.GoodsBeanDelete;
import com.pinnoocle.weshare.bean.UpdateTotalPriceEvent;
import com.pinnoocle.weshare.bean.UserPointLogBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.BuyCountSortEvent;
import com.pinnoocle.weshare.event.ComprehensiveEvent;
import com.pinnoocle.weshare.event.GoodsSearchEvent;
import com.pinnoocle.weshare.event.PriceSortEvent;
import com.pinnoocle.weshare.mine.JinYuanDetailActivity;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;
import com.pinnoocle.weshare.utils.FastData;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
商品列表
 */
public class GoodsListFragment extends Fragment implements OnRefreshLoadMoreListener {
    private String cat_id;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private Unbinder unbinder;
    private GoodsAdapter goodsAdapter;
    private DataRepository dataRepository;
    private int page = 1;
    private String where;
    private String order = new String();
    private ArrayList<GoodsBean.DataBean.ListBean> dataBeanList = new ArrayList<>();

    public GoodsListFragment(String cat_id,String searchName) {
        this.cat_id = cat_id;
        if (cat_id != null) {
            where = "{\"cat_id\":\"" + cat_id + "\"}";
        }else if(searchName!=null) {
            where = "{\"search_name\":\"" + searchName + "\"}";
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_goods_list, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
    }

    private void initView() {
        goodsAdapter = new GoodsAdapter(getContext());
        recycleView.setAdapter(goodsAdapter);
        recycleView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        refresh.setOnRefreshLoadMoreListener(this);
        goodsAdapter.setmOnItemDataClickListener(new BaseAdapter.OnItemDataClickListener<GoodsBean.DataBean.ListBean>() {
            @Override
            public void onItemViewClick(View view, int position, GoodsBean.DataBean.ListBean listBean) {
                if (view.getId() == R.id.iv_shop_car) {
                    addCart(listBean.getProduct().getId(), 1);
                    return;
                }
                Intent intent = new Intent(getContext(), GoodsDetailActivity.class);
                intent.putExtra(Constants.ID, listBean.getId() + "");
                startActivity(intent);

            }
        });
    }

    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
        goodsList();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(GoodsSearchEvent event) {
        if (!TextUtils.isEmpty(where)) {
            where = where.substring(0, where.length() - 1) + "," + "\"search_name\":\"" + event.getSearchName() + "\"}";
        } else {
            where = "{\"search_name\":\"" + event.getSearchName() + "\"}";
        }
        dataBeanList.clear();
        goodsList();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(BuyCountSortEvent event) {
        order = event.getSort();
        dataBeanList.clear();
        goodsList();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(ComprehensiveEvent event) {
        order = "";
        dataBeanList.clear();
        goodsList();
    }

    @Subscribe(threadMode = ThreadMode.MAIN, priority = 100, sticky = false) //在ui线程执行，优先级为100
    public void onEvent(PriceSortEvent event) {
        order = event.getSort();
        dataBeanList.clear();
        goodsList();
    }

    private void goodsList() {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("method", "goods.getlist");
        map.put("site_token", "123456");
        map.put("page", page + "");//
        map.put("where", where);//
        map.put("order", order);//
        dataRepository.getGoodsList(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
                refresh.finishRefresh(false);
                refresh.finishLoadMore(false);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                refresh.finishRefresh();
                GoodsBean goodsBean = (GoodsBean) data;
                if (goodsBean.isStatus()) {
                    if (goodsBean.getData().getPage() == goodsBean.getData().getTotal_page()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }
                    dataBeanList.addAll(goodsBean.getData().getList());
                    goodsAdapter.setData(dataBeanList);
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


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        goodsList();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
        goodsList();
    }
}
