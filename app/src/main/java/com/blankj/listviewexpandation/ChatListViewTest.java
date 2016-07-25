package com.blankj.listviewexpandation;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/*********************************************
 * author: Blankj on 2016/7/25 13:30
 * blog:   http://blankj.com
 * e-mail: blankj@qq.com
 *********************************************/
public class ChatListViewTest extends Activity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        mListView = (ListView) findViewById(R.id.lv_chat);

        ChatListViewBean bean1 = new ChatListViewBean();
        bean1.setType(0);
        bean1.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean1.setText("Hello how are you?");

        ChatListViewBean bean2 = new ChatListViewBean();
        bean2.setType(1);
        bean2.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.out_icon));
        bean2.setText("Fine thank you, and you?");

        ChatListViewBean bean3 = new ChatListViewBean();
        bean3.setType(0);
        bean3.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean3.setText("I am fine, too");

        ChatListViewBean bean4 = new ChatListViewBean();
        bean4.setType(1);
        bean4.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.out_icon));
        bean4.setText("Bye bye");

        ChatListViewBean bean5 = new ChatListViewBean();
        bean5.setType(0);
        bean5.setIcon(BitmapFactory.decodeResource(getResources(),
                R.drawable.in_icon));
        bean5.setText("See you");

        List<ChatListViewBean> data = new ArrayList<ChatListViewBean>();
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean4);
        data.add(bean5);
        mListView.setAdapter(new ChatListViewAdapter(this, data));
    }
}
