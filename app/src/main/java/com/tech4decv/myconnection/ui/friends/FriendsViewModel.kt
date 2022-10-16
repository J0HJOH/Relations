package com.tech4decv.myconnection.ui.friends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tech4decv.myconnection.data.model.Friends
import com.tech4decv.myconnection.data.repository.FriendsRepository

class FriendsViewModel : ViewModel() {
    private val friendsRepository = FriendsRepository()
    private val friends : List<Friends> = friendsRepository.getFriendsInfo()

    fun getAllFriends(): List<Friends>{
        return friends
    }
}