package com.ritikcoder.project10ofandroidcoursewithsaumyasingh_gradientdesignui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonSignUp: Button= findViewById(R.id.buttonForSignUp)
        val textInputEditTextFirstName: TextInputEditText= findViewById(R.id.textInputEditTextForFirstName)
        val textInputEditTextLastName: TextInputEditText= findViewById(R.id.textInputEditTextForLastName)
        val textViewShowName: TextView= findViewById(R.id.textViewToShowName)

        buttonSignUp.setOnClickListener(){
            val getFirstName= textInputEditTextFirstName.text.toString()+ " "+ textInputEditTextLastName.text.toString()
            textViewShowName.text= getFirstName.toString()
        }

    }
}