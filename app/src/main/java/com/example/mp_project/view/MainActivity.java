package com.example.mp_project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.mp_project.R;
import com.example.mp_project.view.component.RoutineCard;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    DatabaseReference RootRef = FirebaseDatabase.getInstance().getReference();

    ImageButton Btn_myInfo;
    Button Btn_addRoutine, Btn_dietInfo, Btn_fitnessInfo, Btn_history;
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
        Btn_dietInfo = (Button) findViewById(R.id.Btn_diet);
        Btn_addRoutine = (Button) findViewById(R.id.Btn_addRoutine);
        Btn_myInfo = (ImageButton) findViewById(R.id.Btn_myInfo);
        Btn_history = (Button) findViewById(R.id.Btn_history);
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
        Btn_myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.my_info);
                dialog.show();
            }
        });
        Btn_addRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddRoutine.class);
                startActivity(intent);
            }
        });
        Btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), History.class);
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