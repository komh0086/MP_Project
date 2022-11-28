package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

import java.util.Date;

public class History extends AppCompatActivity {
    ImageButton Btn_goback;
    CalendarView history_calendar;
    TextView routine_name;
    ListView routine_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (ImageButton) findViewById(R.id.History_goback);
        history_calendar = (CalendarView) findViewById(R.id.history_calendar);
        routine_name = (TextView) findViewById(R.id.history_routine_name);
        routine_list = (ListView) findViewById(R.id.history_fitness_list);
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
    }
    private void checkDay(int year, int month, int day){

    }
}
