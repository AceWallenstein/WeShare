package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.OrderBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderAdapter extends BaseAdapter<OrderBean, OrderAdapter.VH> {

    //item选中位置
    private int pos = 0;
    private String type;

    public OrderAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_order, parent, false));
    }

    /*
     titles.add("全部");
        titles.add("待付款");
        titles.add("待发货");
        titles.add("待收货");
        titles.add("待评价");
        titles.add("团购订单");
     */
    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.itemView.setOnClickListener(v -> mOnItemDataClickListener.onItemViewClick(v, position,mDatas.get(position)));
        switch (mDatas.get(position).type) {
            case 0:             //卖家已发货
                holder.tvStatus.setText("卖家已发货");

                holder.tvLogistics.setText("查看物流");
                holder.tvReceiving.setText("确认收货");
                holder.tvLogistics.setOnClickListener(v -> {});
                holder.tvReceiving.setOnClickListener(v -> {});
                break;
            case 1:
                holder.tvStatus.setText("待付款");
                holder.tvLogistics.setText("取消");
                holder.tvReceiving.setText("立即付款");
                break;
            case 2:
                holder.tvStatus.setText("已付款待发货");
                holder.tvReceiving.setVisibility(View.GONE);
                holder.tvLogistics.setText("申请取消");
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.addRule(RelativeLayout.ALIGN_PARENT_END);
                holder.tvLogistics.setLayoutParams(params);
                holder.tvLogistics.setOnClickListener(v -> {});
                break;
            case 3:         //已完成
                holder.tvStatus.setText("已完成");
                holder.tvLogistics.setText("申请售后");
                holder.tvReceiving.setText("评价");
                holder.tvLogistics.setOnClickListener(v -> {});
                holder.tvReceiving.setOnClickListener(v -> {});

                break;

        }


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
        @BindView(R.id.tv_status)
        TextView tvStatus;
        @BindView(R.id.tv_logistics)
        TextView tvLogistics;
        @BindView(R.id.tv_receiving)
        TextView tvReceiving;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
