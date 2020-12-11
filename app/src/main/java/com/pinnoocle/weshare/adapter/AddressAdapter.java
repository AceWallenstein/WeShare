package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.AddressBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddressAdapter extends BaseAdapter<AddressBean, AddressAdapter.VH> {

    public AddressAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_address, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tvPersonName.setText(mDatas.get(position).getName());
        if (!TextUtils.isEmpty(mDatas.get(position).getPhone()) && mDatas.get(position).getPhone().length() > 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mDatas.get(position).getPhone().length(); i++) {
                char c = mDatas.get(position).getPhone().charAt(i);
                if (i >= 3 && i <= 6) {
                    sb.append('*');
                } else {
                    sb.append(c);
                }
            }
            holder.tvPhone.setText(sb.toString());
        }
        holder.tvAddress.setText(mDatas.get(position).getAddress());
        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    holder.tvCheck.setText("默认");
                }else {
                    holder.tvCheck.setText("选择");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    public static class VH extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_person_name)
        TextView tvPersonName;
        @BindView(R.id.tv_phone)
        TextView tvPhone;
        @BindView(R.id.tv_address)
        TextView tvAddress;
        @BindView(R.id.cb_check)
        CheckBox checkBox;
        @BindView(R.id.tv_check)
        TextView tvCheck;
        @BindView(R.id.tv_delete)
        TextView tvDelete;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
