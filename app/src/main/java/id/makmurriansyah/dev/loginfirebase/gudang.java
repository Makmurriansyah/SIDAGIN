package id.makmurriansyah.dev.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class gudang extends AppCompatActivity {
    private CardView infoGudang,izinGudang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gudang);

        infoGudang = (CardView) findViewById(R.id.informasigudang_card);
        izinGudang = (CardView) findViewById(R.id.izingudang_card);

        infoGudang.setOnClickListener(this::onClick);
        izinGudang.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.informasigudang_card : i = new Intent(this,infogudang.class);startActivity(i); break;
            case R.id.izingudang_card : i = new Intent(this,syaratgudang.class);startActivity(i); break;
            default:break;

        }
    }
}