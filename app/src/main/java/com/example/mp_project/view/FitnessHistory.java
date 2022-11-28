package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

import java.util.Date;

public class FitnessHistory extends AppCompatActivity {
    ImageButton Btn_goback;
    Spinner Year, Month, Day;
    Button Search;
    ListView FitnessDiary_ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitness_diary);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (ImageButton) findViewById(R.id.History_goback);
        Year = (Spinner) findViewById(R.id.fitness_diary_year);
        Month = (Spinner) findViewById(R.id.fitness_diary_month);
        Day = (Spinner) findViewById(R.id.fitness_diary_day);
        Search = (Button) findViewById(R.id.fitness_diary_search);
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
