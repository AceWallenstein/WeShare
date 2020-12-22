package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollectionAdapter extends BaseAdapter<GoodsBean, CollectionAdapter.VH> {


    public CollectionAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_collection, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvGoodsTitle.setText(mDatas.get(position).getGoods_title());
        holder.tvCollectionNum.setText("￥" + mDatas.get(position).getCollectionNum() + "人收藏");
        holder.tvPrice.setText("￥" + mDatas.get(position).getMembershipPrice() + "元");
        holder.tvUnderlinedPrice.setText("￥" + mDatas.get(position).getNonMembershipPrice() + "元");
        Glide.with(mContext).load(R.mipmap.delete_2).centerCrop().into(holder.ivGoodsPic);
        holder.tvMark.setOnClickListener((v) -> {
            //取消收藏
        });
        holder.tvSimilar.setOnClickListener((v) -> {
            //跳转相似商品界面
        });
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_goods_pic)
        ImageView ivGoodsPic;
        @BindView(R.id.cardView)
        CardView cardView;
        @BindView(R.id.tv_goods_title)
        TextView tvGoodsTitle;
        @BindView(R.id.tv_collection_num)
        TextView tvCollectionNum;
        @BindView(R.id.tv_price)
        TextView tvPrice;
        @BindView(R.id.tv_underlined_price)
        TextView tvUnderlinedPrice;
        @BindView(R.id.iv_mark)
        ImageView ivMark;
        @BindView(R.id.tv_mark)
        TextView tvMark;
        @BindView(R.id.tv_similar)
        TextView tvSimilar;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
