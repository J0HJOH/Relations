package com.tech4decv.myconnection.data.database

import com.tech4decv.myconnection.R
import com.tech4decv.myconnection.data.model.Friends

class FamilyDataSource  {
    val LIST_OF_FAMILY : List<Friends> =  listOf(
        Friends(R.drawable.ic_baseline_account_circle_24,"Mr. Okereke", "Father"),
        Friends(R.drawable.ic_outline_emoji_emotions_24,"Mrs Okereke","Mother"),
        Friends(R.drawable.avatar_man2,"Austine Okereke", "Brother"),
        Friends(R.drawable.avatar_man4, "Emmanuel Okereke","Brother"),
        Friends(R.drawable.avatar_girl, "Victoria Okereke", "Sister"),
        Friends(R.drawable.avatar_man4,"Victor Okereke","Brother"),
    )


}
class FriendsDataSource {
    val LIST_OF_FRIENDS : List<Friends> = listOf(
        Friends(R.drawable.avatar_girl, "Ama Blessing", "Bestie"),
        Friends(R.drawable.ic_outline_emoji_emotions_24,"Amara Vincent","Bestie"),
        Friends(R.drawable.avatar_girl, "Faustina Ubaka","Betsie"),
        Friends(R.drawable.ic_baseline_account_circle_24,"Esther Nwachuckwu","CourseRep"),
    )

}

class MyDataSource {
    val ME : Friends = (
            Friends(R.drawable.avatar_girl, "Joan Okereke","Owner")
            )
}