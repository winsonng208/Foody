package com.example.foody.database

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface FoodcourtDao {
    @Insert
    suspend fun insert(foodCourt: FoodCourt)
}