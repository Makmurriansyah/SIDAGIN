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

public class struktur extends AppCompatActivity {
    private WebView webView;
    private ProgressBar mProggessbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur);
        webView = (WebView) findViewById(R.id.webview);
        mProggessbar = (ProgressBar) findViewById(R.id.progressBar);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://disperindag.labuhanbatukab.go.id/asset/foto_banner/Struktur_DagInd_51.jpg");

        // Tiga baris di bawah ini agar laman yang dimuat dapat melakukan zoom.
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                if(!isappOnline()) {
                    webView.loadUrl("file:///android_asset/error1.html");
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