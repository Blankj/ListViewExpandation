package com.blankj.listviewexpandation;

import android.graphics.Bitmap;

/*********************************************
 * author: Blankj on 2016/7/25 14:01
 * blog:   http://blankj.com
 * e-mail: blankj@qq.com
 *********************************************/
public class ChatListViewBean {

    private int type;
    private String text;
    private Bitmap icon;

    public ChatListViewBean() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}
