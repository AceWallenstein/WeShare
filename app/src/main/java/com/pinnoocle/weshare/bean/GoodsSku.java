package com.pinnoocle.weshare.bean;/*
    商品SKU数据类
 */

import java.util.List;

public class GoodsSku {
    public GoodsSku(String skuTitle, List<String> skuContent) {
        this.skuTitle = skuTitle;
        this.skuContent = skuContent;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    public List<String> getSkuContent() {
        return skuContent;
    }

    public void setSkuContent(List<String> skuContent) {
        this.skuContent = skuContent;
    }

    private String skuTitle;//SKU标题
    private List<String> skuContent;//SKU内容
}