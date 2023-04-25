package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.txt1);
        et2 = findViewById(R.id.txt2);
        btnLog = findViewById(R.id.buttonL);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle EnviarD = new Bundle();
                EnviarD.putString("keyDatos", et1.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainEleccion.class);
                intent.putExtras(EnviarD);
                startActivity(intent);

            }
        });
    }
}