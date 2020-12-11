package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClassificationAdapter extends BaseAdapter<String, ClassificationAdapter.VH> {
    //item选中位置
    private int pos = 0;

    public ClassificationAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_classification, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.text.setText(mDatas.get(position));
        if (position == pos) {
            holder.text.setBackgroundColor(mContext.getResources().getColor(R.color.white));
        } else {
            holder.text.setBackgroundColor(mContext.getResources().getColor(R.color.white1));
        }
        holder.text.setOnClickListener((v) -> {
            mOnItemClickListener.onItemViewClick(v, position);
        });
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
        @BindView(R.id.text)
        TextView text;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
