package com.example.calculadoragrausepotenciaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CalculadoraGraus extends AppCompatActivity {

    EditText etCelsius, etFahrenheit;
    RadioButton rbCelsius, rbFahrenheit;
    Button btnConverter;
    double celsius, fahrenheit;
    TextView txtErro;
    View actView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_graus);

        etCelsius = findViewById(R.id.etCelsius);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        rbCelsius = findViewById(R.id.rbCelsius);
        rbFahrenheit = findViewById(R.id.rbFahrenheit);
    }


    public void converter(View v){
        etCelsius = findViewById(R.id.etCelsius);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        rbCelsius = findViewById(R.id.rbCelsius);
        rbFahrenheit = findViewById(R.id.rbFahrenheit);
        actView = findViewById(R.id.actView);

        if(rbCelsius.isChecked()){
            if(etFahrenheit.getText().toString().equals("")){
                txtErro.setText("Preencha Fahrenheit");
            }else{
                fahrenheit = Integer.parseInt(etFahrenheit.getText().toString());
                celsius = (fahrenheit-32)/1.8;
                etCelsius.setText(String.valueOf(celsius));

            }
        }
        if(rbFahrenheit.isChecked()){
            if(etCelsius.getText().toString().equals("")){
                txtErro.setText("Preencha Celsius");
            }else{
                celsius = Integer.parseInt(etCelsius.getText().toString());
                fahrenheit = 1.8*celsius+32;
                etFahrenheit.setText(String.valueOf(fahrenheit));
            }
        }
        actView.setBackgroundColor(getColorTemp((int)celsius));
    }
    public void changeConversao(View v){
        etCelsius = findViewById(R.id.etCelsius);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        rbCelsius = findViewById(R.id.rbCelsius);
        rbFahrenheit = findViewById(R.id.rbFahrenheit);

        if(rbCelsius.isChecked()){
            etCelsius.setFocusable(false);
        }else if(rbFahrenheit.isChecked()){
            etFahrenheit.setFocusable(false);
        }
    }
    public int getColorTemp(int temp){
        if(temp<0){
            return getResources().getColor(android.R.color.holo_blue_dark);
        }else if(temp<10){
            return getResources().getColor(android.R.color.holo_blue_light);
        }else if(temp<20){
            return getResources().getColor(android.R.color.holo_blue_bright);
        }else if(temp<30){
            return getResources().getColor(android.R.color.darker_gray);
        }else if(temp<40){
            return getResources().getColor(android.R.color.holo_orange_light);
        }else if(temp<50){
            return getResources().getColor(android.R.color.holo_orange_dark);
        }else if(temp<60){
            return getResources().getColor(android.R.color.holo_red_light);
        }else if(temp>=60){
            return getResources().getColor(android.R.color.holo_red_light);
        }
        return 1;
    }
}
