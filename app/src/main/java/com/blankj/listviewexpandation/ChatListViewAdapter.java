package com.blankj.listviewexpandation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/*********************************************
 * author:  Blankj on 2016/7/25 14:01
 * blog:    http://blankj.com
 * e-mail:  blankj@qq.com
 *********************************************/
public class ChatListViewAdapter extends BaseAdapter {

    private List<ChatListViewBean> mData;
    private LayoutInflater mInflater;

    public ChatListViewAdapter(Context context, List<ChatListViewBean> data) {
        this.mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        ChatListViewBean bean = mData.get(position);
        return bean.getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            if (getItemViewType(position) == 0) {
                convertView = mInflater.inflate(R.layout.chat_item_itemin, null);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon_in);
                viewHolder.text = (TextView) convertView.findViewById(R.id.text_in);
            } else {
                convertView = mInflater.inflate(R.layout.chat_item_itemout, null);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon_out);
                viewHolder.text = (TextView) convertView.findViewById(R.id.text_out);
            }
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.icon.setImageBitmap(mData.get(position).getIcon());
        viewHolder.text.setText(mData.get(position).getText());
        return convertView;
    }

    public final class ViewHolder {
        public ImageView icon;
        public TextView text;
    }
}
