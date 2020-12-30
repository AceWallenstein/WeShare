package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    private int[] icons = new int[]{R.mipmap.food, R.mipmap.wash, R.mipmap.baihuo, R.mipmap.children, R.mipmap.home_furnishing,
            R.mipmap.beautiful, R.mipmap.ornaments, R.mipmap.women_wear, R.mipmap.shoes, R.mipmap.home_more};

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
        if (mDatas == null||mDatas.size()==0) {
            return;
        }
        if (position == 9) {
            holder.menuName.setText("更多");
        } else {
            holder.menuName.setText(mDatas.get(position).getName());
        }
        holder.image.setImageResource(icons[position]);
        holder.itemView.setOnClickListener((v -> {
            mOnItemClickListener.onItemViewClick(v, position);
        }));
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : icons.length;
    }


    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.menu_name)
        TextView menuName;
        @BindView(R.id.image)
        ImageView image;


        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
