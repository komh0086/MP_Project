package com.example.mp_project.domain.routine;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RoutineDAO {
//    @Query("Select *")
//    List<RoutineEntity> getAll();

    @Insert
    void insert_All(List<RoutineEntity> all_Entities);

    @Insert
    void insert(RoutineEntity insert_entity);

    @Delete
    void delete(RoutineEntity delete_entity);
}