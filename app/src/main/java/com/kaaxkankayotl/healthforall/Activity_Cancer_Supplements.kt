package com.kaaxkankayotl.healthforall

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerSupplementsBinding

class Activity_Cancer_Supplements : AppCompatActivity() {

    private lateinit var binding: ActivityCancerSupplementsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCancerSupplementsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var TempHolder: String? = intent.getStringExtra("ListViewClickedValue")

        val myWebView: WebView = binding.webviewcancersuplements
        if (TempHolder == "0"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/flaxseeds/index.html")
        }
        if (TempHolder == "1"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/greentea/index.html")
        }




    }

}





