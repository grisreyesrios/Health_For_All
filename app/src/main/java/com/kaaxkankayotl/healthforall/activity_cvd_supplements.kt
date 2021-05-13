package com.kaaxkankayotl.healthforall

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdSupplementsBinding
import com.kaaxkankayotl.healthforall.databinding.ActivityCvdlistBinding

class activity_cvd_supplements : AppCompatActivity() {

    private lateinit var binding: ActivityCvdSupplementsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCvdSupplementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var TempHolder: String? = intent.getStringExtra("ListViewClickedValue")

        val WebView: WebView = binding.webviewcvdsuplements

        if(WebView != null) {

            val webSettings = WebView!!.settings
            webSettings.javaScriptEnabled = true
            WebView!!.webViewClient = WebViewClient()
            WebView!!.webChromeClient = WebChromeClient()

            if (TempHolder == "0") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/nitrates/index.html")
            }

            if (TempHolder == "1") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/garlic/index.html")
            }

            if (TempHolder == "2") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/vitamink/index.html")
            }

            if (TempHolder == "3") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/berberine/index.html")
            }

            if (TempHolder == "4") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/taurine/index.html")
            }

            if (TempHolder == "5") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/q10/index.html")
            }

            if (TempHolder == "6") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/magnesium/index.html")
            }

            if (TempHolder == "7") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/omega/index.html")
            }

            if (TempHolder == "8") {
                WebView.loadUrl("https://cvdsupplements.s3.us-east-2.amazonaws.com/greentea/index.html")
            }

            WebView!!.webViewClient = object: WebViewClient(){
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    binding.cvdSupplementsProgressbar.visibility = View.VISIBLE
                    super.onPageStarted(view, url, favicon)
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    binding.cvdSupplementsProgressbar.visibility = View.GONE
                    super.onPageFinished(view, url)
                }
            }

        }
    }

    override fun onBackPressed() {
        if(binding.webviewcvdsuplements!!.canGoBack()){
            binding.webviewcvdsuplements.goBack()
        }
        else {
            super.onBackPressed()
        }
    }
}