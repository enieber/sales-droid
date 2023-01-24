package com.fastthink.sales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.fastthink.sales.databinding.FragmentMainBinding
import com.fastthink.sales.home.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

class MainFragment : FragmentActivity() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.main_container, HomeFragment()
            ).commit()
        }
    }
}