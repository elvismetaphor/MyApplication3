package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class ExrateActivity extends AppCompatActivity {
    Button exrate;
    ImageView B1,B2,B3,B4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exrate);
        Button ratebutton=(Button)findViewById(R.id.ratebutton);
        ImageView B1=(ImageView)findViewById(R.id.B1);
        ImageView B2=(ImageView)findViewById(R.id.B2);
        ImageView B3=(ImageView)findViewById(R.id.B3);
        ImageView B4=(ImageView)findViewById(R.id.B4);

        ratebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              startActivity(new Intent(ExrateActivity.this,ExchangeActivity.class));

            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(ExrateActivity.this,CreditActivity.class);
                startActivity(intent);
                finish();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExrateActivity.this,SaveActivity.class);
                startActivity(intent);
                finish();

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExrateActivity.this,TransferActivity.class);
                startActivity(intent);
                finish();

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExrateActivity.this,ExrateActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
