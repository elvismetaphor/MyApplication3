package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class InvestActivity extends AppCompatActivity{
    Button A1,A2,A3,A4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);


        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(InvestActivity.this,InvestActivity.class);
                startActivity(intent);
                finish();
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InvestActivity.this,ExchangeActivity.class);

            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InvestActivity.this,ExchangeActivity.class);

            }
        });
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InvestActivity.this,ExchangeActivity.class);

            }
        });





    }



}
