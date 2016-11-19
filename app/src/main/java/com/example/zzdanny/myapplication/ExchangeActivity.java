package com.example.zzdanny.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class ExchangeActivity extends AppCompatActivity {

    Spinner mSpn1,mSpn2,mSpn3;
    Button buttonexchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        buttonexchange(findViewById(R.id.buttonexchange);
        mSpn1 = (Spinner) findViewById(R.id.coinspin);
        mSpn1.setOnItemSelectedListener(spnOnItemSelected);
        mSpn2 = (Spinner) findViewById(R.id.spinner2);
        mSpn2.setOnItemSelectedListener(spnOnItemSelected);
        mSpn3 = (Spinner) findViewById(R.id.spinner3);
        mSpn3.setOnItemSelectedListener(spnOnItemSelected);


        buttonexchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExchangeActivity.this,ExrateActivity.class));
                finish();
            }
        });


    }

    private AdapterView.OnItemSelectedListener spnOnItemSelected
            = new AdapterView.OnItemSelectedListener()
    {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
        {
            // TODO Auto-generated method stub
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0)
        {
            // TODO Auto-generated method stub
        }
    };


    }

