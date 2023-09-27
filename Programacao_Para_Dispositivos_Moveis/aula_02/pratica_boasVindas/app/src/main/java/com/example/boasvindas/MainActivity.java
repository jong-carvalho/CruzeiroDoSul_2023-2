package com.example.boasvindas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boasVindas(View view){

        TextView nome = findViewById(R.id.nome);
        TextView msg = findViewById(R.id.textoBoasVindas);

// assim vai dar erro, porque ele não está pegando o texto
//        msg.setText("Olá, " + nome + "\nSeja bem vindo.");
        msg.setText("Olá, " + nome.getText() + "\nSeja bem vindo.");

    }

}