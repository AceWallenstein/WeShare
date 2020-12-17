package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GroupSeckillAdapter extends BaseAdapter<RecommendBean, GroupSeckillAdapter.VH> {




    public GroupSeckillAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_group_seckill, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_shop)
        ImageView ivShop;
        @BindView(R.id.tv_status)
        TextView tvStatus;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_price)
        TextView tvPrice;
        @BindView(R.id.tv_underlined_price)
        TextView tvUnderlinedPrice;
        @BindView(R.id.tv_seckill_time)
        TextView tvSeckillTime;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
