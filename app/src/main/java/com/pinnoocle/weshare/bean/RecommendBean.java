package com.pinnoocle.weshare.bean;

public class RecommendBean {
    String goods_title;
    String rush_price;
    String deadline;
    String goods_pic;

    public RecommendBean(String goods_title, String rush_price, String deadline, String goods_pic) {
        this.goods_title = goods_title;
        this.rush_price = rush_price;
        this.deadline = deadline;
        this.goods_pic = goods_pic;
    }

    public String getGoods_title() {
        return goods_title;
    }

    public String getRush_price() {
        return rush_price;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getGoods_pic() {
        return goods_pic;
    }
}
