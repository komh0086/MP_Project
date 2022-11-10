package com.example.mp_project.domain.routine;

import androidx.annotation.NonNull;

import com.example.mp_project.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class RoutineAddService {

    private static RoutineAddService instance = new RoutineAddService();

    private static DatabaseReference mRootRef;
    private static DatabaseReference routineRef;
    private RoutineAddService(){}

    public static RoutineAddService getInstance(){
        return instance;
    }

    public static void init(String name){
        mRootRef = FirebaseDatabase.getInstance().getReference();
        routineRef = mRootRef.child("UID")
                .child(String.valueOf(R.string.UserID)).child("routines").child(name);
    }

    public void Save_Routine(String name, ArrayList<RoutineEntity> routines){
        init(name);
        for(int i=0;i<routines.size();i++){
            routineRef.child(Integer.toString(i+1)).setValue(routines.get(i));
        }
    }

}
