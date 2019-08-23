package br.com.atividade.appevento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var webview = findViewById<WebView>(R.id.webview);

        webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true;
            }

        }
        webview.loadUrl("http://10.26.45.45/eventos/view/main.html")
        webview.settings.javaScriptEnabled = true
    }
}
