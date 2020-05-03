package it.mircobellinibaldella.primaapplicazione;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Logged extends AppCompatActivity {
    private String nome;
    private TextView textViewNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        textViewNome = findViewById(R.id.textViewNome);
        nome=getIntent().getStringExtra("NOME");

        textViewNome.setText("Benvenuto, "+nome);

        findViewById(R.id.bottoneInverti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Logged.this, Terza.class);
                intent.putExtra("NOME",nome);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == Activity.RESULT_OK){
            textViewNome.setText("Il tuo nome specchiato è , "+data.getStringExtra("CODICE"));
        }else{
            textViewNome.setText("Si è verificato un errore");
        }
    }
}
