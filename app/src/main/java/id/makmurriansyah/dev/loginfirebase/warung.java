package id.makmurriansyah.dev.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class warung extends AppCompatActivity {
    private Button openTeachersActivityBtn,openUploadActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        openTeachersActivityBtn = findViewById ( R.id.openTeachersActivityBtn );
        openUploadActivityBtn = findViewById ( R.id.openUploadActivityBtn );

        openTeachersActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(warung.this, ItemsActivity.class);
                startActivity(i);
            }
        });
        openUploadActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(warung.this, UploadActivity.class);
                startActivity(i);
            }
        });

    }

}