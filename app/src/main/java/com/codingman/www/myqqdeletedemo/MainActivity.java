package com.codingman.www.myqqdeletedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyViewQQDeleteDemo15 demo15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.paint_layout);

        FrameLayout root = (FrameLayout) findViewById(R.id.root);
        demo15 = new MyViewQQDeleteDemo15(getApplicationContext());
        root.addView(demo15);
    }

    public void reset(View v) {
        Toast.makeText(getApplicationContext(),"点击我了",Toast.LENGTH_SHORT).show();
//        demo15.reset();
    }
}
