package com.example.zzdanny.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by zzdanny on 2016/11/19.
 */
public class TransferActivity extends AppCompatActivity {
    String temp;
    Spinner sp1;
    Button selectbutton,buttontransfer;
    RadioGroup rgroup;
    RadioButton rrecent, rcontact;
    ImageView D1,D2,D3,D4;

    int type=3;
    EditText edtaccount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        edtaccount = (EditText) findViewById(R.id.edtaccount);
        sp1=(Spinner)findViewById(R.id.sp1);
        sp1.setOnItemSelectedListener(spnOnItemSelected);

        selectbutton = (Button) findViewById(R.id.easy);
        buttontransfer = (Button) findViewById(R.id.buttontransfer);
        final String[] name = {"王大明-33392583928483", "王小明-33392583928423", "王中明-33392583928143",};
        final String[] name2 = {"700-33392583928483", "700-33392583928423", "700-33392583928143",};
        D1=(ImageView)findViewById(R.id.D1);
        D2=(ImageView)findViewById(R.id.D2);
        D3=(ImageView)findViewById(R.id.D3);
        D4=(ImageView)findViewById(R.id.D4);
        rgroup = (RadioGroup) findViewById(R.id.rgroup);
        rrecent = (RadioButton) findViewById(R.id.rrecent);
        rcontact = (RadioButton) findViewById(R.id.rcontact);

        rgroup.setOnCheckedChangeListener(listener);

        selectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog_list = new AlertDialog.Builder(TransferActivity.this);
                dialog_list.setTitle("選擇帳號");
                if (type == 1) {
                    dialog_list.setItems(name2, new DialogInterface.OnClickListener() {
                        @Override
                        //只要你在onClick處理事件內，使用which參數，就可以知道按下陣列裡的哪一個了
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub

                            temp = name2[which].toString();
                            edtaccount.setText("" + temp);

                        }
                    });
                    dialog_list.show();

                }
                if (type == 2) {

                    dialog_list.setItems(name, new DialogInterface.OnClickListener() {
                        @Override
                        //只要你在onClick處理事件內，使用which參數，就可以知道按下陣列裡的哪一個了
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub

                            temp = name2[which].toString();
                            edtaccount.setText("" + temp);

                        }
                    });
                    dialog_list.show();
                    edtaccount.setText("" + temp);

                }
            }


        });
        buttontransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog_list = new AlertDialog.Builder(TransferActivity.this);
                dialog_list.setTitle("轉帳");
                dialog_list.setMessage("是否要將帳號綁定聯絡人");
                dialog_list.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        LayoutInflater inflater = LayoutInflater.from(TransferActivity.this);
                        final View v = inflater.inflate(R.layout.dialog_edit, null);

                        //語法一：new AlertDialog.Builder(主程式類別).XXX.XXX.XXX;
                        new AlertDialog.Builder(TransferActivity.this)
                                .setTitle("輸入此次綁定聯絡人：")
                                .setView(v)
                                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        EditText editText = (EditText) (v.findViewById(R.id.editText1));
                                        Toast.makeText(getApplicationContext(), "你的綁定的是" +

                                                editText.getText().toString(), Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .show();

                    }
                });

                dialog_list.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }

                });
                dialog_list.show();

            }

            ;
        });

        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(TransferActivity.this,CreditActivity.class);
                startActivity(intent);
                finish();
            }
        });
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TransferActivity.this,SaveActivity.class);
                startActivity(intent);
                finish();

            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TransferActivity.this,TransferActivity.class);
                startActivity(intent);
                finish();

            }
        });
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TransferActivity.this,ExrateActivity.class);
                startActivity(intent);
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





            public RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int p = group.indexOfChild((RadioButton) findViewById(checkedId));
                    int count = group.getChildCount();
                    switch (checkedId) {
                        case R.id.rrecent:
                            type = 1;
                            Log.d("type", "" + type);
                            break;
                        case R.id.rcontact:
                            type = 2;
                            Log.d("type", "" + type);
                            break;
                    }
                }

            };
        }




