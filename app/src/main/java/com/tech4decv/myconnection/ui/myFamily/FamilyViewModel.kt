package com.tech4decv.myconnection.ui.myFamily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tech4decv.myconnection.data.model.Friends
import com.tech4decv.myconnection.data.repository.FamilyRepository

class FamilyViewModel : ViewModel() {
    private  val familyRepository = FamilyRepository()
    private  val familyMember: List<Friends> = familyRepository.getFamilyInfo()

   fun getFamily(): List<Friends>{
        return familyMember
   }
}