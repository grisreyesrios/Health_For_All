package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdBiblioBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdlistBinding

class cvd_biblio : AppCompatActivity() {

    private lateinit var binding: ActivityCvdBiblioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCvdBiblioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = binding.webviewCvdbiblio

        if(myWebView != null) {

            val webSettings = myWebView!!.settings
            webSettings.javaScriptEnabled = true
            myWebView!!.webViewClient = WebViewClient()
            myWebView!!.webChromeClient = WebChromeClient()

            myWebView.loadUrl("https://storage.googleapis.com/healthforall_cvd_biblio/index.html")
        }

        myWebView!!.webViewClient = object: WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                binding.cvdBiblioProgressbar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                binding.cvdBiblioProgressbar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }

    }

    override fun onBackPressed() {
        if(binding.webviewCvdbiblio!!.canGoBack()){
            binding.webviewCvdbiblio.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}