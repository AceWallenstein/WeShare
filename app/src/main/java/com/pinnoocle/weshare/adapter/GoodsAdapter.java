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
import com.pinnoocle.weshare.bean.GoodsBean;
import com.pinnoocle.weshare.bean.GoodsBeanDelete;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GoodsAdapter extends BaseAdapter<GoodsBean.DataBean.ListBean, GoodsAdapter.VH> {


    public GoodsAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_goods, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvGoodsTitle.setText(mDatas.get(position).getName());
        holder.tvMemberPrice.setText("￥" + mDatas.get(position).getCostprice());
        holder.tvNonMemberPrice.setText("非会员￥" + mDatas.get(position).getPrice());
        holder.tvPaymentNum.setText(mDatas.get(position).getIs_buy_num() + "人付款");
        Glide.with(mContext).load(mDatas.get(position).getImage_url()).fitCenter().into(holder.ivGoodsPic);

        holder.itemView.setOnClickListener(v ->
        {
            if (mOnItemDataClickListener != null) {
                mOnItemDataClickListener.onItemViewClick(v, position,mDatas.get(position));
            }
        });
        holder.ivShopCar.setOnClickListener(v -> {
            if (mOnItemClickListener != null) {
                mOnItemClickListener.onItemViewClick(v, position);
            }
            if (mOnItemDataClickListener != null) {
                mOnItemDataClickListener.onItemViewClick(v, position,mDatas.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_goods_pic)
        ImageView ivGoodsPic;
        @BindView(R.id.tv_goods_title)
        TextView tvGoodsTitle;
        @BindView(R.id.tv_membership_price)
        TextView tvMemberPrice;
        @BindView(R.id.tv_non_member_price)
        TextView tvNonMemberPrice;
        @BindView(R.id.tv_payment_num)
        TextView tvPaymentNum;
        @BindView(R.id.iv_shop_car)
        ImageView ivShopCar;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
