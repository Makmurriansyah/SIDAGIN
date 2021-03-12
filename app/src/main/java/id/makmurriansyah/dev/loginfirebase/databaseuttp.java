package id.makmurriansyah.dev.loginfirebase;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class databaseuttp extends AppCompatActivity {
    private WebView webView;
    private ProgressBar mProggessbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databaseuttp);
        webView = (WebView) findViewById(R.id.webview);
        mProggessbar = (ProgressBar) findViewById(R.id.progressBar);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.loadUrl("https://docs.google.com/spreadsheets/d/1hCPpKnBAsvgxeDv4BDpniZQcIXgzc6PCy_rybjAHXXQ/edit#gid=0");
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                if(!isappOnline()) {
                    webView.loadUrl("file:///android_asset/error.html");
                }
            }

            private boolean isappOnline() {
                ConnectivityManager cm = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
                return cm.getActiveNetworkInfo() != null;
            }


            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                mProggessbar.setVisibility(View.VISIBLE);
                setTitle("Loading...");
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                mProggessbar.setVisibility(View.GONE);
                setTitle(view.getTitle());
                super.onPageFinished(view, url);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            finish();
            System.exit(0);
        }
    }
}