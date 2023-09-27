package com.example.boasvindas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boasVindas(View view) {

        EditText nome = findViewById(R.id.nome);
        TextView mensagem = findViewById(R.id.boasVindasMsg);

        int letras = nome.getText().length();

        System.out.println(letras);

        mensagem.setText("Seja bem vindo " + nome.getText() + "\nSeu nome possui: " + letras + "letras.");
    }
}