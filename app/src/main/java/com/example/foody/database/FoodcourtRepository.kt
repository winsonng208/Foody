package com.example.foody.database

class FoodcourtRepository(private val foodcourtDao: FoodcourtDao) {

    suspend fun insert(foodCourt: FoodCourt){
        foodcourtDao.insert(foodCourt)
    }

}