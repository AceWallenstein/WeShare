package com.pinnoocle.weshare.widget;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lxj.xpopup.core.BottomPopupView;
import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.CouponsAdapter;

public class DialogCoupons extends BottomPopupView {
    private  Context mContext;

    public DialogCoupons(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.dialog_coupons;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        ImageView iv_close = findViewById(R.id.iv_close);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        iv_close.setOnClickListener(v -> {
            dismiss();
        });
        CouponsAdapter adapter = new CouponsAdapter(mContext);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        
    }

}