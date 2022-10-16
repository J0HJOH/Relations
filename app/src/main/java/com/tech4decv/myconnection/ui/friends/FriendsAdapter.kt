package com.tech4decv.myconnection.ui.friends

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

class FriendsAdapter(val context : Context, val friendsViewModel: FriendsViewModel): RecyclerView
.Adapter<FriendsViewHolder>() {
    private val listOfFriends : List<Friends> = friendsViewModel.getAllFriends()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsViewHolder {
        val itemView : View = LayoutInflater.from(context).inflate(R.layout.friends_family_layout,
            parent,false)
        return FriendsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
        val friends = listOfFriends[position]
        holder.friendsName.text = friends.name
        holder.friendRelation.text = friends.relationship
        Glide.with(context)
            .load(friends.profile)
            .into(holder.friendsProfile)


    }

    override fun getItemCount(): Int = listOfFriends.size


}

class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val friendsProfile : ImageView = itemView.findViewById(R.id.profile_pics)
    val friendsName : TextView = itemView.findViewById(R.id.name)
    val friendRelation : TextView = itemView.findViewById(R.id.relationship)

}