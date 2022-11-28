package com.example.mp_project.view.component;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mp_project.R;
import com.google.firebase.database.FirebaseDatabase;


public class MyInfo extends Dialog implements View.OnClickListener{

    private FirebaseDatabase RootDB;


    private Button Btn_edit, Btn_exit;
    private EditText name, gender, age, height, weight;
    private Context context;

    public MyInfo(Context context) {
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_info);
        find();
        setListener();
    }

    private void find(){
        Btn_edit = (Button) findViewById(R.id.MyInfo_edit);
        Btn_edit = (Button) findViewById(R.id.MyInfo_exit);
        name = (EditText) findViewById(R.id.MyInfo_userName);
        gender = (EditText) findViewById(R.id.MyInfo_gender);
        age = (EditText) findViewById(R.id.MyInfo_age);
        height = (EditText) findViewById(R.id.MyInfo_height);
        weight = (EditText) findViewById(R.id.MyInfo_weight);

    }
    private void setListener(){
        Btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "asdfasdf", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
