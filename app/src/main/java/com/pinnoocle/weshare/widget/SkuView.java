package com.pinnoocle.weshare.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsSku;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

public class SkuView extends FrameLayout {


    private GoodsSku mGoodsSku;
    private TextView tvSpec;
    private TagFlowLayout flowlayout;

    public SkuView(@NonNull Context context) {
        this(context, null);
        initView();
    }

    public SkuView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        initView();

    }

    public SkuView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View.inflate(getContext(), R.layout.layout_sku_view, this);
        tvSpec = findViewById(R.id.tv_spec);
        flowlayout = findViewById(R.id.flowlayout);
    }

    /*
    动态设置SKU数据
     */
    public void setSkuData(GoodsSku goodsSku) {
        mGoodsSku = goodsSku;
        tvSpec.setText(goodsSku.getSkuTitle());
        //FlowLayout设置数据
        flowlayout.setAdapter(new TagAdapter<String>(goodsSku.getSkuContent()) {
            @Override
            public TextView getView(FlowLayout parent, int position, String s) {
                TextView view = (TextView) LayoutInflater.from(getContext())
                        .inflate(R.layout.layout_sku_item, parent, false);
                view.setText(s);
                return view;
            }
        });
        flowlayout.getAdapter().setSelectedList(0);
        flowlayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                return false;
            }
        });
    }

    /*
    获取选择的SKU
     */
    public String getSkuInfo() {
        return tvSpec.toString() + "," +
                mGoodsSku.getSkuContent().get(flowlayout.getSelectedList().iterator().next());
    }
}
