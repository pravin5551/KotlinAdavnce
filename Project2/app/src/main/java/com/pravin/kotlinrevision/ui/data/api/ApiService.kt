package com.pravin.kotlinrevision.ui.data.api

import com.pravin.kotlinrevision.ui.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}