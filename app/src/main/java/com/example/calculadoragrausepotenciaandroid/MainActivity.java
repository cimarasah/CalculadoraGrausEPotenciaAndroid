package com.example.calculadoragrausepotenciaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGrau, btnPotencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGrau = findViewById(R.id.btnCalcGrau);
        btnGrau.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculadoraGraus.class);
                startActivity(intent);
            }
        });
        btnPotencia = findViewById(R.id.btnCalcPotencia);
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculadoraPotencia.class);
                startActivity(intent);
            }
        });
    }
}
