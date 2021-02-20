package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdlistBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityMainBinding

class cvdlist : AppCompatActivity() {

    private lateinit var binding: ActivityCvdlistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCvdlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}