package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.GoodsDetailBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ItemPledgeDialogAdapter extends BaseAdapter<GoodsDetailBean.DataBean.ServiceBean, ItemPledgeDialogAdapter.VH> {


    public ItemPledgeDialogAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_pledge_dialog, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvTitle.setText(mDatas.get(position).getTitle());
        holder.tvContent.setText(mDatas.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_content)
        TextView tvContent;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
