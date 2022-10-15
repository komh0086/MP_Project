package com.example.mp_project.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class DietInfo extends AppCompatActivity {
    Button Btn_goback;
    EditText search_diet;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_info);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (Button)findViewById(R.id.Btn_goback);
        search_diet = (EditText) findViewById(R.id.search_diet);
    }

    private void init(){

    }

    private void setListener(){
        Btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        search_diet.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(i == keyEvent.KEYCODE_ENTER){
                    Toast.makeText(getApplicationContext(), "검색", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}
