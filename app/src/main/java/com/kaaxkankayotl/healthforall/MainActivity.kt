package com.kaaxkankayotl.healthforall

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    private var titleslist = mutableListOf<String>()
    private var imageslist = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = DiseaseAdapter(titleslist, imageslist)

        initRecyclerView()
        postList()


    }


    private fun addtoList(title: String, image: Int){

        titleslist.add(title)
        imageslist.add(image)
    }

    private fun postList(){
        addtoList("Cancer", R.drawable.disease_cancer)
        addtoList("Type 2 Diabetes", R.drawable.disease_diabetestype2)
        addtoList(" Cardiovascular diseases", R.drawable.disease_cvd)
        addtoList("Osteoporosis", R.drawable.disease_osteoporosis)
        addtoList("Neurodegenerative diseases", R.drawable.disease_mentaldiseases)

    }

    private fun initRecyclerView(){
        binding.recycler.apply {
            val topSpacingItemDecoration = TopSpacingItemDecoration(padding = 30)
            addItemDecoration(topSpacingItemDecoration)
        }
    }
}

