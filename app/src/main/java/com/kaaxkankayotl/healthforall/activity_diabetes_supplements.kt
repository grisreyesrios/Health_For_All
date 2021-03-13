package com.kaaxkankayotl.healthforall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerSupplementsBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityDiabetesSupplementsBinding

class activity_diabetes_supplements : AppCompatActivity() {

    private lateinit var binding: ActivityDiabetesSupplementsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiabetesSupplementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var TempHolder: String? = intent.getStringExtra("ListViewClickedValue")

        val myWebView: WebView = binding.webviewdiabetessupplements
        if (TempHolder == "0"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/fenugreek/index.html")
        }

        if (TempHolder == "1"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/magnesium/index.html")
        }

        if (TempHolder == "2"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/zn/index.html")
        }

        if (TempHolder == "3"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/resveratol/index.html")
        }

        if (TempHolder == "4"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/carnitine/index.html")
        }

        if (TempHolder == "5"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/greentea/index.html")
        }

        if (TempHolder == "6"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/cga/index.html")
        }

        if (TempHolder == "7"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/cinammon/index.html")
        }

        if (TempHolder == "8"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/vitamind/index.html")
        }

        if (TempHolder == "9"){
            myWebView.loadUrl("https://diabetessupplements.s3.us-east-2.amazonaws.com/panax/index.html")
        }



    }
}