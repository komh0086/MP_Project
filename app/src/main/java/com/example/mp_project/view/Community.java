package com.example.mp_project.view;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;
import com.example.mp_project.domain.community.CommunityAdapter;
import com.example.mp_project.domain.community.CommunityService;
import com.example.mp_project.domain.community.CommunitySummaryEntity;

import java.util.ArrayList;

public class Community extends AppCompatActivity {

    private static CommunityService communityService = CommunityService.getInstance();

    private ImageButton goback, refresh;
    private ListView community_array;
    private ArrayList<CommunitySummaryEntity> community_data;
    private CommunityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community);
        find();
        init();
        setListener();
    }

    private void find(){
        goback = (ImageButton)findViewById(R.id.Community_goback);
        refresh = (ImageButton) findViewById(R.id.Community_refresh);
        community_array = (ListView) findViewById(R.id.Community_list);
    }

    private void init(){
        community_data = new ArrayList<CommunitySummaryEntity>();
        adapter = new CommunityAdapter(community_data);
        community_array.setAdapter(adapter);
    }

    private void setListener(){
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        community_array.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //해당 커뮤니티 글 접속
            }
        });
    }
}
