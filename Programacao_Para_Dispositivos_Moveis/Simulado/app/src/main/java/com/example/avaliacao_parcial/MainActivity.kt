package com.example.avaliacao_parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    var pares = 0
    var impares = 0
    var numerosDigitados = ""

    fun cadastrarNumeros(view:View) {
        var resultado: TextView = findViewById(R.id.resultado)
        var inserindoNums: EditText = findViewById(R.id.inserindoNums)



        var num: Int = inserindoNums.text.toString().toInt()

        if (num % 2 == 0){
            pares++
            numerosDigitados += "" + num + ", "
        } else {
            impares++
            numerosDigitados += "" + num + ", "
        }

                resultado.text = "O número: " + num + " foi cadastrado!"

    }

    fun mostrarNumeros(view: View){
        var resultado: TextView = findViewById(R.id.resultado)
        resultado.text = "Qtde pares: " + pares + "\nQtde impares: " + impares + "\nNúmeros inseridos: " + numerosDigitados
    }
}