package com.example.navigationdemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdemo.databinding.FragmentReplaceBinding

class ReplaceFragment : Fragment(R.layout.fragment_replace) {

    private lateinit var binding: FragmentReplaceBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentReplaceBinding.bind(view)

        // Các xử lý và tương tác với giao diện ở đây
    }
    override fun onStop() {
        super.onStop()
        Log.d("Hoang", "onStop:ReplaceFragment ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("hoang", "onPause:ReplaceFragment ")
    }
}
