package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;
import com.example.mp_project.domain.routine.RoutineAdaptor;
import com.example.mp_project.domain.routine.Routine_component;

import java.util.ArrayList;

public class AddRoutine  extends AppCompatActivity {

    ImageButton btn_goback;
    EditText routine_name, routine_set, routine_count;
    Button btn_addFitness, btn_saveRoutine;
    ListView fitness_array;
    ArrayList<Routine_component> routine_data;
    RoutineAdaptor adaptor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_routine);
        find();
        init();
        setListener();
    }

    private void find(){
        btn_goback = (ImageButton) findViewById(R.id.btn_goback_addroutine);
        fitness_array = (ListView) findViewById(R.id.fitness_array);
        routine_name = (EditText) findViewById(R.id.add_fitness_name);
        routine_set = (EditText) findViewById(R.id.routine_set);
        routine_count  = (EditText) findViewById(R.id.routine_count);
        btn_addFitness = (Button) findViewById(R.id.btn_addFitness);
        btn_saveRoutine = (Button) findViewById(R.id.btn_saveRoutine);
    }

    private void init(){
        adaptor = new RoutineAdaptor(this, routine_data);
        routine_data = new ArrayList<Routine_component>();
        for(int i=0;i<3;i++){
            Routine_component a = new Routine_component("aa", 2, 2);
            routine_data.add(a);
        }
        //adapter추가 과정에서 에러가 생김
        //fitness_array.setAdapter(adaptor);
    }

    private void setListener(){
        btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_addFitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_set = routine_set.getText().toString();
                String input_count = routine_count.getText().toString();
                String input_name = routine_name.getText().toString();
                if(input_name.getBytes().length > 0 && input_count.getBytes().length > 0 && input_set.getBytes().length > 0) {
                    Toast.makeText(getApplicationContext(), "운동이 추가되었습니다.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "잘못된 입력입니다!", Toast.LENGTH_SHORT).show();
                }
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
