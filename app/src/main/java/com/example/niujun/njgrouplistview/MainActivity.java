package com.example.niujun.njgrouplistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView mListView;
    ComGroupAdapter mAdapter;
    List<Group> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        mListView = (ListView) findViewById(R.id.list);
        mAdapter = new ComGroupAdapter(this, datas);
        mListView.setAdapter(mAdapter);
        initData();
    }

    private void initData() {
        datas.clear();
        Group g1 = new Group();
        g1.setGroupName("好友");
        g1.addItem("张毅1");
        g1.addItem("张毅2");
        g1.addItem("张毅3");
        g1.addItem("张毅4");
        Group g2 = new Group();
        g2.setGroupName("家人");
        g2.addItem("张毅1");
        g2.addItem("张毅2");
        g2.addItem("张毅3");
        g2.addItem("张毅4");
        Group g3 = new Group();
        g3.setGroupName("同学");
        g3.addItem("张毅1");
        g3.addItem("张毅2");
        g3.addItem("张毅3");
        g3.addItem("张毅4");
        g3.addItem("张毅5");
        datas.add(g1);
        datas.add(g2);
        datas.add(g3);
    }
}
