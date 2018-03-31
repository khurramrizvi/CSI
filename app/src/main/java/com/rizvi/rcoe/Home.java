package com.rizvi.rcoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        webview = findViewById(R.id.webview);
        WebSettings websettings =webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        websettings.setDisplayZoomControls(true);
        webview.loadUrl("http://csi.rcoe.co.in/");
        webview.setWebViewClient(new WebViewClient());

    }


    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            Toast.makeText(this, "Press Back to go Home", Toast.LENGTH_SHORT).show();
            webview.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
