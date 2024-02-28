package com.example.contentmanagerapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 1)
abstract class UserDataBase : RoomDatabase(){

    abstract val userDao: UserDAO


    //Singleton design patter
    companion object {
        private val INSTANCE: UserDataBase? = null
        fun getInstance(context: Context): UserDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    //creating the object of database instance
                    instance = Room.databaseBuilder(context.applicationContext,
                        UserDataBase::class.java, "user_db").build()
                }
                return instance
            }
        }
    }

}