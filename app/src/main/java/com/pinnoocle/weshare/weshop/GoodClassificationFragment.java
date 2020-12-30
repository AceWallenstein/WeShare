package com.pinnoocle.weshare.weshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ChildAdapter;
import com.pinnoocle.weshare.adapter.ClassificationAdapter;
import com.pinnoocle.weshare.adapter.GoodsListAdapter;
import com.pinnoocle.weshare.bean.ChildCatBean;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.GoodsBeanDelete;
import com.pinnoocle.weshare.bean.TopCatBean;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
分类界面
 */
public class GoodClassificationFragment extends Fragment implements BaseAdapter.OnItemClickListener {
    @BindView(R.id.rv_classification)
    RecyclerView rvClassification;
    @BindView(R.id.rv_goods_list)
    RecyclerView rvGoodsList;
    private Unbinder unbinder;
    private ClassificationAdapter classificationAdapter;
    private ChildAdapter childAdapter;
    private DataRepository dataRepository;
    private List<TopCatBean.DataBean> topCats;
    private List<ChildCatBean.DataBean> childCatBeanData;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_good_classification, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView();
        initData();
        return view;
    }


    private void initView() {
        classificationAdapter = new ClassificationAdapter(getContext());
        rvClassification.setLayoutManager(new LinearLayoutManager(getContext()));
        rvClassification.setAdapter(classificationAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rvGoodsList.setLayoutManager(gridLayoutManager);
        childAdapter = new ChildAdapter(getContext());
        rvGoodsList.setAdapter(childAdapter);
        classificationAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                classificationAdapter.setPos(position);
                getChildCat(topCats.get(position).getId());
            }
        });
        childAdapter.setOnItemClickListener(this);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(getContext());
        getTopCat();
    }

    private void getTopCat() {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("method", "categories.gettopcat");
        map.put("site_token", "123456");
        dataRepository.getTopCat(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                TopCatBean topCatBean = (TopCatBean) data;
                if (topCatBean.isStatus()) {
                    topCats = topCatBean.getData();
                    classificationAdapter.setData(topCats);
                }
                getChildCat(topCats.get(0).getId());
            }
        });
    }

    private void getChildCat(int parent_id) {
        ViewLoading.show(getContext());
        Map<String, String> map = new HashMap<>();
        map.put("method", "categories.getchildcat");
        map.put("site_token", "123456");
        map.put("parent_id", parent_id + "");
        dataRepository.getChildCat(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(getContext());
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(getContext());
                ChildCatBean childCatBean = (ChildCatBean) data;
                if (childCatBean.isStatus()) {
                    childCatBeanData = childCatBean.getData();
                    childAdapter.setData(childCatBeanData);
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
    public void onItemViewClick(View view, int position) {
        Intent intent = new Intent(getContext(), GoodsListActivity.class);
        intent.putExtra("title", childCatBeanData.get(position).getName());
        intent.putExtra("cat_id", childCatBeanData.get(position).getId() + "");
        startActivity(intent);
    }
}
