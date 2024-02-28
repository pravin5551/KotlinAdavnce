package com.example.contentmanagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contentmanagerapp.adapter.UserAdapter
import com.example.contentmanagerapp.databinding.ActivityMainBinding
import com.example.contentmanagerapp.room.User
import com.example.contentmanagerapp.room.UserDataBase
import com.example.contentmanagerapp.room.UserRepository
import com.example.contentmanagerapp.viewmodel.UserViewModel
import com.example.contentmanagerapp.viewmodel.ViewModelFactory
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var adapter: UserAdapter
    lateinit var binding: ActivityMainBinding
    lateinit var factory: ViewModelFactory
    lateinit var viewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dexOutputDir: File = codeCacheDir
        dexOutputDir.setReadOnly()
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Room database
        val dao = UserDataBase.getInstance(this).userDao
        val repository = UserRepository(dao)

        factory = ViewModelFactory(repository)

        viewModel = ViewModelProvider(this, factory)[UserViewModel::class.java]
        binding.userVM = viewModel
        binding.lifecycleOwner = this


        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        displayUserList()
    }

    private fun displayUserList() {
        viewModel.user.observe(this, Observer {
            binding.recyclerView.adapter = UserAdapter(it, {selectedUser: User-> listItemClicked(selectedUser)})

        })
    }

    private fun listItemClicked(selectedUser: User) {
        Toast.makeText(this, "This is ${selectedUser.user_name}",Toast.LENGTH_LONG ).show()

        viewModel.initUpdateAndDelete(selectedUser)
    }


}