package com.kaaxkankayotl.healthforall

import android.content.Intent
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

        binding.cvdlist.setOnItemClickListener { parent, view, position, id ->

            if (position == 0){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

            if (position == 1){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 2){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 3){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 4){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 5){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 6){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 7){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 8){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_cvd_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
        }

        binding.textviewcvdBiblio.setOnClickListener {
            val intent = Intent(this, cvd_biblio::class.java)
            startActivity(intent)
            finish()
        }

    }
}