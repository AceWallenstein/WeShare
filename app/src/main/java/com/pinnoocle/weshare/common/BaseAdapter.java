package com.pinnoocle.weshare.common;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    protected List<T> mDatas = new ArrayList<>();
    protected Context mContext;

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    protected OnItemClickListener mOnItemClickListener;
    protected OnItemDataClickListener mOnItemDataClickListener;

    public void setmOnItemDataClickListener(OnItemDataClickListener mOnItemDataClickListener) {
        this.mOnItemDataClickListener = mOnItemDataClickListener;
    }

    public BaseAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<T> mDatas) {
        this.mDatas = mDatas;
        notifyDataSetChanged();
    }

    public void addAllData(List<T> mDatas) {
        this.mDatas.addAll(mDatas);
        notifyDataSetChanged();
    }


    public interface OnItemClickListener {
        void onItemViewClick(View view, int position);
    }

    public interface OnItemDataClickListener<T> {
        void onItemViewClick(View view, int position, T t);
    }

}
