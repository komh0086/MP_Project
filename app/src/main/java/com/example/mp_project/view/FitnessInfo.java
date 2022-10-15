package com.example.mp_project.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class FitnessInfo extends AppCompatActivity {
    ImageButton Btn_goback;
    Button Btn_chest, Btn_back, Btn_shoulder, Btn_ceps, Btn_core, Btn_lower, Btn_aerobic;
    LinearLayout layout_chest, layout_back, layout_shoulder, layout_ceps, layout_core, layout_lower, layout_aerobic;
    FrameLayout frameLayout;
    private int Button_index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitness_info);
        find();
        init();
        setListener();
    }

    private void find(){
        Btn_goback = (ImageButton) findViewById(R.id.btn_goback);
        Btn_chest = (Button) findViewById(R.id.Btn_chest);
        Btn_back= (Button) findViewById(R.id.Btn_back);
        Btn_shoulder= (Button) findViewById(R.id.Btn_shoulder);
        Btn_ceps = (Button) findViewById(R.id.Btn_ceps);
        Btn_core= (Button) findViewById(R.id.Btn_core);
        Btn_lower = (Button) findViewById(R.id.Btn_lower);
        Btn_aerobic= (Button) findViewById(R.id.Btn_aerobic);

        layout_chest = (LinearLayout) findViewById(R.id.layout_chest);
        layout_back = (LinearLayout) findViewById(R.id.layout_back);
        layout_shoulder = (LinearLayout) findViewById(R.id.layout_shoulder);
        layout_ceps = (LinearLayout) findViewById(R.id.layout_ceps);
        layout_lower = (LinearLayout) findViewById(R.id.layout_lower);
        layout_core = (LinearLayout) findViewById(R.id.layout_core);
        layout_aerobic = (LinearLayout) findViewById(R.id.layout_aerobic);

        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
    }

    private void init(){
        Button_index=-1;
    }

    private void setListener(){
        Btn_goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Btn_chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=1) {
                    Button_index=1;

                    Btn_chest.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.VISIBLE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=2) {
                    Button_index = 2;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.VISIBLE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=3) {
                    Button_index = 3;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.VISIBLE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_ceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=4) {
                    Button_index = 4;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.VISIBLE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=5) {
                    Button_index = 5;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.VISIBLE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_core.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=6) {
                    Button_index = 6;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#4BD2F3"));
                    Btn_aerobic.setTextColor(Color.parseColor("#A0A0A0"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.VISIBLE);
                    layout_aerobic.setVisibility(View.GONE);
                }
            }
        });

        Btn_aerobic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Button_index!=7) {
                    Button_index = 7;

                    Btn_chest.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_back.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_shoulder.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_ceps.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_lower.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_core.setTextColor(Color.parseColor("#A0A0A0"));
                    Btn_aerobic.setTextColor(Color.parseColor("#4BD2F3"));

                    layout_chest.setVisibility(View.GONE);
                    layout_back.setVisibility(View.GONE);
                    layout_shoulder.setVisibility(View.GONE);
                    layout_ceps.setVisibility(View.GONE);
                    layout_lower.setVisibility(View.GONE);
                    layout_core.setVisibility(View.GONE);
                    layout_aerobic.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
