package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.UserPointLogBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JinYuanDetailAdapter extends BaseAdapter<UserPointLogBean.DataBean, JinYuanDetailAdapter.VH> {



    public JinYuanDetailAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_jinyuan_detail, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvJinyuanAction.setText(mDatas.get(position).getRemarks());
        holder.tvTime.setText(mDatas.get(position).getCtime());
        holder.tvJinyuanIncome.setText("+"+mDatas.get(position).getBalance());
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_jinyuan_action)
        TextView tvJinyuanAction;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.tv_jinyuan_income)
        TextView tvJinyuanIncome;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
