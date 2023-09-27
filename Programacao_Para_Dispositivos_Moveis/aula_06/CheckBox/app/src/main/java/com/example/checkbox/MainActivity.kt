package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun publicaResultado(view: View ) {
        var fusca: CheckBox = findViewById(R.id.check_fusca)
        var brasilia: CheckBox  = findViewById(R.id.check_brasilia)
        var monza: CheckBox = findViewById(R.id.check_monza)
        var chevette: CheckBox = findViewById(R.id.check_chevette)
        var kombi: CheckBox = findViewById(R.id.check_kombi)
        var fiat147: CheckBox = findViewById(R.id.check_fiat_147)

        var btnResultado: Button  = findViewById(R.id.btn_resultado)

        var resultado: TextView  = findViewById(R.id.resultado)

        var resultados: ArrayList<String> = arrayListOf()

//        resultado.isEnabled = false



        if(fusca.isChecked){
            resultados.add("Fusca")
        } else {
            resultados.remove("Fusca")
        }

        if(brasilia.isChecked){
            resultados.add("Brasilia")
        } else {
            resultados.remove("Brasilia")
        }

        if(monza.isChecked){
            resultados.add("Monza")
        } else {
            resultados.remove("Monza")
        }

        if(chevette.isChecked){
            resultados.add("Chevette")
        } else {
            resultados.remove("Chevette")
        }

        if(kombi.isChecked){
            resultados.add("Kombi")
        } else {
            resultados.remove("Kombi")
        }

        if(fiat147.isChecked){
            resultados.add("Fiat 147")
        } else {
            resultados.remove("Fiat 147")
        }


        resultado.text = resultados.toString()



    }


}