package com.kaaxkankayotl.healthforall

import android.R
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
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


            if (position == 0){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

            if (position == 1){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

            if (position == 2){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

            if (position == 3){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 4){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 5){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 6){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 7){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, Activity_Cancer_Supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

        }


    }

}