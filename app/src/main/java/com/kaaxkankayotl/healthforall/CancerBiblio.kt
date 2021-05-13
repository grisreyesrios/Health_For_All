package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBiblioBinding


class CancerBiblio : AppCompatActivity() {

    private lateinit var binding: ActivityCancerBiblioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCancerBiblioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = binding.webviewCancerbiblio

        if(myWebView != null) {
            val webSettings = myWebView!!.settings
            webSettings.javaScriptEnabled = true
            myWebView!!.webViewClient = WebViewClient()
            myWebView!!.webChromeClient = WebChromeClient()
            myWebView.loadUrl("https://storage.googleapis.com/healthforall_cancer_biblio/index.html")

        }

        myWebView!!.webViewClient = object: WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                binding.cancerBiblioProgressbar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                binding.cancerBiblioProgressbar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }

    }

    override fun onBackPressed() {
        if(binding.webviewCancerbiblio!!.canGoBack()){
            binding.webviewCancerbiblio.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}