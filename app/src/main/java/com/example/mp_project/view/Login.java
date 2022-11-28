package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class Login extends AppCompatActivity {

    EditText ID, PW;
    Button Login_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        find();
        init();
        setListener();
    }

    private void init(){

    }

    private void find(){
        ID = (EditText) findViewById(R.id.Login_ID);
        PW = (EditText) findViewById(R.id.Login_PW);
        Login_Btn = (Button) findViewById(R.id.Btn_login);
    }

    private void setListener(){
        Login_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
