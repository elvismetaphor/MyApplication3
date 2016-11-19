package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class InfoActivity extends AppCompatActivity {

    Button A1,A2,A3,A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(InfoActivity.this,InvestActivity.class);
                startActivity(intent);
                finish();
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,ExchangeActivity.class);
                startActivity(intent);
                finish();

            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,TransferActivity.class);
                startActivity(intent);
                finish();

            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,ExrateActivity.class);
                startActivity(intent);
                finish();

            }
        });








    }



    }
