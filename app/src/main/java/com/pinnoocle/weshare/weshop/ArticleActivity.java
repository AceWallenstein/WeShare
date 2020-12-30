package com.pinnoocle.weshare.weshop;

import android.os.Bundle;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseActivity;

import butterknife.ButterKnife;

public class ArticleActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        initTransparent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initView() {

    }

    private void initData() {

    }

}
