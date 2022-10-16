package com.tech4decv.myconnection.data.repository

import com.tech4decv.myconnection.data.database.MyDataSource
import com.tech4decv.myconnection.data.model.Friends

class MyRepository {

    fun getMyInfo(): Friends{
        val myDataSource = MyDataSource()
        return myDataSource.ME
    }
}