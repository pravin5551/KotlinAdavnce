package com.example.contentmanagerapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "UserData")
data class User(
    @ColumnInfo(name = "user_id")
    val user_id: Int,

    @ColumnInfo(name = "user_name")
    val user_name : String,

    @ColumnInfo(name = "user_email")
    val user_email: String
)
