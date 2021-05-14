package com.example.foody.home.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.foody.database.FoodCourt
import com.example.foody.database.FoodcourtRepository
import com.example.foody.database.FoodyDatabase
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val repository : FoodcourtRepository

    init{
        val foodcourtDao = FoodyDatabase.getInstance(application).foodcourtDao()
        repository = FoodcourtRepository(foodcourtDao)
    }

    fun insert(foodCourt: FoodCourt){
        viewModelScope.launch {
            repository.insert(foodCourt)
        }
    }
}