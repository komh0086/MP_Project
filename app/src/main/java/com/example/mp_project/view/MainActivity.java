package com.example.mp_project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mp_project.R;
import com.example.mp_project.domain.routine.RoutineDAO;
import com.example.mp_project.domain.routine.RoutineDB;
import com.example.mp_project.domain.routine.RoutineEntity;

public class MainActivity extends AppCompatActivity {
    RoutineDB routineDB = RoutineDB.getInstance(getApplicationContext());
    ImageButton Btn_back;
    Button Btn_addRoutine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
        setListener();
    }

    private void find(){
        Btn_addRoutine = (Button) findViewById(R.id.Btn_addRoutine);
        Btn_back = (ImageButton) findViewById(R.id.ImgBtn_back);
    }

    private void setListener(){
        Btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        Btn_addRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoutineEntity test = new RoutineEntity();
                RoutineDAO dao = routineDB.routineDAO();
                dao.insert(test);
                Toast.makeText(MainActivity.this, "asdfasdf", Toast.LENGTH_SHORT).show();
            }
        });
    }
}