package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.livedata.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    lateinit var binding: ActivityMainBinding
    lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dexOutputDir: File = codeCacheDir
        dexOutputDir.setReadOnly()

        //binding object
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //viewmodelfactory object
        factory = MainActivityViewModelFactory(1234)

        //viewmodel object
        viewModel = ViewModelProvider(this, factory)[MainActivityViewModel::class.java]
        init()
    }

    private fun init() {
//        binding.apply {
//            binding.increasedText.text = viewModel.getCurrentCount().toString()
//            btnIncrease.setOnClickListener{
//                binding.increasedText.text = viewModel.getCurrentCount().toString()
//                viewModel.updateCount()
//            }
//        }

        binding.lifecycleOwner = this
        binding.myViewModel = viewModel
//        viewModel.counter.observe(this, Observer {
//            binding.increasedText.text = it.toString()
//        })
    }
}