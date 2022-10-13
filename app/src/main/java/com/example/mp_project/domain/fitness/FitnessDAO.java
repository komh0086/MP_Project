package com.example.mp_project.domain.fitness;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FitnessDAO {
    //@Query("Select *")
    //List<FitnessEntity> getAll();

//    @Query("SELECT * FROM FitnessEntity WHERE fitness_name LIKE :search ")
//    public List<FitnessEntity> findUserWithName(String search);

    @Insert
    void insert_All(List<FitnessEntity> all_entities);

    @Insert
    void insert(FitnessEntity insert_entity);

    @Delete
    void delete(FitnessEntity del_entity);

}