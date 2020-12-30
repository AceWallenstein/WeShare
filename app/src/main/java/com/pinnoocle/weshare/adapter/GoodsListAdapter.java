package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsBeanDelete;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GoodsListAdapter extends BaseAdapter<GoodsBeanDelete, RecyclerView.ViewHolder> {
    public GoodsListAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1)
            return new HeaderViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_goods_head, parent, false));
        return new GoodsListAdapter.VH(LayoutInflater.from(mContext).inflate(R.layout.item_goods_list, parent, false));
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        } else {
            return 2;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            HeaderViewHolder vh = (HeaderViewHolder) holder;
            Glide.with(mContext).load(R.mipmap.delete_1).centerCrop().into(vh.ivHeader);

        } else if (holder instanceof VH) {
            position = position - 1;//banner占据一个位置。
            VH vh = (VH) holder;
            vh.tvGoodsTitle.setText(mDatas.get(position).getGoods_title());
            if (!TextUtils.isEmpty(mDatas.get(position).getGoods_pic()))
                vh.ivGoodsPic.setImageResource(Integer.parseInt(mDatas.get(position).getGoods_pic()));
            int finalPosition = position;
            if (mOnItemClickListener != null) {

            vh.itemView.setOnClickListener(v -> mOnItemClickListener.onItemViewClick(v, finalPosition));
            }
        }
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size() + 1;
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_goods_pic)
        ImageView ivGoodsPic;
        @BindView(R.id.tv_goods_title)
        TextView tvGoodsTitle;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_header)
        ImageView ivHeader;

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
