package com.kaaxkankayotl.healthforall


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


import com.kaaxkankayotl.healthforall.databinding.ActivityLoginBinding
import android.widget.Toast.makeText as widgetToastMakeText


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        auth = Firebase.auth

        binding.buttonsignup.setOnClickListener {
            if (binding.userET.text.toString().isEmpty() || binding.passET.text.toString()
                            .isEmpty()){
                val toast = Toast.makeText(applicationContext, "Email Address or Password is not provided",
                    Toast.LENGTH_SHORT)
                toast.show()
            } else {
                auth.createUserWithEmailAndPassword(
                        binding.userET.text.toString(),
                        binding.passET.text.toString())
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                val toast = Toast.makeText(applicationContext, "Sign Up successfully. You are registered",
                                    Toast.LENGTH_SHORT)
                                toast.show()
                                val user = auth.currentUser
                                updateUI(user)
                            } else {
                                val toast = Toast.makeText(applicationContext, "Sign Up successfully. You are already register or",
                                    Toast.LENGTH_SHORT)
                                toast.show()
                                updateUI(null)
                            }
                        }
            }
        }

        binding.alreadyRegistered.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
            finish()
        }



    }

    private fun updateUI(currentUser: FirebaseUser?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}