package com.kaaxkankayotl.healthforall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                binding.textviewresponse2.text = "Email Address or Password is not provided"
            } else {
                auth.signInWithEmailAndPassword(binding.userETSign.text.toString(), binding.passETSign.text.toString())
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            updateUI(user, binding.userETSign.text.toString() )
                        } else {
                            binding.textviewresponse2.text = "Invalid Email or Password"
                        }
                    }
            }
        }
    }

    private fun updateUI(currentUser: FirebaseUser?, emailAdd: String) {
    if(currentUser !=null){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("emailAddress", emailAdd);
        startActivity(intent)
        finish()
    }
    }
}