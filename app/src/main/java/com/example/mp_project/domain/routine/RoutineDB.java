package com.example.mp_project.domain.routine;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = RoutineEntity.class, version = 1)
public abstract class RoutineDB extends RoomDatabase {
    public abstract RoutineDAO routineDAO();
    private static RoutineDB myDB;

    public static RoutineDB getInstance(Context context){
        if(myDB == null){
            myDB = Room.databaseBuilder(context.getApplicationContext(),
                    RoutineDB.class, "fitness_DB").build();
        }
        return myDB;
    }
}