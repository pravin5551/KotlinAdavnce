package com.example.contentmanagerapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_data")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val user_id: Int,

    @ColumnInfo(name = "user_name")
    var user_name : String,

    @ColumnInfo(name = "user_email")
    var user_email: String
)
