package com.tech4decv.myconnection.data.repository

import com.tech4decv.myconnection.data.database.FriendsDataSource
import com.tech4decv.myconnection.data.model.Friends

class FriendsRepository {

    fun getFriendsInfo() : List<Friends>{
        val friendsDataSource = FriendsDataSource()
        return  friendsDataSource.LIST_OF_FRIENDS
    }
}