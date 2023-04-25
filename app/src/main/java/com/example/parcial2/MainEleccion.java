package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainEleccion extends AppCompatActivity {

    TextView Mdatos;

    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eleccion);

        Mdatos = findViewById(R.id.txtElec);

        Bundle recibeD1 = getIntent().getExtras();
        String info = recibeD1.getString("keyDatos");

        Mdatos.setText(info);

    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this, Map.class);
        startActivity(siguiente);
    }

}