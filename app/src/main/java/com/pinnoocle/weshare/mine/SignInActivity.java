package com.pinnoocle.weshare.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pinnoocle.weshare.R;
import com.pinnoocle.weshare.adapter.SignInAdapter;
import com.pinnoocle.weshare.common.BaseActivity;
import com.pinnoocle.weshare.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*

 */
public class SignInActivity extends BaseActivity {
    @BindView(R.id.rl_jinyuan_center)
    LinearLayout rlJinyuanCenter;
    @BindView(R.id.tv_sign_in_days)
    TextView tvSignInDays;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.tv_right_sign_in)
    TextView tvRightSignIn;

    protected void onCreate(Bundle savedInstanceState) {
        initGold();
        StatusBarUtil.StatusBarLightMode(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_sign_in);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,5));
        SignInAdapter adapter = new SignInAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @OnClick({R.id.iv_back, R.id.rl_jinyuan_center, R.id.tv_right_sign_in})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.rl_jinyuan_center:
                break;
            case R.id.tv_right_sign_in:
                break;
        }
    }
}
