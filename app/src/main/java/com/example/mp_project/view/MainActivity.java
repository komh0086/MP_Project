package com.example.mp_project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mp_project.R;
import com.example.mp_project.view.component.RoutineCard;

public class MainActivity extends AppCompatActivity {

    Button Btn_addRoutine, Btn_dietInfo, Btn_fitnessInfo, Btn_fitness_diary, Btn_community, Btn_diet_diary;
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
    }

    private void find(){
        Btn_fitnessInfo = (Button) findViewById(R.id.Btn_fitness_info);
        Btn_dietInfo = (Button) findViewById(R.id.Btn_diet_info);
        Btn_addRoutine = (Button) findViewById(R.id.Btn_addRoutine);
        Btn_fitness_diary = (Button) findViewById(R.id.Btn_fitness_history);
        Btn_community = (Button) findViewById(R.id.Btn_community);
        Btn_diet_diary = (Button) findViewById(R.id.Btn_diet_history);
        routine_card_layout = (LinearLayout) findViewById(R.id.routine_card_layout);
    }

    private void setListener(){
        Btn_fitnessInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FitnessInfo.class);
                startActivity(intent);
            }
        });
        Btn_addRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddRoutineTitle.class);
                startActivity(intent);
            }
        });
        Btn_fitness_diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FitnessHistory.class);
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
        Btn_community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Community.class);
                startActivity(intent);
            }
        });
        Btn_diet_diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DietHistory.class);
                startActivity(intent);
            }
        });
    }

    public void add_card(String routine_name){
        RoutineCard routineCard = new RoutineCard(getApplicationContext(), routine_name);
        routine_card_layout.addView(routineCard);
    }
}