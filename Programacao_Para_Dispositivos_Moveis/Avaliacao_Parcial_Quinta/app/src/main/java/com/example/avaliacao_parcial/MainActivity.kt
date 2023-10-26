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


    var vogais = 0
    var consoantes = 0
    var totalLetras = 0
    var letrasDigitadas = ""

    fun cadastrarLetras(view: View) {
        var resultado: TextView = findViewById(R.id.resultado)
//        var letras: EditText = findViewById(R.id.inserindoLetras)
//
//        var letra = letras.text.toString()

        val letras: EditText = findViewById(R.id.inserindoLetras)

        val letra = letras.text.toString()


        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
            vogais++
            letrasDigitadas += "" + letra + ", "
            totalLetras++
            resultado.text = "A letra: " + letra + " foi cadastrada!"
        } else  if(letra == "b" || letra == "c" || letra == "d" || letra == "f" || letra == "g" ||
            letra == "h" || letra == "j" || letra == "k" || letra == "l" || letra == "m" ||
            letra == "n" || letra == "p" || letra == "q" || letra == "r" || letra == "s" ||
            letra == "t" || letra == "v" || letra == "x" || letra == "y" || letra == "w" ||
            letra == "z"){
            consoantes++
            totalLetras++
            letrasDigitadas += "" + letra + ", "
            resultado.text = "A letra: " + letra + " foi cadastrada!"
        } else {
            resultado.text = "Letra inválida, tente novamente"
        }

    }

    fun mostrarLetras(view: View){
        var resultado: TextView = findViewById(R.id.resultado)
        resultado.text = "Qtde de vogais: " + vogais + "\nQtde consoantes: " + consoantes +
                "\nTotal letras: " + totalLetras +"\nLetras inseridas: " + letrasDigitadas
    }


}