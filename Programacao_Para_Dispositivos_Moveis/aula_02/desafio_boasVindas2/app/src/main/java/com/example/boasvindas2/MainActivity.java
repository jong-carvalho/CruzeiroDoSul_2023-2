package com.example.boasvindas2;

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

        EditText nome = findViewById(R.id.nomeTexto);
        EditText saudacao = findViewById(R.id.saudacaoTexto);
        TextView mensagem = findViewById(R.id.mensagem);

        mensagem.setText(saudacao.getText() + ", " + nome.getText() + "\nSeja bem vindo!");


    }
}