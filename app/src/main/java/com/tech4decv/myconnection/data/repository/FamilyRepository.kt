package com.tech4decv.myconnection.data.repository

import com.tech4decv.myconnection.data.model.Friends
import com.tech4decv.myconnection.data.database.FamilyDataSource

class FamilyRepository {

    fun getFamilyInfo(): List<Friends>{
        val familyDataSource = FamilyDataSource()
        return familyDataSource.LIST_OF_FAMILY
    }
}