package com.example.navigationdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.databinding.FragmentDetailBinding


class DetailFragment : Fragment(R.layout.fragment_detail) {

    private lateinit var binding: FragmentDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailBinding.bind(view)


        // Lấy dữ liệu nhận được từ HomeFragment thông qua argument
        val receivedData = arguments?.getString("receivedData")
        val receivedIntData = arguments?.getInt("intData", 0)
        val receivedStringData = arguments?.getString("stringData", "")
        val receivedObjectData = arguments?.getParcelable<DataObject>("objectData")
        binding.receivedDataTextView.text =
            " $receivedIntData\n" + " $receivedStringData\n" + " ${receivedObjectData?.name}, ${receivedObjectData?.age}"
        binding.buttonReplace.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentToReplaceFragment()
            findNavController().navigate(action)
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("Hoang", "onStop:DetailFragment ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("hoang", "onPause:DetailFragment ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("hoang", "onPause:DetailFragment ")
    }
}