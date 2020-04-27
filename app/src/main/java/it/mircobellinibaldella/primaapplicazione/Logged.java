package it.mircobellinibaldella.primaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Logged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        TextView textViewNome = findViewById(R.id.textViewNome);

        textViewNome.setText("Benvenuto, "+getIntent().getStringExtra("NOME"));
    }
}
