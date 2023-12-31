package com.roman_tsisyk.youtube.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.roman_tsisyk.youtube.ui.video_list.VideoListActivity
import com.roman_tsisyk.youtube.ui.video_list.VideoListViewModel

class SplashActivity : Activity() {

    private lateinit var viewModel: VideoListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        startActivity(Intent(this, VideoListActivity::class.java))
        finish()
    }
}
