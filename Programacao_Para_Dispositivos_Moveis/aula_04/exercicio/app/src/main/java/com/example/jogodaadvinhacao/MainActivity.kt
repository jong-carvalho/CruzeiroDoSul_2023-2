package com.example.jogodaadvinhacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val randomValue = Random.nextInt(0, 1000)

    fun adivinheONumero(view: View) {


        val palpite: EditText = findViewById(R.id.palpite)

        val dica: TextView = findViewById(R.id.dica)

        val like: ImageView = findViewById(R.id.like)
        val dislike: ImageView = findViewById(R.id.dislike)

        if(palpite.text.toString().toInt() == randomValue) {
            dica.text = "Acertou!"
            dislike.visibility = View.INVISIBLE
            like.visibility = View.VISIBLE
        } else if(palpite.text.toString().toInt() > randomValue) {
            dica.text = "Seu palpite foi maior do que o número sorteado!"
            dislike.visibility = View.VISIBLE
        } else {
            dica.text = "Seu palpite foi menor do que o número sorteado!"
            dislike.visibility = View.VISIBLE
        }

    }
}