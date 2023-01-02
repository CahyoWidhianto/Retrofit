package com.example.praktikumretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.praktikumretrofit.Model.User

class UserAdapter(private  val listUser: List<User>)
    : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_user,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listUser[position])
    }

    override fun getItemCount(): Int {
        return listUser.size
    }
    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val tvFristName = view.findViewById<TextView>(R.id.tv_first_name)
        val tvLastName = view.findViewById<TextView>(R.id.tv_last_name)
        val tvEmail = view.findViewById<TextView>(R.id.tv_email)
        val imUser = view.findViewById<ImageView>(R.id.im_user)

        fun bind(user : User){
            tvFristName.text = user.firstName
            tvLastName.text= user.lastName
            tvEmail.text = user.email
            Glide.with(imUser.context).load(user.avatar).into(imUser)
        }
    }


}