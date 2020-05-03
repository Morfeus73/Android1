package it.mircobellinibaldella.primaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Terza extends AppCompatActivity {
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terza);

        nome = new StringBuilder(getIntent().getStringExtra("NOME")).reverse().toString();

        findViewById(R.id.bottoneIndietro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("CODICE", nome);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
