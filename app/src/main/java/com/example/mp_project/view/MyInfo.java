package com.example.mp_project.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mp_project.R;


public class MyInfo extends Dialog implements View.OnClickListener{

    private dialogListener dl;

    private Button Btn_edit, Btn_exit;
    private EditText name, gender, age, height, weight;
    private Context context;

    public MyInfo(Context context) {
        super(context);
        this.context = context;
    }

    interface dialogListener{
        void OnEditListener(String name, String gender, String age, String height, String weight);
        void OnExitListener();
    }
    public void setDialogListener(dialogListener dl){
        this.dl = dl;
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
        Btn_edit.setOnClickListener(this);
        Btn_exit.setOnClickListener(this);
//        Btn_edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                user_nameRef.setValue(name.getText().toString());
//                user_genderRef.setValue(gender.getText().toString());
//                user_ageRef.setValue(age.getText().toString());
//                user_heightRef.setValue(height.getText().toString());
//                user_weightRef.setValue(weight.getText().toString());
//            }
//        });
//        Btn_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "asdf", Toast.LENGTH_SHORT).show();
//                cancel();
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.MyInfo_edit:
                String MyInfo_name = name.getText().toString();
                String MyInfo_gender = gender.getText().toString();
                String MyInfo_age = age.getText().toString();
                String MyInfo_height = height.getText().toString();
                String MyInfo_weight = weight.getText().toString();
                dl.OnEditListener(MyInfo_name, MyInfo_gender, MyInfo_age, MyInfo_height, MyInfo_weight);
                dismiss();
                break;
            case R.id.MyInfo_exit:
                cancel();
                break;
        }
    }
}
