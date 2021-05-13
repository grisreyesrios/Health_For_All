package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdBiblioBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityOsteoBiblioBinding

class osteo_biblio : AppCompatActivity() {

    private lateinit var binding: ActivityOsteoBiblioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOsteoBiblioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = binding.webviewOsteobiblio

        if(myWebView != null) {

            val webSettings = myWebView!!.settings
            webSettings.javaScriptEnabled = true
            myWebView!!.webViewClient = WebViewClient()
            myWebView!!.webChromeClient = WebChromeClient()
            myWebView.loadUrl("https://storage.googleapis.com/healthforall_osteo_biblio/index.html")
        }

        myWebView!!.webViewClient = object: WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                binding.osteoBiblioProgressbar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                binding.osteoBiblioProgressbar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }

    }

    override fun onBackPressed() {
        if(binding.webviewOsteobiblio!!.canGoBack()){
            binding.webviewOsteobiblio.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}