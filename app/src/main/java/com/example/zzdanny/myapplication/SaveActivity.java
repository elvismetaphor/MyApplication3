package com.example.zzdanny.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zzdanny on 2016/11/20.
 */
public class SaveActivity extends AppCompatActivity{
    ImageView C1,C2,C3,C4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        C1=(ImageView)findViewById(R.id.C1);
        C2=(ImageView)findViewById(R.id.C2);
        C3=(ImageView)findViewById(R.id.C3);
        C4=(ImageView)findViewById(R.id.C4);

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SaveActivity.this,CreditActivity.class);
                startActivity(intent);
                finish();
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SaveActivity.this,SaveActivity.class);
                startActivity(intent);
                finish();
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SaveActivity.this,TransferActivity.class);
                startActivity(intent);
                finish();

            }
        });

        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SaveActivity.this,ExrateActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
