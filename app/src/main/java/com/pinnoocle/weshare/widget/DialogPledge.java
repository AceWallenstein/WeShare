package com.pinnoocle.weshare.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.lxj.xpopup.core.BottomPopupView;
import com.pinnoocle.weshare.R;

public class DialogPledge extends BottomPopupView {
    public DialogPledge(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.dialog_pledge;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        ImageView iv_close = findViewById(R.id.iv_close);
        TextView tv_guarantees = findViewById(R.id.tv_guarantees);
        iv_close.setOnClickListener(v -> {
            dismiss();
        });
        tv_guarantees.setOnClickListener(v -> {

        });
    }

}