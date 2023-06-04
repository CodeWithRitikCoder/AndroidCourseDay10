package com.ritikcoder.project10ofandroidcoursewithsaumyasingh_gradientdesignui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            intent= Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)

    }
}