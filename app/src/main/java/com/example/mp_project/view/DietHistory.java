package com.example.mp_project.view;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

import java.util.List;

public class DietHistory extends AppCompatActivity {

    ImageButton goback;
    Spinner year, month, day;
    Button search;
    ListView DietHistory_ListView;

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
        DietHistory_ListView = (ListView) findViewById(R.id.DietHistory_listVIew);
        year = (Spinner) findViewById(R.id.diet_diary_year);
        month = (Spinner) findViewById(R.id.diet_diary_month);
        day = (Spinner) findViewById(R.id.diet_diary_day);
        search = (Button) findViewById(R.id.diet_diary_search);
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
        DietHistory_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
