package com.example.contentmanagerapp.room

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface UserDAO {


    @Insert
    suspend fun insertUser(user : User) : Long

    @Delete
    suspend fun deleteUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Query("DELETE FROM user_data")
    suspend fun deleteAll()

    @Query("SELECT * FROM user_data")
    fun getAllUsersInDB() : LiveData<List<User>>
}