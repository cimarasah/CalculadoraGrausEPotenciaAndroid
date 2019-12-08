package com.example.calculadoragrausepotenciaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalculadoraPotencia extends AppCompatActivity {

    EditText etPotencia, etCorrente, etVoltagem;
    RadioButton rbPotencia, rbCorrente;
    Button btnConverter;
    double potencia, corrente, voltagem;
    TextView txtErro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_potencia);
    }
    public void converter(View v){
        etPotencia = findViewById(R.id.etPotencia);
        etCorrente = findViewById(R.id.etCorrente);
        etVoltagem = findViewById(R.id.etVoltagem);

        rbPotencia = findViewById(R.id.rbPotencia);
        rbCorrente = findViewById(R.id.rbCorrente);

        if(rbPotencia.isChecked()){
            if(etCorrente.getText().toString().equals("")||etVoltagem.getText().toString().equals("")){
                txtErro.setText("Preencha Corrente e Voltagem");
            }else{
                corrente = Integer.parseInt(etCorrente.getText().toString());
                voltagem = Integer.parseInt(etVoltagem.getText().toString());
                potencia = corrente * voltagem;
                etPotencia.setText(String.valueOf(potencia));

            }
        }
        if(rbCorrente.isChecked()){
            if(etPotencia.getText().toString().equals("")||etVoltagem.getText().toString().equals("")){
                txtErro.setText("Preencha Corrente e Voltagem");

            }else{
                potencia = Integer.parseInt(etPotencia.getText().toString());
                voltagem = Integer.parseInt(etVoltagem.getText().toString());

                corrente = potencia/voltagem;
                etCorrente.setText(String.valueOf(corrente));
            }
        }
    }
}
