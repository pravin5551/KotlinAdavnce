package com.example.contentmanagerapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "UserData")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val user_id: Int,

    @ColumnInfo(name = "user_name")
    val user_name : String,

    @ColumnInfo(name = "user_email")
    val user_email: String
)
