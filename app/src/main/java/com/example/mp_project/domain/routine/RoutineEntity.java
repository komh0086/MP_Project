package com.example.mp_project.domain.routine;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class RoutineEntity {
    String fitness_name;
    String set, count;

    public RoutineEntity(String name, String set, String count){
        this.fitness_name = name;
        this.set = set;
        this.count = count;
    }

    public RoutineEntity(){
        new RoutineEntity("default", "0", "0");
    }

    public String getName(){
        return fitness_name;
    }

    public String getSet(){
        return set;
    }

    public String getCount(){
        return count;
    }
}
