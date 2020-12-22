package com.pinnoocle.weshare.nets;

import com.pinnoocle.weshare.bean.AddCartBean;
import com.pinnoocle.weshare.bean.DeleteCartBean;
import com.pinnoocle.weshare.bean.EvaluationBean;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.bean.SaveUserShipBean;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.SpecBean;
import com.pinnoocle.weshare.bean.UserLogin;
import com.pinnoocle.weshare.bean.PersonalCenterBean;
import com.pinnoocle.weshare.bean.UserShipBean;

import java.util.Map;

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

    //规格id
    @POST("api.html")
    Observable<SpecBean> spec(@QueryMap Map<String, String> queryMap);

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
    Observable<SaveUserShipBean> saveUserShip(@QueryMap Map<String, String> queryMap);

}
