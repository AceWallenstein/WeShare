package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedaily.yc.ycdialoglib.dialog.loading.ViewLoading;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.JinYuanDetailAdapter;
import com.pinnoocle.weshare.bean.UserPointLogBean;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.nets.DataRepository;
import com.pinnoocle.weshare.nets.Injection;
import com.pinnoocle.weshare.nets.RemotDataSource;
import com.pinnoocle.weshare.utils.FastData;
import com.pinnoocle.weshare.utils.StatusBarUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class JinYuanDetailActivity extends BaseActivity implements OnRefreshLoadMoreListener {
    @BindView(R.id.go_back)
    ImageView goBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
    @BindView(R.id.refresh)
    SmartRefreshLayout refresh;
    private DataRepository dataRepository;
    private int page = 1;
    private JinYuanDetailAdapter adapter;
    private List<UserPointLogBean.DataBean> dataBeanList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        initWhite();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_jinyuan_detail);
        ButterKnife.bind(this);
        initView();
        initData();
    }


    private void initView() {
        adapter = new JinYuanDetailAdapter(this);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        refresh.setOnRefreshLoadMoreListener(this);
    }

    private void initData() {
        dataRepository = Injection.dataRepository(this);
        getJinYuanDetail();
    }

    private void getJinYuanDetail() {
        ViewLoading.show(this);
        Map<String, String> map = new HashMap<>();
        map.put("token", FastData.getToken());
        map.put("method", "user.userpointlog");
        map.put("site_token", "123456");
        map.put("page", page + "");//
        dataRepository.UserPointLog(map, new RemotDataSource.getCallback() {
            @Override
            public void onFailure(String info) {
                ViewLoading.dismiss(JinYuanDetailActivity.this);
                refresh.finishRefresh(false);
                refresh.finishLoadMore(false);
            }

            @Override
            public void onSuccess(Object data) {
                ViewLoading.dismiss(JinYuanDetailActivity.this);
                refresh.finishRefresh();
                UserPointLogBean userPointLogBean = (UserPointLogBean) data;
                if (userPointLogBean.isStatus()) {
                    if (page >= userPointLogBean.getTotal()) {
                        refresh.finishLoadMoreWithNoMoreData();
                    } else {
                        refresh.finishLoadMore();
                    }
                    dataBeanList.addAll(userPointLogBean.getData());
                    adapter.setData(dataBeanList);
                }


            }
        });
    }

    @OnClick(R.id.go_back)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        page++;
        getJinYuanDetail();
    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        page = 1;
        dataBeanList.clear();
        getJinYuanDetail();
    }
}
