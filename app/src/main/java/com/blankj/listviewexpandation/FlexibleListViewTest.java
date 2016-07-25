package com.blankj.listviewexpandation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/*********************************************
 * author: Blankj on 2016/7/25 11:03
 * blog:   http://blankj.com
 * e-mail: blankj@qq.com
 *********************************************/
public class FlexibleListViewTest extends Activity {

    private FlexibleListView mFlexibleListView;
    private String[] data = new String[30];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible);
        for (int i = 0; i < 30; i++) {
            data[i] = "" + i;
        }
        mFlexibleListView = (FlexibleListView) findViewById(R.id.flexible_lv);
        mFlexibleListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data));
    }
}
