package com.example.projetoimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Receber os dados passados pela Intent
        Intent intent = getIntent();
        String imc = intent.getStringExtra("imc");
        String classificacao = intent.getStringExtra("classificacao");
        String peso = intent.getStringExtra("peso");
        String altura = intent.getStringExtra("altura");

        // Exibir os dados na tela
        TextView resultadoTextView = findViewById(R.id.textResultado);
        TextView motivacionalTextView = findViewById(R.id.textMotivacional);
        TextView pesoTextView = findViewById(R.id.textPeso);
        TextView alturaTextView = findViewById(R.id.textAltura);

        // Definindo os valores na tela
        resultadoTextView.setText("IMC: " + imc);
        motivacionalTextView.setText("Classificação: " + classificacao);
        pesoTextView.setText("Peso: " + peso);
        alturaTextView.setText("Altura: " + altura);

        // Adicionar mensagem motivacional específica para Peso Normal
        if (classificacao.equals("Peso normal")) {
            motivacionalTextView.append("\nParabéns! Você está dentro do peso ideal. Continue se cuidando!");
        }
    }

    public void voltartelaprincipal(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }
}



