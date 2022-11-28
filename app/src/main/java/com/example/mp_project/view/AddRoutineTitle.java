package com.example.mp_project.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class AddRoutineTitle extends AppCompatActivity {

    EditText RoutineTitleInput;
    Button RoutineTitleSave;
    ImageButton GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_routine_title);
        find();
        init();
        setListener();
    }

    private void find(){
        RoutineTitleInput = (EditText) findViewById(R.id.routine_title_input);
        RoutineTitleSave = (Button) findViewById(R.id.add_routine_btn_title_save);
        GoBack = (ImageButton) findViewById(R.id.add_routine_title_goback);
    }
    private void init(){

    }
    private void setListener(){
        RoutineTitleSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddRoutine.class);
                intent.putExtra("RoutineTitle", RoutineTitleInput.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
