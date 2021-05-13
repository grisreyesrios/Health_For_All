package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityCancerBiblioBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityNeuroBiblioBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityNeurodegenerativeBinding

class neuro_biblio : AppCompatActivity() {

    private lateinit var binding: ActivityNeuroBiblioBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityNeuroBiblioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = binding.webviewNeurobiblio

        if(myWebView != null) {

            val webSettings = myWebView!!.settings
            webSettings.javaScriptEnabled = true
            myWebView!!.webViewClient = WebViewClient()
            myWebView!!.webChromeClient = WebChromeClient()

            myWebView.loadUrl("https://storage.googleapis.com/healthforall_neuro_biblio/index.html")

        }

        myWebView!!.webViewClient = object: WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                binding.neuroBiblioProgressbar.visibility = View.VISIBLE
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                binding.neuroBiblioProgressbar.visibility = View.GONE
                super.onPageFinished(view, url)
            }
        }

    }

    override fun onBackPressed() {
        if(binding.webviewNeurobiblio!!.canGoBack()){
            binding.webviewNeurobiblio.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}