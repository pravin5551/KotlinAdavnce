package com.example.practiceprojects

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dexOutputDir: File = codeCacheDir
        dexOutputDir.setReadOnly()



        //1- create instances
        recyclerView = findViewById(R.id.RvVaccines)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        //2- creating the list
        var vaccineList: ArrayList<VaccineModel> = ArrayList()
        val v1 = VaccineModel(R.drawable.ic_launcher_foreground, "First Vaccine")
        val v2 = VaccineModel(R.drawable.ic_launcher_foreground, "Second Vacine")
        val v3 = VaccineModel(R.drawable.ic_launcher_foreground, "Third Vacine")
        val v4 = VaccineModel(R.drawable.ic_launcher_foreground, "Fourth Vacine")
        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)


        //3- adapter
        adapter = MyAdapter(vaccineList)
        recyclerView.adapter = adapter

    }


}