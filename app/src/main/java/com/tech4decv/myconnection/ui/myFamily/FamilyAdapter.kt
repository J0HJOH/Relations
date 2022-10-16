package com.tech4decv.myconnection.ui.myFamily

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

class FamilyAdapter(val context: Context, val familyViewModel: FamilyViewModel):
RecyclerView.Adapter<FamilyViewHolder>(){
    private val listOfFamily : List<Friends> = familyViewModel.getFamily()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamilyViewHolder {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.friends_family_layout,
        parent,false)
        return FamilyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: FamilyViewHolder, position: Int) {
        val friends = listOfFamily[position]
        holder.familyName.text = friends.name
        holder.familyRelation.text = friends.relationship
        Glide.with(context)
            .load(friends.profile)
            .into(holder.familyProfile)

    }

    override fun getItemCount(): Int {
        return listOfFamily.size
    }

}

class FamilyViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
    val familyName: TextView = itemView.findViewById(R.id.name)
    val familyRelation : TextView = itemView.findViewById(R.id.relationship)
    val familyProfile : ImageView = itemView.findViewById(R.id.profile_pics)
}