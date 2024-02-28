package com.example.contentmanagerapp.room

class UserRepository(private val dao: UserDAO) {

    val user = dao.getAllUsersInDB()

    suspend fun insertUser(user: User): Long{
        return dao.insertUser(user)
    }

    suspend fun deleterUser(user: User){
        return dao.deleteUser(user)
    }

    suspend fun updateUser(user: User){
        return dao.updateUser(user)
    }

    suspend fun deleteAll(){
        return dao.deleteAll()
    }
}