package com.example.mp_project.domain.routine;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class RoutineEntity {
    @NonNull
    @PrimaryKey
    public int index;

    @ColumnInfo(name = "routine_name")
    public String routine_name;

    @ColumnInfo(name = "fitness_array")
    public String fitness_array;
}