package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityMainBinding

class activity_cancer : AppCompatActivity() {

    private lateinit var binding: ActivityCancerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCancerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancerlist.setOnItemClickListener { parent, view, position, id ->  }


    }
}