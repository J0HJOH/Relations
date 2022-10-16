package com.tech4decv.myconnection.ui.friends

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
import com.tech4decv.myconnection.databinding.FragmentMyFriendsBinding

class FriendsFragment : Fragment() {

    private lateinit var binding: FragmentMyFriendsBinding
    private lateinit var friendsViewModel : FriendsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         friendsViewModel = ViewModelProvider(this).get(FriendsViewModel::class.java)

        binding = FragmentMyFriendsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.friendsNames.layoutManager = LinearLayoutManager(requireContext())
        binding.friendsNames.adapter = FriendsAdapter(requireContext(),friendsViewModel)

        val dividerItemDecoration = DividerItemDecoration(requireContext(),RecyclerView.HORIZONTAL)
        binding.friendsNames.addItemDecoration(dividerItemDecoration)
    }


}