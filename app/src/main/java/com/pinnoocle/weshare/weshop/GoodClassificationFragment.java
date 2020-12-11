package com.pinnoocle.weshare.weshop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ClassificationAdapter;
import com.pinnoocle.weshare.adapter.GoodsListAdapter;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
/*
分类界面
 */
public class GoodClassificationFragment extends Fragment {
    @BindView(R.id.rv_classification)
    RecyclerView rvClassification;
    @BindView(R.id.rv_goods_list)
    RecyclerView rvGoodsList;
    private Unbinder unbinder;
    private ClassificationAdapter classificationAdapter;
    private GoodsListAdapter goodsListAdapter;
    private List<GoodsBean> list = new ArrayList<>();

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
        return view;
    }

    private void initView() {
        classificationAdapter = new ClassificationAdapter(getContext());
        goodsListAdapter = new GoodsListAdapter(getContext());
        rvClassification.setLayoutManager(new LinearLayoutManager(getContext()));
        rvClassification.setAdapter(classificationAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int type = goodsListAdapter.getItemViewType(position);
                if (type == 1) {
                    return 3;//banner占据3个单元格
                }
                return 1;
            }
        });
        rvGoodsList.setLayoutManager(gridLayoutManager);
        rvGoodsList.setAdapter(goodsListAdapter);
        List<String> classification = new ArrayList<>();
        classification.add("女装");
        classification.add("美妆");
        classification.add("鞋包");
        classification.add("内衣");
        classification.add("百货");
        classification.add("食品");
        classification.add("洗护");
        classification.add("电器");
        classification.add("饰品");
        classification.add("车品");
        classification.add("保健");
        classificationAdapter.setData(classification);
        classificationAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                classificationAdapter.setPos(position);
                getGoods(position);
            }
        });

    }

    private void getGoods(int position) {
        if (position == 0)//女装
        {
            GoodsBean goodsBean = new GoodsBean("女装女装女装女装...", "14.50", "15.51", "", "172");
            for (int i = 0; i < 11; i++) {
                list.add(goodsBean);
            }
        }else {
            list.clear();

        }
        goodsListAdapter.setData(list);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
