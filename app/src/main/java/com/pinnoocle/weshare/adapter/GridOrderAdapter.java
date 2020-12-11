package com.pinnoocle.weshare.adapter;


import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.SuperscriptSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.allenliu.badgeview.BadgeFactory;
import com.allenliu.badgeview.BadgeView;
import com.pinnoocle.weshare.R;

import java.util.ArrayList;
import java.util.Map;

public class GridOrderAdapter extends BaseAdapter {

    private final ArrayList<Map<String, Object>> dataList;
    private LayoutInflater layoutInflater;
    private int num;
    private Context context;

    public GridOrderAdapter(Context context, ArrayList<Map<String, Object>> dataList, int num) {
        this.dataList = dataList;
        this.num = num;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

//    private OnItemClickListener mOnItemClickListener;
//
//    public void setItemClickListener(OnItemClickListener mOnItemClickListener) {
//        this.mOnItemClickListener = mOnItemClickListener;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.grid_item_order, null);
            holder = new ViewHolder();
            holder.text = convertView.findViewById(R.id.text);
            holder.image = convertView.findViewById(R.id.image);
            holder.tvDot = convertView.findViewById(R.id.tv_dot);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text.setText(dataList.get(position).get("text").toString());
        holder.image.setImageResource((Integer) dataList.get(position).get("image"));

//        if (num > 0) {
//            holder.tvDot.setVisibility(View.VISIBLE);
//            if (num <= 99) {
//                holder.tvDot.setTextSize(8);
//                holder.tvDot.setText(num + "");
//            } else {
//                holder.tvDot.setTextSize(7);
////                holder.tvDot.setText("99+");
//                SpannableString spannableString=new SpannableString("99+");
//                //将+用作上标显示
//                spannableString.setSpan(new SuperscriptSpan(),2,3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//                holder.tvDot.setText(spannableString);
//            }
//        } else {
//            holder.tvDot.setVisibility(View.GONE);
//        }

        if (num > 0) {
            holder.tvDot.setVisibility(View.VISIBLE);
            if (num <= 99) {
                BadgeFactory.createOval(context)
                        .setWidthAndHeight(12, 12)
                        .setTextSize(8).setBadgeGravity(Gravity.CENTER)
                        .setBadgeCount(num)
                        .bind(holder.tvDot);

            } else {
                SpannableString spannableString = new SpannableString("99+");
                //将+用作上标显示
                spannableString.setSpan(new SuperscriptSpan(), 2, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                BadgeFactory.createOval(context)
                        .setWidthAndHeight(12, 12)
                        .setTextSize(7).setBadgeGravity(Gravity.CENTER)
                        .setBadgeCount(spannableString+"")
                        .bind(holder.tvDot);
            }
        } else {
            holder.tvDot.setVisibility(View.GONE);
        }
        BadgeFactory.createOval(context).setWidthAndHeight(12, 12).setTextSize(8).setBadgeGravity(Gravity.CENTER).setBadgeCount(1).bind(holder.tvDot);

        return convertView;
    }

    class ViewHolder {
        TextView text;
        TextView tvDot;
        ImageView image;
    }
}
