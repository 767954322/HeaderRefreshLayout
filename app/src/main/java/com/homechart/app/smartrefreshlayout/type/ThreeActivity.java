package com.homechart.app.smartrefreshlayout.type;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.homechart.app.smartrefreshlayout.R;
import com.scwang.smartrefresh.header.CircleHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * Created by gumenghao on 17/7/10.
 */

public class ThreeActivity
        extends AppCompatActivity
        implements OnRefreshListener,
        OnLoadmoreListener {


    private RefreshLayout refreshLayout;
    private Handler handler = new Handler(){};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
        CircleHeader circleHeader = new CircleHeader(this);
        refreshLayout.setRefreshHeader(circleHeader);
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadmoreListener(this);
    }

    @Override
    public void onLoadmore(RefreshLayout refreshlayout) {
        handler.postDelayed(runnable,2000);
    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        refreshlayout.finishRefresh(2000);
    }


    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            refreshLayout.finishLoadmore(0);
        }
    };

}
