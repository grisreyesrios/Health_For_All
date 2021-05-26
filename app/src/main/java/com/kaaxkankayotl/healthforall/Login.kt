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
import androidx.core.util.PatternsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


import com.kaaxkankayotl.healthforall.databinding.ActivityLoginBinding
import java.util.regex.Pattern
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

        binding.alreadyRegistered.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
            finish()
        }


        binding.buttonsignup.setOnClickListener {
            validate()
           // auth.createUserWithEmailAndPassword(
                //binding.userET.text.toString(),
                //binding.passET.text.toString())
                //.addOnCompleteListener(this) { task ->
                    //if (task.isSuccessful) {
                        //val toast = Toast.makeText(applicationContext, "Sign Up successfully. You are registered",
                            //Toast.LENGTH_SHORT)
                        //toast.show()
                        //val user = auth.currentUser
                        //updateUI(user)
                    //} else {
                        //val toast = Toast.makeText(applicationContext, "You are already register or there was a problem",
                            //Toast.LENGTH_SHORT)
                        //toast.show()
                        //updateUI(null)
                         //   }
                        //}
            }
        }
    private fun validate(){
        val result = arrayOf(validateEmail(), validatePassword())

        if (false in result){
            return
        }else{
            auth.createUserWithEmailAndPassword(
                binding.userET.text.toString(),
                binding.passET.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        updateUI(user)
                    } else {
                        val toast = Toast.makeText(
                            applicationContext, "You are already register or there was a problem",
                            Toast.LENGTH_SHORT
                        )
                        toast.show()
                        updateUI(null)
                    }
                }

        }

        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
    }

    private fun validateEmail():Boolean {
        val email = binding.userET.editableText.toString()

        return if(email.isEmpty()){
            binding.userET.error = "Field cannot be empty"
            false
        } else if (!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()){
            binding.userET.error = "Field cannot be empty"
            false
        }else{
            binding.userET.error = null
            true
        }
    }

    private fun validatePassword(): Boolean {
        val password = binding.passET.editableText.toString()
        val passwordRegex = Pattern.compile(
            "^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{6,}" +               //at least 4 characters
                    "$")

        return if(password.isEmpty()){
            binding.passET.error = "Field cannot be empty"
            false
        } else if(!passwordRegex.matcher(password).matches()){
            binding.passET.error = "Password is too weak!"
            false
        }else{
            binding.passET.error = null
            true
        }
    }


    private fun updateUI(currentUser: FirebaseUser?) {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
    }



