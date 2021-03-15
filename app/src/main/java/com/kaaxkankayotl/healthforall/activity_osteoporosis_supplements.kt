package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.kaaxkankayotl.healthforall.databinding.ActivityOsteoporosisBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityOsteoporosisSupplementsBinding

class activity_osteoporosis_supplements : AppCompatActivity() {

    private lateinit var binding: ActivityOsteoporosisSupplementsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOsteoporosisSupplementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var TempHolder: String? = intent.getStringExtra("ListViewClickedValue")

        val WebView: WebView = binding.webviewosteosupplements

        if (TempHolder == "0"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/vitamink/index.html")
        }
        if (TempHolder == "1"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/magnesium/index.html")
        }
        if (TempHolder == "2"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/elp/index.html")
        }
        if (TempHolder == "3"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/calcium/index.html")
        }
        if (TempHolder == "4"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/vitamind/index.html")
        }
        if (TempHolder == "5"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/boron/index.html")
        }
        if (TempHolder == "6"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/potassium/index.html")
        }
        if (TempHolder == "7"){
            WebView.loadUrl("https://storage.googleapis.com/healthforall_osteoporosis/glucosamine/index.html")
        }


    }
}