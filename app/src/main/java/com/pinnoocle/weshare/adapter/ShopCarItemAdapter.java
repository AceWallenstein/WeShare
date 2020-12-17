package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.common.BaseAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import ren.qinc.numberbutton.NumberButton;

public class ShopCarItemAdapter extends BaseAdapter<String, ShopCarItemAdapter.VH> {

    //item选中位置
    private int pos = 0;

    public ShopCarItemAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_goods_car, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.mGoodsCountBtn.setCurrentNumber(1);
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public void setPos(int position) {
        pos = position;
        notifyDataSetChanged();
    }

    public static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.mCheckedCb)
        CheckBox mCheckedCb;
        @BindView(R.id.mGoodsIconIv)
        ImageView mGoodsIconIv;
        @BindView(R.id.mGoodsDescTv)
        TextView mGoodsDescTv;
        @BindView(R.id.mGoodsSkuTv)
        TextView mGoodsSkuTv;
        @BindView(R.id.mGoodsPriceTv)
        TextView mGoodsPriceTv;
        @BindView(R.id.mGoodsCountBtn)
        NumberButton mGoodsCountBtn;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
