package com.example.mp_project.domain.community;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.mp_project.R;

import java.util.ArrayList;

public class CommunityAdapter extends BaseAdapter {

    private ArrayList<CommunitySummaryEntity> data;

    public CommunityAdapter(ArrayList<CommunitySummaryEntity> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.community_component, parent, false);
        }
        TextView title = (TextView) view.findViewById(R.id.Community_title);
        TextView views = (TextView) view.findViewById(R.id.views);
        TextView likes = (TextView) view.findViewById(R.id.likes);
        TextView hates = (TextView) view.findViewById(R.id.hates);

        CommunitySummaryEntity community_component = data.get(position);

        title.setText(community_component.getTitle());
        views.setText(community_component.getViews().toString());
        likes.setText(community_component.getLikes().toString());
        hates.setText(community_component.getHates().toString());

        return view;
    }
}
