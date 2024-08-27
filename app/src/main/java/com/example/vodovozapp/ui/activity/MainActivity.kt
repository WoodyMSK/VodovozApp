package com.example.vodovozapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vodovozapp.databinding.ActivityMainBinding
import com.example.vodovozapp.ui.TovaryFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(androidx.appcompat.R.style.Theme_AppCompat)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
            .also { setContentView(it.root) }

        supportFragmentManager
            .beginTransaction()
            .add(binding.fragmentContainer.id, TovaryFragment())
            .commit()

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}