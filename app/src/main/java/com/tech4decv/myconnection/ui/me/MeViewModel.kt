package com.tech4decv.myconnection.ui.me

import androidx.lifecycle.ViewModel
import com.tech4decv.myconnection.data.model.Friends
import com.tech4decv.myconnection.data.repository.MyRepository

class MeViewModel : ViewModel() {
    private val myRepository = MyRepository()
    private val me = myRepository.getMyInfo()

    fun getMe(): Friends{
        return me
    }
}