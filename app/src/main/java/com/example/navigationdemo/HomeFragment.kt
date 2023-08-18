package com.example.navigationdemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.sendButton.setOnClickListener {

            val name = binding.editTextName.text.toString()
            val age = binding.editTextAge.text.toString().toInt()
            val dataObject = DataObject(name, age)

            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragmentWithData(
                name,age,dataObject
            )
            findNavController().navigate(action)
        }
    }


    override fun onStop() {
        super.onStop()
        Log.d("Hoang", "onStop:HomeFragment ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("hoang", "onPause:HomeFragment ")
    }
}