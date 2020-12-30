package com.pinnoocle.weshare.nets;

import com.pinnoocle.weshare.bean.AddCartBean;
import com.pinnoocle.weshare.bean.ChildCatBean;
import com.pinnoocle.weshare.bean.DeleteCartBean;
import com.pinnoocle.weshare.bean.EvaluationBean;
import com.pinnoocle.weshare.bean.GetAreaIdBean;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.OrderBean;
import com.pinnoocle.weshare.bean.OrderDetailsBean;
import com.pinnoocle.weshare.bean.OrderStatusNumBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.bean.RemoveShipBean;
import com.pinnoocle.weshare.bean.SaveUserShipBean;
import com.pinnoocle.weshare.bean.SetDefShipBean;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.UserLoginBean;
import com.pinnoocle.weshare.bean.TopCatBean;
import com.pinnoocle.weshare.bean.UserInfoBean;
import com.pinnoocle.weshare.bean.UserLogin;
import com.pinnoocle.weshare.bean.PersonalCenterBean;
import com.pinnoocle.weshare.bean.UserPointLogBean;
import com.pinnoocle.weshare.bean.UserShipBean;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by whs on 2017/2/17
 * Retrofit 接口
 */

public interface RetrofitService {
    // 登录
    @POST("")
    Observable<UserLogin> login(@QueryMap Map<String, String> queryMap);

    // 首页
    @POST("api.html")
    Observable<HomeBean> homePage(@QueryMap Map<String, String> queryMap);

    // 首页猜你喜欢
    @POST("api.html")
    Observable<RecommendBean> recommend(@QueryMap Map<String, String> queryMap);

    //商品详情
    @POST("api.html")
    Observable<GoodsDetailBean> goodsDetail(@QueryMap Map<String, String> queryMap);

    //规格id获取商品规格数据
    @POST("api.html")
    Observable<ResponseBody> getProductInfo(@QueryMap Map<String, String> queryMap);

    //商品评价
    @POST("api.html")
    Observable<EvaluationBean> goodsEvaluation(@QueryMap Map<String, String> queryMap);

    //个人中心
    @POST("api.html")
    Observable<PersonalCenterBean> personalCenter(@QueryMap Map<String, String> queryMap);

    //购物车列表
    @POST("api.html")
    Observable<ShoppingCartListBean> shoppingCartList(@QueryMap Map<String, String> queryMap); //购物车列表

    //删除购物车
    @POST("api.html")
    Observable<DeleteCartBean> deleteCart(@QueryMap Map<String, String> queryMap); //删除购物车 //删除购物车

    @POST("api.html")
    Observable<AddCartBean> addCart(@QueryMap Map<String, String> queryMap); //加入购物车

    @POST("api.html")
    Observable<UserShipBean> getUserShip(@QueryMap Map<String, String> queryMap);

    @POST("api.html")
    Observable<GetAreaIdBean> getAreaId(@QueryMap Map<String, String> queryMap);

    @POST("api.html")
    Observable<SaveUserShipBean> saveUserShip(@QueryMap Map<String, String> queryMap);
    //设置默认地址
    @POST("api.html")
    Observable<SetDefShipBean> setDefShip(@QueryMap Map<String, String> queryMap);
    //删除地址
    @POST("api.html")
    Observable<RemoveShipBean> removeShip(@QueryMap Map<String, String> queryMap);
    //订单消息数目
    @POST("api.html")
    Observable<OrderStatusNumBean> getOrderStatusNum(@QueryMap Map<String, String> queryMap);
    //订单列表
    @POST("api.html")
    Observable<OrderBean> getOrderList(@QueryMap Map<String, String> queryMap);
    //金元明细
    @POST("api.html")
    Observable<UserPointLogBean> UserPointLog(@QueryMap Map<String, String> queryMap);

    //商品列表
    @POST("api.html")
    Observable<GoodsBean> getGoodsList(@QueryMap Map<String, String> queryMap);

    //一级分类
    @POST("api.html")
    Observable<TopCatBean> getTopCat(@QueryMap Map<String, String> queryMap);
    //二级分类
    @POST("api.html")
    Observable<ChildCatBean> getChildCat(@QueryMap Map<String, String> queryMap);
    //个人中心
    @POST("api.html")
    Observable<UserInfoBean> getUserInfo(@QueryMap Map<String, String> queryMap);
    //我的券
//    @POST("api.html")
//    Observable<CouponBean> getCoupon(@QueryMap Map<String, String> queryMap);
    //订单详情
    @POST("api.html")
    Observable<OrderDetailsBean> orderDetails(@QueryMap Map<String, String> queryMap);
    //微信授权登录
    @POST("api.html")
    Observable<UserLoginBean> wxLogin(@QueryMap Map<String, String> queryMap);

}
