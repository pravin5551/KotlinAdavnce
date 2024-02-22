package com.pravin.kotlinrevision.ui.data.api

class ApiHelper(private val apiService: ApiService){


    suspend fun getApiHelper() = apiService.getUsers()

}