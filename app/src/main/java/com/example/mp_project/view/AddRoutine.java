package com.example.mp_project.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;
import com.example.mp_project.domain.routine.RoutineAdapter;
import com.example.mp_project.domain.routine.RoutineAddService;
import com.example.mp_project.domain.routine.RoutineEntity;

import java.util.ArrayList;

public class AddRoutine extends AppCompatActivity {

    private static RoutineAddService routineAddService = RoutineAddService.getInstance();

    private ImageButton btn_goback;
    private TextView routine_title;
    private Button btn_addFitness, btn_saveRoutine;
    private ListView fitness_array;
    private ArrayList<RoutineEntity> routine_data;
    private RoutineAdapter adapter;
    private Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_routine);
        find();
        init();
        setListener();
    }

    private void find(){
        btn_goback = (ImageButton) findViewById(R.id.AddRoutine_goback);
        fitness_array = (ListView) findViewById(R.id.add_fitness_array);
        routine_title = (TextView) findViewById(R.id.add_routine_title);
        btn_addFitness = (Button) findViewById(R.id.AddRoutine_btn_add_routine);
        btn_saveRoutine = (Button) findViewById(R.id.AddRoutine_save_routine);
    }

    private void init(){//fitness_title 초기화 필요 제목 입력하는 화면에서 값 받아오기
        routine_data = new ArrayList<RoutineEntity>();
        adapter = new RoutineAdapter(routine_data);
        fitness_array.setAdapter(adapter);
        intent = getIntent();
        routine_title.setText(intent.getStringExtra("RoutineTitle"));
    }

    private void setListener() {
        btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_addFitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_saveRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fitness_array.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                routine_data.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
