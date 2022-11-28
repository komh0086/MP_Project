package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class DietInfoIndex extends AppCompatActivity {

    ImageButton GoBack;
    TextView Title, Amount, Kcal, Carbs, Protein, Fat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_info_index_view);
        find();
        init();
        setListener();
    }

    private void find(){
        GoBack = (ImageButton) findViewById(R.id.DietInfo_goback);
        Title = (TextView) findViewById(R.id.DietInfo_index_title);
        Amount = (TextView) findViewById(R.id.diet_info_amount);
        Kcal = (TextView) findViewById(R.id.diet_info_kcal);
        Carbs = (TextView) findViewById(R.id.diet_info_carbs);
        Protein = (TextView) findViewById(R.id.diet_info_protein);
        Fat = (TextView) findViewById(R.id.diet_info_fat);
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
