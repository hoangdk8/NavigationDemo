package com.example.navigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.navigationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Tìm NavController bằng cách sử dụng fragment_navigation làm host
        navController = Navigation.findNavController(this, R.id.fragment_navigation)

        // Xác định các fragment gốc không có nút Up (Back) trên ActionBar
        appBarConfiguration = AppBarConfiguration(navController.graph)

        // Đặt ActionBar bằng Toolbar trong layout
        setSupportActionBar(binding.toolbar)

        // Thiết lập ActionBar để sử dụng với NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)

        binding.buttonAdd.setOnClickListener {
            val action = DetailFragmentDirections.addNewFragment()
            navController.navigate(action)
        }
        binding.buttonReplace.setOnClickListener {
            val action = HomeFragmentDirections.actionReplaceFragment()
            navController.navigate(action)
        }
    }

    // Xử lý sự kiện khi người dùng nhấn nút Up (Back) trên ActionBar
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }

}