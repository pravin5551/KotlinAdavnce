package com.example.practiceprojects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val vaccinesList: ArrayList<VaccineModel>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()  {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var vaccineImage: ImageView
        var vaccinetitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.IvImage)
            vaccinetitle = itemView.findViewById(R.id.TvTitle)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context, "You choose : ${vaccinesList[adapterPosition].title}", Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val myViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_layout,parent,false)
        return MyViewHolder(myViewHolder)
    }

    override fun getItemCount(): Int {
        return vaccinesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

            holder.vaccinetitle.text = vaccinesList[position].title
            holder.vaccineImage.setImageResource(vaccinesList[position].image)
    }
}