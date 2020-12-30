package com.pinnoocle.weshare.bean;

public class GoodsBeanDelete {
    String goods_title;
    String MembershipPrice;
    String NonMembershipPrice;
    String goods_pic;
    String paymentsNum;
    String collectionNum;

    public GoodsBeanDelete(String goods_title, String membershipPrice, String nonMembershipPrice, String goods_pic, String paymentsNum) {
        this.goods_title = goods_title;
        MembershipPrice = membershipPrice;
        NonMembershipPrice = nonMembershipPrice;
        this.goods_pic = goods_pic;
        this.paymentsNum = paymentsNum;
    }
    public GoodsBeanDelete(String goods_title, String membershipPrice, String nonMembershipPrice, String goods_pic, String paymentsNum, String collectionNum) {
        this.goods_title = goods_title;
        MembershipPrice = membershipPrice;
        NonMembershipPrice = nonMembershipPrice;
        this.goods_pic = goods_pic;
        this.paymentsNum = paymentsNum;
        this.collectionNum = collectionNum;
    }

    public String getGoods_title() {
        return goods_title;
    }

    public String getMembershipPrice() {
        return MembershipPrice;
    }

    public String getNonMembershipPrice() {
        return NonMembershipPrice;
    }

    public String getGoods_pic() {
        return goods_pic;
    }

    public String getPaymentsNum() {
        return paymentsNum;
    }

    public String getCollectionNum() {
        return collectionNum;
    }
}
