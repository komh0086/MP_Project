package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;
import com.example.mp_project.domain.routine.RoutineAdapter;
import com.example.mp_project.domain.routine.RoutineAddService;
import com.example.mp_project.domain.routine.Routine_component;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AddRoutine  extends AppCompatActivity {

    RoutineAddService routineAddService = RoutineAddService.getInstance();

    ImageButton btn_goback;
    EditText routine_name, routine_set, routine_count, routine_title;
    Button btn_addFitness, btn_saveRoutine;
    ListView fitness_array;
    ArrayList<Routine_component> routine_data;
    RoutineAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_routine);
        find();
        init();
        setListener();
    }

    private void find(){
        btn_goback = (ImageButton) findViewById(R.id.btn_goback_addroutine);
        fitness_array = (ListView) findViewById(R.id.add_fitness_array);
        routine_title = (EditText) findViewById(R.id.add_routine_title);
        routine_name = (EditText) findViewById(R.id.add_fitness_name);
        routine_set = (EditText) findViewById(R.id.routine_set);
        routine_count  = (EditText) findViewById(R.id.routine_count);
        btn_addFitness = (Button) findViewById(R.id.btn_addFitness);
        btn_saveRoutine = (Button) findViewById(R.id.btn_saveRoutine);
    }

    private void init(){
        routine_data = new ArrayList<Routine_component>();
        adapter = new RoutineAdapter(routine_data);
        fitness_array.setAdapter(adapter);
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
                String input_set = routine_set.getText().toString();
                String input_count = routine_count.getText().toString();
                String input_name = routine_name.getText().toString();
                if (input_name.getBytes().length > 0 && input_count.getBytes().length > 0 && input_set.getBytes().length > 0) {
                    routine_data.add(new Routine_component(input_name, input_set, input_count));
                    adapter.notifyDataSetChanged();
                    routine_set.setText("");
                    routine_count.setText("");
                    routine_name.setText("");
                    Toast.makeText(getApplicationContext(), "운동이 추가되었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "잘못된 입력입니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_saveRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                routineAddService.Save_Routine(routine_title.getText().toString(), routine_data);
                finish();
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
