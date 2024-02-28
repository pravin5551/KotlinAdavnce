package com.example.contentmanagerapp.viewmodel

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contentmanagerapp.room.User
import com.example.contentmanagerapp.room.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository) : ViewModel(),
    androidx.databinding.Observable {
    override fun addOnPropertyChangedCallback(callback: androidx.databinding.Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: androidx.databinding.Observable.OnPropertyChangedCallback?) {

    }

    val user = repository.user
    private var isUpdateOrDelete = false
    lateinit var userToUpdateOrDelete: User

    @Bindable
    val inputeName = MutableLiveData<String?>()

    @Bindable
    val inputeEmail = MutableLiveData<String?>()

    @Bindable
    val clearAllOrDeleteBtnTxt = MutableLiveData<String>()

    @Bindable
    val saveOrUpdateBtnTxt = MutableLiveData<String>()

    init {
        clearAllOrDeleteBtnTxt.value = "Clear all"
        saveOrUpdateBtnTxt.value = "Save"
    }

    fun saveOrUpdateUser() {
        if (isUpdateOrDelete) {
            //if it exist then update
            userToUpdateOrDelete.user_name = inputeName.value!!
            userToUpdateOrDelete.user_email = inputeEmail.value!!
            updateUser(userToUpdateOrDelete)

        } else {
            //make new entry
            val name = inputeName.value!!
            val email = inputeEmail.value!!

            insertUser(User(0, name, email))

            inputeName.value = null
            inputeEmail.value = null
        }
    }

    fun clearAllOrDeleteAll(){
        if(isUpdateOrDelete){
            deleteUser(userToUpdateOrDelete)
        }else{
            clearAll()
        }
    }



    private fun insertUser(user: User) = viewModelScope.launch {
        repository.insertUser(user)
    }

    private fun deleteUser(user: User) = viewModelScope.launch {
        repository.deleterUser(user)
    }

    private fun clearAll() = viewModelScope.launch {
        repository.deleteAll()
    }

    private fun updateUser(user: User) = viewModelScope.launch {
        repository.updateUser(user)

        //Resetting the fields
        inputeName.value = null
        inputeEmail.value = null
        isUpdateOrDelete = false
        clearAllOrDeleteBtnTxt.value = "Clear all"
        saveOrUpdateBtnTxt.value = "Save"
    }

    fun initUpdateAndDelete(selectedUser: User) {
        inputeName.value = selectedUser.user_name
        inputeEmail.value = selectedUser.user_email
        isUpdateOrDelete = true
        userToUpdateOrDelete = selectedUser
        clearAllOrDeleteBtnTxt.value = "Delete"
        saveOrUpdateBtnTxt.value = "Update"
    }
}