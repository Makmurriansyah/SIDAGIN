package id.makmurriansyah.dev.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class pelayanan extends AppCompatActivity {
    private CardView databaseCard, uptdPasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelayanan);
        databaseCard = (CardView) findViewById(R.id.uptdmetrologi_card);
        uptdPasar = (CardView) findViewById(R.id.uptdpasar_card);

        databaseCard.setOnClickListener(this::onClick);  //sebelumnya hanya this
        uptdPasar.setOnClickListener(this::onClick);
    }
    //berikan @Override jika tidak bisa
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.uptdmetrologi_card:
                i = new Intent(this, uptdmetrologi.class);
                startActivity(i);
                break;
            case R.id.uptdpasar_card:
                i = new Intent(this, teraulang.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}