package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityForgetpasswordBinding

class forgetpassword : AppCompatActivity() {

    private lateinit var binding: ActivityForgetpasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgetpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonforgetpassword.setOnClickListener {
            val email: String = binding.newpassETSign.text.toString().trim {it <= ' '}
            if(email.isEmpty()){
                Toast.makeText(
                    this@forgetpassword,
                    "Please enter Email adress",
                    Toast.LENGTH_SHORT

                ).show()
            }else{
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if(task.isSuccessful){
                            Toast.makeText(
                                this@forgetpassword,
                                "Email sent succesfully to reset your password!!",
                                Toast.LENGTH_LONG
                            ).show()

                            finish()
                        }else{
                            Toast.makeText(
                                this@forgetpassword,
                                task.exception!!.message.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
            }
        }
    }
}