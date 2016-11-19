package com.example.zzdanny.myapplication;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class ExchangeActivity extends AppCompatActivity {

    Spinner mSpn1,mSpn2,mSpn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpn1 = (Spinner) findViewById(R.id.coinspin);
        mSpn1.setOnItemSelectedListener(spnOnItemSelected);
        mSpn2 = (Spinner) findViewById(R.id.spinner2);
        mSpn2.setOnItemSelectedListener(spnOnItemSelected);
        mSpn3 = (Spinner) findViewById(R.id.spinner3);
        mSpn3.setOnItemSelectedListener(spnOnItemSelected);


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

