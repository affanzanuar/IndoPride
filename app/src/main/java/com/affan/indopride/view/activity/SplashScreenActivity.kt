package com.affan.indopride.view.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.affan.indopride.R
import com.affan.indopride.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        binding.ivSplash1.startAnimation(topAnimation)
        binding.ivSplash2.startAnimation(bottomAnimation)

        binding.ivSplashDummy.alpha = 0f
        binding.ivSplashDummy.animate().setDuration(2700).alpha(1f).withEndAction{
            Intent(this, LandingPageActivity::class.java).also {
                startActivity(it)
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}