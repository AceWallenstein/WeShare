package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.HomeBean;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
//导航栏菜单adapter
public class MenuAdapter extends BaseAdapter<HomeBean.DataBeanXX.CategoryBean, MenuAdapter.VH> {


    public MenuAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        if (position == 0) {
            holder.menuName.setTextColor(mContext.getResources().getColor(R.color.red));
            holder.menuName.setTextSize(15);
        }else {
            holder.menuName.setTextColor(mContext.getResources().getColor(R.color.light_black));
            holder.menuName.setTextSize(14);
        }
        if(position==0){
            holder.menuName.setText("推荐");
            return;
        }
        holder.menuName.setText(mDatas.get(position-1).getName());
        holder.menuName.setOnClickListener((v -> {
            mOnItemClickListener.onItemViewClick(v, position);
        }));
    }

    @Override
    public int getItemCount() {
        return mDatas.size()+1;
    }


    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.menu_name)
        TextView menuName;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
