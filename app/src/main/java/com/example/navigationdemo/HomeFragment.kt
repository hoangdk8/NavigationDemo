package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.sendButton.setOnClickListener {
            val dataToSend = binding.dataToSendEditText.text.toString()
            // Tạo action để chuyển từ HomeFragment sang DetailFragment
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(dataToSend)
            // Sử dụng NavController để điều hướng đến DetailFragment với dữ liệu
            findNavController().navigate(action)
        }
    }
}