package com.example.mp_project.domain.routine;

public class Routine_component {
    String fitness_name;
    String set, count;

    public Routine_component(String name, String set, String count){
        this.fitness_name = name;
        this.set = set;
        this.count = count;
    }

    Routine_component(){
        new Routine_component("default", "0", "0");
    }

    public String get_name(){
        return fitness_name;
    }

    public String get_set(){
        return set;
    }

    public String get_count(){
        return count;
    }
}
