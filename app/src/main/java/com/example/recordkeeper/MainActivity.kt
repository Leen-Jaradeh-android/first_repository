package com.example.recordkeeper

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.recordkeeper.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
//import kotlinx.android.synthetic.main.acticty_different_screen.*
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    for the bind and id
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        for the cycling button
        binding.buttonCycling.setOnClickListener{
            onCyclingClicked()
        }
//        for the running button
        binding.buttonRunning.setOnClickListener{
            onRunningClicked()
        }
    }
// for the running button
    private fun onRunningClicked() {
    supportFragmentManager.commit {
        replace(R.id.fram_content,RunningFragment())
    }
    }
// for the cycling button
    private fun onCyclingClicked() {
    supportFragmentManager.commit {
        replace(R.id.fram_content,CyclingFragment())
    }
    }
}


