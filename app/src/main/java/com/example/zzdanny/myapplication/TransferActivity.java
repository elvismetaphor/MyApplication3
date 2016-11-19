package com.example.zzdanny.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class TransferActivity extends AppCompatActivity {
    String temp;
    Button selectbutton;
    RadioGroup rgroup;
    RadioButton rrecent, rcontact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        selectbutton = (Button) findViewById(R.id.easy);
        final String[] name = {"王大明-33392583928483", "王小明-33392583928423", "王中明-33392583928143",};
        final String[] name2 = {"700-33392583928483", "700-33392583928423", "700-33392583928143",};

        rgroup = (RadioGroup) findViewById(R.id.rgroup);
        rrecent = (RadioButton) findViewById(R.id.rrecent);
        rcontact = (RadioButton) findViewById(R.id.rcontact);

        rgroup.setOnCheckedChangeListener(listener);
            

        AlertDialog.Builder dialog_list = new AlertDialog.Builder(TransferActivity.this);
        dialog_list.setTitle("利用List呈現");
        dialog_list.setItems(name, new DialogInterface.OnClickListener() {
            @Override
            //只要你在onClick處理事件內，使用which參數，就可以知道按下陣列裡的哪一個了
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                temp = name[which].toString();
            }
        });
        dialog_list.show();

    }

    public RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            int p = group.indexOfChild((RadioButton) findViewById(checkedId));
            int count = group.getChildCount();
            switch(checkedId)
            {
                case R.id.rrecent:


                case R.id.rcontact:


            }
        }
    };


    }
