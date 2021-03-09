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

        if (TempHolder == "2"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/garlic/index.html")
        }
        if (TempHolder == "3"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/selenium/index.html")
        }
        if (TempHolder == "4"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/ginger/index.html")
        }
        if (TempHolder == "5"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/turmeric/index.html")
        }
        if (TempHolder == "6"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/vitamind3/index.html")
        }
        if (TempHolder == "7"){
            myWebView.loadUrl("https://cancersuplemments.s3.us-east-2.amazonaws.com/panax_ginseg/index.html")
        }

    }

}





