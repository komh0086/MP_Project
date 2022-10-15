package com.example.mp_project.domain.routine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mp_project.R;

import java.util.ArrayList;

public class RoutineAdaptor extends BaseAdapter {

    private ArrayList<Routine_component> data;
    private Context context;
    LayoutInflater inflater;

    public RoutineAdaptor(Context context, ArrayList<Routine_component> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemLayout = inflater.inflate(R.layout.listview_layout, null);

        TextView nameView = (TextView) itemLayout.findViewById(R.id.list_title);
        TextView subView = (TextView) itemLayout.findViewById(R.id.list_sub);
        return itemLayout;
    }
}
