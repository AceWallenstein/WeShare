package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.OrderDetailsBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderItemAdapter extends BaseAdapter<OrderDetailsBean.DataBean.ItemsBean, OrderItemAdapter.VH> {

    //item选中位置
    private int pos = 0;

    public OrderItemAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_order_confirm, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        if (mOnItemClickListener != null) {
            holder.itemView.setOnClickListener(v -> mOnItemClickListener.onItemViewClick(v, position));
        }
        Glide.with(mContext).load(mDatas.get(position).getImage_url()).centerCrop().into(holder.ivShop);
        holder.tvHint.setText("订单号：" + mDatas.get(position).getOrder_id());
        holder.tvOrderTime.setText(stampToDate(mDatas.get(position).getUtime()));
        holder.tvTitle.setText(mDatas.get(position).getName());
        holder.tvGoodsPattern.setText(mDatas.get(position).getAddon());
        holder.tvNum.setText("X" + mDatas.get(position).getNums() + "件");
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public void setPos(int position) {
        pos = position;
        notifyDataSetChanged();
    }

    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_order_time)
        TextView tvOrderTime;
        @BindView(R.id.tv_hint)
        TextView tvHint;
        @BindView(R.id.iv_shop)
        ImageView ivShop;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_goods_pattern)
        TextView tvGoodsPattern;
        @BindView(R.id.tv_num)
        TextView tvNum;
        @BindView(R.id.ll_order)
        LinearLayout llOrder;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    public static String stampToDate(long lt){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
}
