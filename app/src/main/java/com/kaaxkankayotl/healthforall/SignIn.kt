package com.kaaxkankayotl.healthforall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kaaxkankayotl.healthforall.databinding.ActivityLoginBinding
import com.kaaxkankayotl.healthforall.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.alreadySignup.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

        binding.buttonsignin.setOnClickListener {
            if (binding.userETSign.text.toString().isNullOrEmpty() || binding.passETSign.text.toString().isNullOrEmpty()) {
                val toast = Toast.makeText(applicationContext, "Email Address or Password is not provided",
                    Toast.LENGTH_SHORT)
                toast.show()
            } else {
                auth.signInWithEmailAndPassword(binding.userETSign.text.toString(), binding.passETSign.text.toString())
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            updateUI(user, binding.userETSign.text.toString() )
                        } else {
                            val toast = Toast.makeText(applicationContext, "Invalid Email or Password",
                                Toast.LENGTH_SHORT)
                            toast.show()
                        }
                    }
            }
        }
    }

    private fun updateUI(currentUser: FirebaseUser?, emailAdd: String) {
    if(currentUser !=null){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    }
}