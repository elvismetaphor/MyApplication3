package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class CreditActivity extends AppCompatActivity {
    ImageView A1,A2,A3,A4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditcard);
        A1=(ImageView)findViewById(R.id.A1);
        A2=(ImageView)findViewById(R.id.A2);
        A3=(ImageView)findViewById(R.id.A3);
        A4=(ImageView)findViewById(R.id.A4);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreditActivity.this,CreditActivity.class);
                startActivity(intent);
                finish();
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreditActivity.this,SaveActivity.class);
                startActivity(intent);
                finish();
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreditActivity.this,TransferActivity.class);
                startActivity(intent);
                finish();
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreditActivity.this,ExrateActivity.class);
                startActivity(intent);
                finish();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CreditActivity.this, OverspendNotifySettings.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
