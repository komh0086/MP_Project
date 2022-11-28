package com.example.mp_project.view;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class DietHistory extends AppCompatActivity {

    ImageButton goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_history);
        find();
        init();
        setListener();
    }

    private void find(){
        goback = (ImageButton) findViewById(R.id.DietHistory_goback);
    }

    private void init(){

    }

    private void setListener(){
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
