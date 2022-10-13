package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;
import com.example.mp_project.view.component.RoutineCard;

public class AddRoutine  extends AppCompatActivity {

    EditText routine_name;
    Button btn_addFitness, btn_saveRoutine;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_routine);
        find();
        init();
        setListener();
    }

    private void find(){
        routine_name = (EditText) findViewById(R.id.routine_name);
        btn_addFitness = (Button) findViewById(R.id.btn_addFitness);
        btn_saveRoutine = (Button) findViewById(R.id.btn_saveRoutine);
    }

    private void init(){

    }

    private void setListener(){
        btn_addFitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_saveRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //((MainActivity)MainActivity.mycontext).add_card(routine_name.getText().toString()); 얘가 문제인데 왜인지를 모르겠네
                finish();
            }
        });
    }
}
