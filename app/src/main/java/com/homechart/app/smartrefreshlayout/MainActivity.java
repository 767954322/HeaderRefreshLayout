package com.homechart.app.smartrefreshlayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.homechart.app.smartrefreshlayout.type.FourActivity;
import com.homechart.app.smartrefreshlayout.type.OneActivity;
import com.homechart.app.smartrefreshlayout.type.ThreeActivity;
import com.homechart.app.smartrefreshlayout.type.TwoActivity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class MainActivity extends AppCompatActivity {

    private RefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent1);
            }
        });
        findViewById(R.id.bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent1);
            }
        });
        findViewById(R.id.bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ThreeActivity.class);
                startActivity(intent1);
            }
        });
        findViewById(R.id.bt_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, FourActivity.class);
                startActivity(intent1);
            }
        });

    }
}
