package com.example.foody.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FoodCourt")
data class FoodCourt (

        @PrimaryKey(autoGenerate = true)
        val foodcourtId : Long = 100L,

        @ColumnInfo(name = "Image")
        val imageResources: Int,

        @ColumnInfo(name = "Name")
        val name: String,

        @ColumnInfo(name = "Address")
        val address: String,

        @ColumnInfo(name = "City")
        val city: String,


)