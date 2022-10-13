package com.example.mp_project.domain.fitness;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = FitnessEntity.class, version = 1)
public abstract class FitnessDB extends RoomDatabase {
    public abstract  FitnessDAO fitnessDAO();
    private static FitnessDB myDB;

    public static FitnessDB getInstance(Context context){
        if(myDB == null){
            myDB = Room.databaseBuilder(context.getApplicationContext(),
                    FitnessDB.class, "fitness_DB").build();
        }
        return myDB;
    }
}