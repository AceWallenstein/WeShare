package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.ButterKnife;

public class MyCouponsAdapter extends BaseAdapter<String, CouponsAdapter.VH> {
    //item选中位置
    private int pos = 0;

    public MyCouponsAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public CouponsAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CouponsAdapter.VH(LayoutInflater.from(mContext).inflate(R.layout.item_my_coupons, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CouponsAdapter.VH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public void setPos(int position) {
        pos = position;
        notifyDataSetChanged();
    }

    public static class VH extends RecyclerView.ViewHolder {
        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
