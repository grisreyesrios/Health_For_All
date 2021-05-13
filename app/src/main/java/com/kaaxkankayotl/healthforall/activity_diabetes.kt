package com.kaaxkankayotl.healthforall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityDiabetesBinding

class activity_diabetes : AppCompatActivity() {

    private lateinit var binding: ActivityDiabetesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiabetesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.diabeteslist.setOnItemClickListener { parent, view, position, id ->


            if (position == 0){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }

            if (position == 1){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 2){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 3){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 4){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 5){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 6){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 7){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 8){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
            if (position == 9){
                val templistviewclickedvalue: String = position.toString()
                val intent = Intent(view.context, activity_diabetes_supplements::class.java)
                intent.putExtra("ListViewClickedValue", templistviewclickedvalue)
                view.context.startActivity(intent)
            }
        }

        binding.textviewDiabetesBiblio.setOnClickListener {
            val intent = Intent(this, diabetes_biblio::class.java)
            startActivity(intent)
            finish()
        }
    }

}