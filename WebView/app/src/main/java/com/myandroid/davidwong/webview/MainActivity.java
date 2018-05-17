package com.myandroid.davidwong.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    String URL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        URL = "https://1cak.com/";

        //versi pertama
        wv = (WebView)findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(URL);
        wv.setWebViewClient(new WebViewClient());

        //versi youtube kedua
    }

    @Override
    public void onBackPressed(){
        if(wv.canGoBack()){
            wv.goBack();
        }else {
            super.onBackPressed();
        }
    }
}