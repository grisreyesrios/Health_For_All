package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityForgetpasswordBinding

class forgetpassword : AppCompatActivity() {

    private lateinit var binding: ActivityForgetpasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgetpasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}