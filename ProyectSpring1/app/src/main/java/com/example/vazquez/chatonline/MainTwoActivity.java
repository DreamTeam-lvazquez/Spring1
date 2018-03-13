package com.example.vazquez.chatonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class MainTwoActivity extends AppCompatActivity {


    private Button btnFace, btnWhats, btnTwitter , btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_main);


        btnFace =  (Button) findViewById(R.id.btn_face);
        btnTwitter = (Button) findViewById(R.id.btn_twitter);
        btnWhats = (Button) findViewById(R.id.btn_whats);
        btnCompartir = (Button) findViewById(R.id.btn_compartir);

        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(MainTwoActivity.this, "SOLO POR COMPROMISO", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(MainTwoActivity.this, "REGRESARÉ MUY PRONTO", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(MainTwoActivity.this, "VOLVERÉ", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(MainTwoActivity.this, "TAL VEZ REGRESÉ ", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainTwoActivity.this, "NUNCA REGRESARE!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int level, boolean reselected) {
                Toast.makeText(MainTwoActivity.this, "Selected rating" + level, Toast.LENGTH_SHORT).show();
            }
        });


        btnCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Mi primera APP");

                startActivity(Intent.createChooser(intent, "share with"));

            }
        });
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Mi primera APP");
                intent.setPackage("com.facebook.katana");
                startActivity(Intent.createChooser(intent, "share with"));

            }
        });

        btnWhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Mi primera APP");
                intent.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(intent, "share with"));

            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Mi primera APP");
                intent.setPackage("com.twitter.android");
                startActivity(Intent.createChooser(intent, "share with"));

            }
        });

    }
}
