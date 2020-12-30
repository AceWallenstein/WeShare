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
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInAdapter extends BaseAdapter<String, SignInAdapter.VH> {



    public SignInAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_sign_in, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvSignInDays.setText("第"+(position+1)+"天");
        if(position==15){
            holder.tvSignInDays.setVisibility(View.GONE);
            holder.ivJinyuan.setImageResource(R.mipmap.jinyuan_gift);
        }
    }

    @Override
    public int getItemCount() {
        return 16;
    }


    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_jinyuan)
        ImageView ivJinyuan;
        @BindView(R.id.tv_sign_in_days)
        TextView tvSignInDays;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
