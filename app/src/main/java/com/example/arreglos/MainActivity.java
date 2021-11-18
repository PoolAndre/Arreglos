package com.example.arreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView LISTA;
    Button paises;
    Button departamentos;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises = (Button) findViewById(R.id.btnPaises);
        departamentos = (Button) findViewById(R.id.btnDepartamentos);
        siguiente = (Button) findViewById(R.id.btnSiguiente);
        LISTA = (ListView) findViewById(R.id.lstLista);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intento1);
            }
        });

        paises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.paises, android.R.layout.simple_list_item_1);
                LISTA.setAdapter(adapter);
            }
        });

        departamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.departamentos, android.R.layout.simple_list_item_1);
                LISTA.setAdapter(adapter);
            }
        });
    }
}