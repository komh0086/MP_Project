package com.example.mp_project.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mp_project.R;

public class CommunityIndex extends AppCompatActivity {

    ImageButton GoBack;
    TextView Title, Content;
    ListView CommentListView;
    EditText Comment;
    Button BtnAddComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_index_view);
        find();
        init();
        setListener();
    }

    private void find(){
        GoBack = (ImageButton) findViewById(R.id.Community_index_goback);
        Title = (TextView) findViewById(R.id.Community_index_title);
        Content = (TextView) findViewById(R.id.Community_index_content);
        CommentListView = (ListView) findViewById(R.id.comment_listView);
        Comment = (EditText) findViewById(R.id.Comment);
        BtnAddComment = (Button) findViewById(R.id.AddComment_btn);
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
