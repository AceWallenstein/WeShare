package com.pinnoocle.weshare.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.holder.BannerImageHolder;

import java.util.List;

public class GoodsBannerAdapter<T> extends BannerAdapter<T, GoodsBannerAdapter.GoodsBannerHolder> {
    public GoodsBannerAdapter(List<T> mData) {
        super(mData);
    }

    @Override
    public GoodsBannerHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(parent.getContext());
        //注意，必须设置为match_parent，这个是viewpager2强制要求的
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(params);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new GoodsBannerHolder(imageView);
    }

    @Override
    public void onBindView(GoodsBannerHolder holder, T data, int position, int size) {

    }

    static class GoodsBannerHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public GoodsBannerHolder(@NonNull View view) {
            super(view);
            this.imageView = (ImageView) view;
        }
    }


}
