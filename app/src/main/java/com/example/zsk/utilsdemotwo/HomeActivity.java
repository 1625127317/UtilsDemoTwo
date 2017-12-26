package com.example.zsk.utilsdemotwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zsk.utilsdemotwo.other.HomeAdapter;
import com.example.zsk.utilsdemotwo.other.HomeItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<HomeItem> mDataList;
    private static final String[] TITLE = {"堆积柱状图", "饼状图","组合图"};
    private static final String[] COLOR_STR = {"#0dddb8", "#0bd4c3", "#03cdcd", "#03cdcd", "#00b1c5", "#04b2d1", "#04b2d1"};
    private static final Class<?>[] ACTIVITY = {MainActivity.class, PieChartActivity.class,CombineChartActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        initData();
        BaseQuickAdapter homeAdapter = new HomeAdapter(this, R.layout.home_item_view, mDataList);
        homeAdapter.openLoadAnimation();
        homeAdapter.setOnRecyclerViewItemClickListener(new BaseQuickAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(HomeActivity.this, ACTIVITY[position]);
                startActivity(intent);
            }
        });
        mRecyclerView.setAdapter(homeAdapter);
    }

    private void initData() {
        mDataList = new ArrayList<>();
        for (int i = 0; i < TITLE.length; i++) {
            HomeItem item = new HomeItem();
            item.setTitle(TITLE[i]);
            item.setColorStr(COLOR_STR[i]);
            mDataList.add(item);
        }
    }
}
