package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class InfoActivity extends AppCompatActivity {

    ImageView A1,A2,A3,A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        A1=(ImageView)findViewById(R.id.A1);
        A2=(ImageView)findViewById(R.id.A2);
        A3=(ImageView)findViewById(R.id.A3);
        A4=(ImageView)findViewById(R.id.A4);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,CreditActivity.class);
                startActivity(intent);
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,SaveActivity.class);
                startActivity(intent);
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,TransferActivity.class);
                startActivity(intent);
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InfoActivity.this,ExrateActivity.class);
                startActivity(intent);
            }
        });
    }
}
