package com.affan.indopride.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.affan.indopride.databinding.ActivityLandingPageBinding
import com.affan.indopride.view.adapter.LandingViewPagerAdapter
import com.affan.indopride.view.fragment.LoginFragment
import com.affan.indopride.view.fragment.RegisterFragment

class LandingPageActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLandingPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getFragment()
    }

    private fun getFragment () {
        val fragment = arrayListOf(
            LoginFragment(),
            RegisterFragment()
        )

        LandingViewPagerAdapter(fragment,this).also {
            binding.vpLandingPage.adapter = it
        }
    }
}