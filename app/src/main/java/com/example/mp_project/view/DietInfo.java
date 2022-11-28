package com.example.mp_project.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

import java.util.List;

public class DietInfo extends AppCompatActivity {
    ImageButton Btn_goback;
    Spinner MajorCategory, DetailedCategory;
    Button Search;
    ListView DietInfo_ListView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_info);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (ImageButton) findViewById(R.id.DietInfo_goback);
        Search = (Button) findViewById(R.id.search_diet);
        MajorCategory = (Spinner) findViewById(R.id.DietInfo_majorCategory);
        DetailedCategory = (Spinner) findViewById(R.id.DietInfo_detailedCategory);
        DietInfo_ListView = (ListView) findViewById(R.id.DietInfo_ListView);
    }

    private void init(){

    }

    private void setListener(){
        Btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        DietInfo_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
