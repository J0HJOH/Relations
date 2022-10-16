package com.tech4decv.myconnection.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.tech4decv.myconnection.databinding.FragmentMeBinding

class MeFragment : Fragment() {

    private lateinit var binding: FragmentMeBinding
    private lateinit var meViewModel : MeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        meViewModel = ViewModelProvider(this).get(MeViewModel::class.java)

        binding = FragmentMeBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.myRv.layoutManager = GridLayoutManager(requireContext(),1)
        binding.myRv.adapter = MyAdapter(requireContext(),meViewModel)

    }


}