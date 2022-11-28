package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class DietHistoryIndex extends AppCompatActivity {

    ImageButton GoBack;
    TextView Title, Amount, Kcal, Carbs, Protein, Fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_history_index_view);
        find();
        init();
        setListener();
    }

    private void find(){
        GoBack = (ImageButton) findViewById(R.id.DietHistory_goback);
        Title = (TextView) findViewById(R.id.DietHistory_index_title);
        Amount = (TextView) findViewById(R.id.diet_diary_amount);
        Kcal = (TextView) findViewById(R.id.diet_diary_kcal);
        Carbs = (TextView) findViewById(R.id.diet_diary_carbs);
        Protein = (TextView) findViewById(R.id.diet_diary_protein);
        Fat = (TextView) findViewById(R.id.diet_diary_fat);
    }
    private void init(){

    }
    private void setListener(){
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
