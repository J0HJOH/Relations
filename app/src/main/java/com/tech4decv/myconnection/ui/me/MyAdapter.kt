package com.tech4decv.myconnection.ui.me

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tech4decv.myconnection.R
import com.tech4decv.myconnection.data.model.Friends

class MyAdapter(val context: Context, val myViewModel: MeViewModel):RecyclerView
.Adapter<MyViewHolder>() {
    private val me : Friends = myViewModel.getMe()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.my_layout,parent,false)
        return  MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myName.text = me.name
        holder.myRelation.text = me.relationship
        Glide.with(context)
            .load(me.profile)
            .into(holder.myProfile)

    }

    override fun getItemCount(): Int {
        return 1
    }

}

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val myProfile : ImageView = itemView.findViewById(R.id.my_profile)
    val myName : TextView = itemView.findViewById(R.id.my_name)
    val myRelation : TextView = itemView.findViewById(R.id.my_account)
}