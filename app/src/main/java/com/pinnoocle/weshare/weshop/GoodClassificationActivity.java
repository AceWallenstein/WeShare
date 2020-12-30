package com.pinnoocle.weshare.weshop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ChildAdapter;
import com.pinnoocle.weshare.adapter.ChildForActivityAdapter;
import com.pinnoocle.weshare.adapter.ClassificationAdapter;
import com.pinnoocle.weshare.bean.ChildCatBean;
import com.pinnoocle.weshare.bean.TopCatBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.ActivityUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
分类界面
 */
public class GoodClassificationActivity extends BaseActivity implements BaseAdapter.OnItemClickListener {
    @BindView(R.id.rv_classification)
    RecyclerView rvClassification;
    @BindView(R.id.rv_goods_list)
    RecyclerView rvGoodsList;
    @BindView(R.id.ed_search)
    EditText edSearch;
    private Unbinder unbinder;
    private ClassificationAdapter classificationAdapter;
    private ChildForActivityAdapter childAdapter;
    private DataRepository dataRepository;
    private List<TopCatBean.DataBean> topCats;
    private List<ChildCatBean.DataBean> list;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        initWhite();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_classification);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {
        classificationAdapter = new ClassificationAdapter(this);
        rvClassification.setLayoutManager(new LinearLayoutManager(this));
        rvClassification.setAdapter(classificationAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rvGoodsList.setLayoutManager(gridLayoutManager);
        childAdapter = new ChildForActivityAdapter(this);
        rvGoodsList.setAdapter(childAdapter);
        classificationAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                classificationAdapter.setPos(position);
                getChildCat(topCats.get(position).getId());
            }
        });
        childAdapter.setOnItemClickListener(this);
        edSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    ((InputMethodManager) edSearch.getContext().getSystemService(Context.INPUT_METHOD_SERVICE))
                            .hideSoftInputFromWindow(
                                   GoodClassificationActivity.this.getCurrentFocus().getWindowToken(),
                                    InputMethodManager.HIDE_NOT_ALWAYS);
                    if (edSearch.getText().toString().equals("")) {
                        ToastUtils.showToast("搜索内容不能为空");
                    } else {
                        Intent intent = new Intent(GoodClassificationActivity.this, GoodsListActivity.class);
                        intent.putExtra("title", "热卖商城");
                        String searchName = edSearch.getText().toString();
//                        EventBus.getDefault().post(new GoodsSearchEvent(searchName));
                        intent.putExtra("searchName", searchName);
                        GoodClassificationActivity.this.startActivity(intent);
                    }
                    return true;
                }
                return false;
            }
        });
    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        getTopCat();
    }

    private void getTopCat() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("method", "categories.gettopcat");
        map.put("site_token", "123456");
        dataRepository.getTopCat(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(GoodClassificationActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(GoodClassificationActivity.this);
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
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("method", "categories.getchildcat");
        map.put("site_token", "123456");
        map.put("parent_id", parent_id + "");
        dataRepository.getChildCat(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(GoodClassificationActivity.this);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(GoodClassificationActivity.this);
                ChildCatBean childCatBean = (ChildCatBean) data;
                if (childCatBean.isStatus()) {
                    list = childCatBean.getData();
                    childAdapter.setData(list);
                }
            }
        });
    }

    @Override
    public void onItemViewClick(View view, int position) {
        Intent intent = new Intent(this, GoodsListActivity.class);
        intent.putExtra("title", list.get(position).getName());
        intent.putExtra("cat_id", list.get(position).getId() + "");
        startActivity(intent);
    }
}
