package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.ChildCatBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChildAdapter extends BaseAdapter<ChildCatBean.DataBean, ChildAdapter.VH> {

    //item选中位置
    private int pos = 0;

    public ChildAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_child, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.text.setText(mDatas.get(position).getName());
        holder.itemView.setOnClickListener((v) -> {
            if (mOnItemClickListener != null) {

                mOnItemClickListener.onItemViewClick(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    public void setPos(int position) {
        pos = position;
        notifyDataSetChanged();
    }

    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.text)
        TextView text;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
