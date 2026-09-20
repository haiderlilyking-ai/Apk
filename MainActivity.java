package com.finflowpro.app;
import android.app.*;import android.os.*;import android.webkit.*;import android.view.*;import android.net.*;
public class MainActivity extends Activity{
 WebView w;
 @Override public void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);w.setLayoutParams(new ViewGroup.LayoutParams(-1,-1));WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setDatabaseEnabled(true);s.setAllowFileAccess(true);s.setAllowContentAccess(true);s.setSupportZoom(false);w.setWebViewClient(new WebViewClient());w.loadUrl("file:///android_asset/index.html");setContentView(w);}
 @Override public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}
}
