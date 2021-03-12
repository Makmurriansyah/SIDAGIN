package id.makmurriansyah.dev.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class uptdmetrologi extends AppCompatActivity {
    private CardView Datauttp_Card, Permohonantera_Card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uptdmetrologi);

        Datauttp_Card = (CardView) findViewById(R.id.datauttp_card);
        Permohonantera_Card = (CardView) findViewById(R.id.teraulang_card);

        Datauttp_Card.setOnClickListener(this::onClick);  //sebelumnya this
        Permohonantera_Card.setOnClickListener(this::onClick);
    }
    //berikan @Override jika tidak bisa
    public void onClick (View v) {
        Intent i ;
        switch (v.getId()) {
            case R.id.datauttp_card : i = new Intent( this, databaseuttp.class); startActivity(i); break;
            case R.id.teraulang_card : i = new Intent( this, teraulang.class); startActivity(i); break;
            default:
                break;

        }
    }
}
