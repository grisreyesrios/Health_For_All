package com.kaaxkankayotl.healthforall

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding


class activity_cancer : AppCompatActivity() {

    private lateinit var binding: ActivityCancerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCancerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancerlist.setOnItemClickListener { parent, view, position, id ->

            if(position == 0){



            }

        }


    }
}