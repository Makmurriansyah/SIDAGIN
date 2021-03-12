package id.makmurriansyah.dev.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MenuUtama extends AppCompatActivity implements View.OnClickListener {
    private CardView hargaCard, profilCard, jenisCard, infoCard, warungCard, ikmCard, aboutCard, masukanCard, shareCard, tentangCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        //memanggil activity baru
        hargaCard = (CardView) findViewById(R.id.harga_card);
        profilCard = (CardView) findViewById(R.id.profil_card);
        jenisCard = (CardView) findViewById(R.id.pelayanan_card);
        infoCard = (CardView) findViewById(R.id.gudang_card);
        warungCard = (CardView) findViewById(R.id.warung_card);
        ikmCard = (CardView) findViewById(R.id.ikm_card);
        aboutCard = (CardView) findViewById(R.id.about_card);
        masukanCard = (CardView) findViewById(R.id.masukan_card);
        shareCard = (CardView) findViewById(R.id.share_card);
        tentangCard = (CardView) findViewById(R.id.tentang_card);


        hargaCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);
        jenisCard.setOnClickListener(this);
        infoCard.setOnClickListener(this);
        warungCard.setOnClickListener(this);
        ikmCard.setOnClickListener(this);
        aboutCard.setOnClickListener(this);
        masukanCard.setOnClickListener(this);
        tentangCard.setOnClickListener(this);
        shareCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Makmurriansyah Donii");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.makmurriansyah.web.id");
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });

    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.harga_card:
                i = new Intent(this, harga.class);
                startActivity(i);
                break;
            case R.id.profil_card:
                i = new Intent(this, profil.class);
                startActivity(i);
                break;
            case R.id.pelayanan_card:
                i = new Intent(this, pelayanan.class);
                startActivity(i);
                break;
            case R.id.gudang_card:
                i = new Intent(this, gudang.class);
                startActivity(i);
                break;
            case R.id.warung_card:
                i = new Intent(this, warung.class);
                startActivity(i);
                break;
            case R.id.ikm_card:
                i = new Intent();
                startActivity(i);
                break;
            case R.id.masukan_card:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.tentang_card:
                i = new Intent(this, tentang.class);
                startActivity(i);
                break;
            default:
                break;
        }

    }
}
