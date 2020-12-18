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
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.bean.RecommendBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TqmAdapter extends BaseAdapter<HomeBean.DataBeanXX.TqmListBean.DataBeanX, TqmAdapter.VH> {

    public TqmAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_recommend, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvGoodsTitle.setText(mDatas.get(position).getName());
        holder.tvRushPrice.setText("抢购价：￥" + mDatas.get(position).getPrice());
        holder.tvDeadlineTime.setText( mDatas.get(position).getEnd_time()+"截止");
        Glide.with(mContext).load(mDatas.get(position).getImage_url()).fitCenter().into(holder.ivGoodsPic);
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_goods_title)
        TextView tvGoodsTitle;
        @BindView(R.id.tv_rush_price)
        TextView tvRushPrice;
        @BindView(R.id.tv_deadline)
        TextView tvDeadlineTime;
        @BindView(R.id.iv_goods_pic)
        ImageView ivGoodsPic;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
