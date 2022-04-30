package com.ayesigyederrick.jumiawebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webview: WebView ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "JUMIA UG"

        val webView = findViewById<WebView>(R.id.webview)

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://www.jumia.ug/")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if(webview?.canGoBack() == true){
            webview?.goBack()
        }
        super.onBackPressed()
    }
}