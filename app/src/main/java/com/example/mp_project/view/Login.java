package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class Login  extends AppCompatActivity {

    EditText ID, PW;
    Button Sign_up, Sign_in;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        find();
        init();
        setListener();
    }
    private void find(){
        ID = (EditText) findViewById(R.id.Login_ID);
        PW = (EditText) findViewById(R.id.Login_PW);
        Sign_in = (Button) findViewById(R.id.Btn_Login);
        Sign_up = (Button) findViewById(R.id.Btn_Registration);
    }
    private void init(){

    }
    private void setListener(){

        Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
