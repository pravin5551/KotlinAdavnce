package com.example.contentmanagerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.contentmanagerapp.MainActivity
import com.example.contentmanagerapp.room.UserRepository

class ViewModelFactory(private val repository: UserRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(UserViewModel::class.java)){
            return UserViewModel(repository) as T
        }
        throw java.lang.IllegalArgumentException("UnKnown view model")
    }
}