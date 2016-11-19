package com.example.zzdanny.myapplication;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class ExchangeActivity extends AppCompatActivity {


    private Spinner spinner;
    private ArrayAdapter<String> lunchList;
    private String[] lunch = {"日圓", "美元", "人民幣", "港幣", "英鎊","澳幣","新加坡幣"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F1542A")));

        spinner = (Spinner) findViewById(R.id.coinspin);
        lunchList = new ArrayAdapter<>(ExchangeActivity.this, android.R.layout.simple_spinner_item, lunch);
        spinner.setAdapter(lunchList);

    }
}

