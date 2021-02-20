package com.kaaxkankayotl.healthforall


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


import com.kaaxkankayotl.healthforall.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.buttonsignup.setOnClickListener {
            if (binding.userET.text.toString().isEmpty() || binding.passET.text.toString()
                            .isEmpty()){
                binding.textviewresponse.text = "Email Address or Password is not provided"
                    } else {
                auth.createUserWithEmailAndPassword(
                        binding.userET.text.toString(),
                        binding.passET.text.toString())
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                binding.textviewresponse.text =
                                        "Sign Up successfully. You are registered"
                                val user = auth.currentUser
                                updateUI(user)
                            } else {
                                binding.textviewresponse.text = "You are already register or Sign Up failed"
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
    }
}