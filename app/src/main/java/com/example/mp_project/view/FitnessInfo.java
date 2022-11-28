package com.example.mp_project.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class FitnessInfo extends AppCompatActivity {
    ImageButton Btn_goback;
    Spinner MainTarget, DetailedTarget;
    Button Search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitness_info);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (ImageButton) findViewById(R.id.FitnessInfo_goback);
        MainTarget = (Spinner) findViewById(R.id.fitness_info_main_target);
        DetailedTarget = (Spinner) findViewById(R.id.fitness_info_detailed_target);
        Search = (Button) findViewById(R.id.fitness_info_Btn_search);
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
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
