package com.tech4decv.myconnection.ui.myFamily

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tech4decv.myconnection.databinding.FragmentMyFamilyBinding
import com.tech4decv.myconnection.databinding.FragmentMyFriendsBinding

class FamilyFragment : Fragment() {

    private lateinit var binding: FragmentMyFamilyBinding
    private lateinit var familyViewModel : FamilyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        familyViewModel = ViewModelProvider(this).get(FamilyViewModel::class.java)

        binding = FragmentMyFamilyBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.familyNames.layoutManager = LinearLayoutManager(requireContext())
        binding.familyNames.adapter = FamilyAdapter(requireContext(), familyViewModel)

        val dividerItemDecoration = DividerItemDecoration(requireContext(), RecyclerView.HORIZONTAL)
        binding.familyNames.addItemDecoration(dividerItemDecoration)

    }
}