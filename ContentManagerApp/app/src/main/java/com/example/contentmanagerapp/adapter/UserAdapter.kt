package com.example.contentmanagerapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.contentmanagerapp.R
import com.example.contentmanagerapp.databinding.ItemLayoutBinding
import com.example.contentmanagerapp.room.User

class UserAdapter(private val userList: List<User>, private val onClickListener: (User)-> Unit) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(user: User, onClickListener: (User) -> Unit){
            binding.txtEmail.text = user.user_email
            binding.txtName.text = user.user_name
            binding.constrainLayout.setOnClickListener {
                onClickListener(user)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.item_layout, parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userList[position],onClickListener )
    }
}