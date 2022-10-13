package com.example.mp_project.domain.fitness;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fitness")
public class FitnessEntity {
    @NonNull
    @PrimaryKey
    public int index;

    @ColumnInfo(name = "target")
    public String target;

    @ColumnInfo(name = "fitness_name")
    public String fitness_name;

    @ColumnInfo(name = "comment")
    public String commnet;
}