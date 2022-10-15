package com.example.mp_project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mp_project.R;
import com.example.mp_project.domain.routine.RoutineDAO;
import com.example.mp_project.domain.routine.RoutineDB;
import com.example.mp_project.domain.routine.RoutineEntity;
import com.example.mp_project.view.component.RoutineCard;

public class MainActivity extends AppCompatActivity {
    public static Context mycontext;
    ImageButton Btn_myInfo;
    Button Btn_addRoutine, Btn_dietInfo;
    LinearLayout routine_card_layout;
    LayoutInflater mInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
        init();
        setListener();
    }

    private void init(){
        mInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        mycontext = this;
    }

    private void find(){
        Btn_dietInfo = (Button) findViewById(R.id.Btn_diet);
        Btn_addRoutine = (Button) findViewById(R.id.Btn_addRoutine);
        Btn_myInfo = (ImageButton) findViewById(R.id.Btn_myInfo);
        routine_card_layout = (LinearLayout) findViewById(R.id.routine_card_layout);
    }

    private void setListener(){
        Btn_myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        Btn_addRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddRoutine.class);
                startActivity(intent);
            }
        });
        Btn_dietInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DietInfo.class);
                startActivity(intent);
            }
        });
    }

    public void add_card(String routine_name){
        RoutineCard routineCard = new RoutineCard(getApplicationContext(), routine_name);
        routine_card_layout.addView(routineCard);
    }
}