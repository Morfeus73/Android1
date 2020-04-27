package it.mircobellinibaldella.primaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    Button resetButton, testButton, playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.Nome);
        resetButton = findViewById(R.id.resetButton);
        testButton = findViewById(R.id.testButton);
        playButton = findViewById(R.id.playButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome.setText("");
            }
        });

        //Visualizza un toast
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Ciao "+nome.getText(),Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }

    public void passa(View view){
        Intent intent = new Intent(MainActivity.this, Logged.class);
        intent.putExtra("NOME",nome.getText().toString());
        startActivity(intent);
    }

}
