package com.example.foody.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities = [FoodCourt :: class],
    version = 1, exportSchema = false)
abstract class FoodyDatabase : RoomDatabase() {

    abstract fun foodcourtDao() : FoodcourtDao

    companion object {

        @Volatile
        private var INSTANCE: FoodyDatabase? = null

        fun getInstance(context: Context): FoodyDatabase {

            val tempInstance = INSTANCE

            if(tempInstance != null){
                return  tempInstance
            }

            synchronized(this) {
                var instance = databaseBuilder(
                    context.applicationContext,
                    FoodyDatabase::class.java,
                    "foody_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}