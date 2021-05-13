package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityNeurodegenerativeBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityNeurodegenerativeSuplementsBinding

class activity_neurodegenerative_suplements : AppCompatActivity() {

    private lateinit var binding: ActivityNeurodegenerativeSuplementsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNeurodegenerativeSuplementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var TempHolder: String? = intent.getStringExtra("ListViewClickedValue")

        val myWebView: WebView = binding.webviewneurosupplements

        if(myWebView != null) {

            val webSettings = myWebView!!.settings
            webSettings.javaScriptEnabled = true
            myWebView!!.webViewClient = WebViewClient()
            myWebView!!.webChromeClient = WebChromeClient()

            if (TempHolder == "0") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/cocoa/index.html")
            }

            if (TempHolder == "1") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/curcumin/index.html")
            }

            if (TempHolder == "2") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/greentea/index.html")
            }

            if (TempHolder == "3") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/vitamind3/index.html")
            }

            if (TempHolder == "4") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/omega3s/index.html")
            }

            if (TempHolder == "5") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/caffeine/index.html")
            }

            if (TempHolder == "6") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/apigenin/index.html")
            }

            if (TempHolder == "7") {
                myWebView.loadUrl("https://storage.googleapis.com/healthforall_neurodegenerative/dashdiet/index.html")
            }

            myWebView!!.webViewClient = object: WebViewClient(){
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    binding.neuroSupplementsProgressbar.visibility = View.VISIBLE
                    super.onPageStarted(view, url, favicon)
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    binding.neuroSupplementsProgressbar.visibility = View.GONE
                    super.onPageFinished(view, url)
                }
            }
        }

    }

    override fun onBackPressed() {
        if(binding.webviewneurosupplements!!.canGoBack()){
            binding.webviewneurosupplements.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}