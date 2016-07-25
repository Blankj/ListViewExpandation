package com.blankj.listviewexpandation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/*********************************************
 * author: Blankj on 2016/7/25 15:11
 * blog:   http://blankj.com
 * e-mail: blankj@qq.com
 *********************************************/
public class FocusListViewTest extends Activity {

    private ListView mListView;
    private FocusListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
        mListView = (ListView) findViewById(R.id.lv_focus);
        List<String> data = new ArrayList<String>();
        data.add("I am item 1");
        data.add("I am item 2");
        data.add("I am item 3");
        data.add("I am item 4");
        data.add("I am item 5");
        mAdapter = new FocusListViewAdapter(this, data);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                mAdapter.setCurrentItem(position);
                mAdapter.notifyDataSetChanged();
            }
        });
    }
}
