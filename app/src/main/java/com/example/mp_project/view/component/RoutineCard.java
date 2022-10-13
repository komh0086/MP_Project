package com.example.mp_project.view.component;

import static java.lang.System.exit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.mp_project.R;

public class RoutineCard extends LinearLayout {

    Button routine_title;
    ListView fitness_array;

    public RoutineCard(Context context, String routine_title) {
        super(context);
        init(context, routine_title);
        find();
        setListener();
    }

    private void init(Context context, String routine_title){
        setMinimumWidth(1000);
        setMinimumHeight(700);
        this.routine_title.setText(routine_title);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.routine_card, this, true);
    }


    private void find(){
        routine_title = (Button) findViewById(R.id.routine_title);
        fitness_array = (ListView) findViewById(R.id.fitness_array);
    }

    private void setListener(){
        routine_title.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                exit(0);
                //routine_title로 루틴 정보 찾아서 검색
            }
        });
    }
}
