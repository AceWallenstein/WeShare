package com.pinnoocle.weshare.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lxj.xpopup.animator.PopupAnimator;
import com.lxj.xpopup.impl.FullScreenPopupView;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.ImageAdapter;
import com.pinnoocle.weshare.utils.SaveImageUtils;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import static com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread;

public class CustomPopup extends FullScreenPopupView {
    private final Context mContext;
    private Banner banner;
    private LinearLayout ll_save_pic;
    private String currentPic;
    private int currentPosition;


    //注意：自定义弹窗本质是一个自定义View，但是只需重写一个参数的构造，其他的不要重写，所有的自定义弹窗都是这样。
    public CustomPopup(@NonNull Context context) {
        super(context);
        this.mContext = context;
    }

    // 返回自定义弹窗的布局
    @Override
    protected int getImplLayoutId() {
        return R.layout.custom_popup;
    }

    // 执行初始化操作，比如：findView，设置点击，或者任何你弹窗内的业务逻辑
    @Override
    protected void onCreate() {
        super.onCreate();
        List<String> mList = new ArrayList<>();
        mList.add("https://img.zcool.cn/community/013de756fb63036ac7257948747896.jpg");
        mList.add("https://img.zcool.cn/community/01639a56fb62ff6ac725794891960d.jpg");
        mList.add("https://img.zcool.cn/community/01270156fb62fd6ac72579485aa893.jpg");
        mList.add("https://img.zcool.cn/community/01233056fb62fe32f875a9447400e1.jpg");
        mList.add("https://img.zcool.cn/community/016a2256fb63006ac7257948f83349.jpg");
        banner = findViewById(R.id.banner);
        ll_save_pic = findViewById(R.id.ll_save_pic);
        //--------------------------简单使用-------------------------------
        banner.setBannerGalleryEffect(20, 20, 20)
                .isAutoLoop(false)
                .setAdapter(new BannerImageAdapter<String>(mList) {


                    @Override
                    public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                        currentPosition = position-1;
                        //图片加载自己实现
                        Glide.with(holder.itemView)
                                .load(data)
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                                .into(holder.imageView);
                    }
                })
                .setIndicator(new CircleIndicator(mContext));
        ll_save_pic.setOnClickListener((v) -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        final Bitmap myBitmap = Glide.with(mContext)//上下文
                                .asBitmap() //必须
                                .load(mList.get(currentPosition))//url
                                .centerCrop()
                                .into(500, 500)
                                .get();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                SaveImageUtils.saveImageToGallerys(mContext, myBitmap);
                            }
                        });

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });

    }

}