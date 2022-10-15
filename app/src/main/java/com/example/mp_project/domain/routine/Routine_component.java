package com.example.mp_project.domain.routine;

public class Routine_component {
    String fitness_name;
    int set, count;

    public Routine_component(String name, int set, int count){
        this.fitness_name = name;
        this.set = set;
        this.count = count;
    }

    Routine_component(){
        new Routine_component("default", 0, 0);
    }

    public String get_name(){
        return fitness_name;
    }

    public int get_set(){
        return set;
    }

    public int get_count(){
        return count;
    }
}
