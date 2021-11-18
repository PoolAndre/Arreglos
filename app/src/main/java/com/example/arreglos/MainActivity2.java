package com.example.arreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    Button Distrito;
    Button Anexos;
    Button atras;
    Spinner SP1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Distrito = (Button) findViewById(R.id.btnDistrito);
        Anexos = (Button) findViewById(R.id.btnAnexos);
        atras = (Button) findViewById(R.id.btnAtras);
        SP1 = findViewById(R.id.spinner);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        Distrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this, R.array.distritos, android.R.layout.simple_list_item_1);
                SP1.setAdapter(adapter);
            }
        });

        Anexos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this, R.array.anexos, android.R.layout.simple_list_item_1);
                SP1.setAdapter(adapter);
            }
        });
    }
}