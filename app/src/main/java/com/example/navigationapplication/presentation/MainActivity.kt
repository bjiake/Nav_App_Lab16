package com.example.navigationapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Работает только в xml lorem
        //аннотация tools Только в xml

        toolbarInit()
        bottomNavigationInit()
    }

    private fun toolbarInit() {
        val toolbar: Toolbar = findViewById(R.id.tbMain)
        setSupportActionBar(toolbar)
    }

    private fun bottomNavigationInit() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcMain) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bnMenu).setupWithNavController(
            navController
        )
    }
}