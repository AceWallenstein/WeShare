package com.pinnoocle.weshare.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pedaily.yc.ycdialoglib.toast.ToastUtils;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.bean.ShoppingCartListBean;
import com.pinnoocle.weshare.bean.UpdateTotalPriceEvent;
import com.pinnoocle.weshare.common.BaseAdapter;
import com.pinnoocle.weshare.common.Constants;
import com.pinnoocle.weshare.event.CanSettlement;
import com.pinnoocle.weshare.event.CartAllCheckedEvent;
import com.pinnoocle.weshare.weshop.GoodsDetailActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import ren.qinc.numberbutton.NumberButton;

public class ShopCartItemAdapter extends BaseAdapter<ShoppingCartListBean.DataBean.ListBean, ShopCartItemAdapter.VH> {

    //item选中位置
    private int pos = 0;

    public ShopCartItemAdapter(Context mContext) {
        super(mContext);
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(mContext).inflate(R.layout.item_goods_car, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.mCheckedCb.setChecked(mDatas.get(position).isIs_select());
        holder.mGoodsDescTv.setText(mDatas.get(position).getProducts().getName());
        holder.mGoodsPriceTv.setText(mDatas.get(position).getProducts().getPrice());
        holder.mGoodsSkuTv.setText(mDatas.get(position).getProducts().getSpes_desc());
        Glide.with(mContext).load(mDatas.get(position).getProducts().getImage_path()).centerCrop().into(holder.mGoodsIconIv);
        holder.mCheckedCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mDatas.get(position).setIs_select(holder.mCheckedCb.isChecked());
                final boolean isAllChecked = isAllchecked(holder, position);
                isOnechecked(holder, position);
                EventBus.getDefault().post(new CartAllCheckedEvent(isAllChecked));
            }
        });
        holder.rl_item.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, GoodsDetailActivity.class);
            intent.putExtra(Constants.ID, mDatas.get(position).getProducts().getGoods_id() + "");
            mContext.startActivity(intent);
        });
        int buy_limit = mDatas.get(position).getProducts().getBuy_limit();
        int stock = mDatas.get(position).getProducts().getStock();
        holder.mGoodsCountBtn
//                .setBuyMax(buy_limit)
                .setCurrentNumber(mDatas.get(position).getNums());
//                .setInventory(stock)
//                .setOnWarnListener(new NumberButton.OnWarnListener() {
//                    @Override
//                    public void onWarningForInventory(int inventory) {
//                        ToastUtils.showToast("当前库存:" + inventory);
//                    }
//
//                    @Override
//                    public void onWarningForBuyMax(int buyMax) {
//                        ToastUtils.showToast("超过最大购买数:" + buyMax);
//                    }
//                });
        EditText text_count = holder.mGoodsCountBtn.findViewById(R.id.text_count);
        text_count.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s))
                    return;
                mDatas.get(position).setNums(Integer.parseInt(s.toString()));
                EventBus.getDefault().post(new UpdateTotalPriceEvent());

            }
        });
    }

    private boolean isAllchecked(@NonNull VH holder, int position) {
        for (int i = 0; i < mDatas.size(); i++) {
            if (!mDatas.get(i).isIs_select()) {
                return false;
            }
        }
        return true;
    }

    private void isOnechecked(@NonNull VH holder, int position) {
        for (int i = 0; i < mDatas.size(); i++) {
            if (mDatas.get(i).isIs_select()) {
                EventBus.getDefault().post(new CanSettlement(true));
                return;
            }
        }
        EventBus.getDefault().post(new CanSettlement(false));
    }


    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
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
        @BindView(R.id.rl_item)
        RelativeLayout rl_item;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
