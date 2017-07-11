package com.homechart.app.smartrefreshlayout.type;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.homechart.app.smartrefreshlayout.R;
import com.scwang.smartrefresh.header.FunGameHitBlockHeader;
import com.scwang.smartrefresh.header.PhoenixHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * Created by gumenghao on 17/7/10.
 */

public class SixActivity
        extends AppCompatActivity
        implements OnRefreshListener,
        OnLoadmoreListener {


    private RefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
        //设置 Header
        PhoenixHeader header = new PhoenixHeader(this);
        refreshLayout.setRefreshHeader(header);
        //设置 Footer
        refreshLayout.setRefreshFooter(new ClassicsFooter(this));
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadmoreListener(this);
    }

    @Override
    public void onLoadmore(RefreshLayout refreshlayout) {
        refreshlayout.finishLoadmore(2000);
    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        refreshlayout.finishRefresh(2000);
    }
}
