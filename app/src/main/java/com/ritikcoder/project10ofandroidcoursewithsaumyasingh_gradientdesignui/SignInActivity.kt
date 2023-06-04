package com.ritikcoder.project10ofandroidcoursewithsaumyasingh_gradientdesignui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val linearLayoutOpenSignUpActivity: LinearLayout= findViewById(R.id.linearLayoutToOpenSignUpActivity)

        linearLayoutOpenSignUpActivity.setOnClickListener(){
            val intent= Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}