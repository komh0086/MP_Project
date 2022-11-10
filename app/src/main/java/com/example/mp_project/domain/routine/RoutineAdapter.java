package com.example.mp_project.domain.routine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mp_project.R;

import java.util.ArrayList;

public class RoutineAdapter extends BaseAdapter {

    private ArrayList<RoutineEntity> data;

    public RoutineAdapter(ArrayList<RoutineEntity> routine_data) {
        this.data = routine_data;
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
            view = inflater.inflate(R.layout.routine_card_component, parent, false);
        }
        TextView name = (TextView) view.findViewById(R.id.routine_card_fit_name);
        TextView set = (TextView) view.findViewById(R.id.routine_card_fit_set);
        TextView count = (TextView) view.findViewById(R.id.routine_card_fit_count);

        RoutineEntity routine_component = data.get(position);

        name.setText(routine_component.getName());
        set.setText(routine_component.getSet());
        count.setText(routine_component.getCount());

        return view;
    }
    public void add_routine_fit(String name, String set, String count){
        RoutineEntity item = new RoutineEntity(name, set, count);
        data.add(item);
    }
    public void delete_routine_fit(int position){
        data.remove(position);
    }
}
