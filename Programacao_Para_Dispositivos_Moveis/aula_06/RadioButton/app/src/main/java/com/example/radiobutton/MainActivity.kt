package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun aposentadoria(view: View){


//        var btnResultado: Button = findViewById(R.id.btn_verificar)
//        var radioGroup: RadioGroup = findViewById(R.id.grupo)
        var resultado: TextView = findViewById(R.id.resultado)
//
//        var radioId = radioGroup.checkedRadioButtonId
//
        var homemIdade = findViewById<RadioButton>(R.id.homem_idade)
        var homemContribuicao = findViewById<RadioButton>(R.id.homem_contribuicao)
        var homemNegado = findViewById<RadioButton>(R.id.homem_negado)

        var mulherIdade = findViewById<RadioButton>(R.id.mulher_idade)
        var mulherContribuicao = findViewById<RadioButton>(R.id.mulher_contribuicao)
        var mulherNegado = findViewById<RadioButton>(R.id.mulher_negado)



        if(homemIdade.isChecked || mulherIdade.isChecked){
            resultado.text = "Seu benefício foi concedido \nVocê pode se aposentar por idade"
        } else if(homemContribuicao.isChecked || mulherContribuicao.isChecked) {
            resultado.text = "Seu benefício foi concedido \nVocê pode se aposentar por tempo de contribuição"
        } else if(homemNegado.isChecked || mulherNegado.isChecked) {
            resultado.text = "Seu benefício não foi concedido \nVocê não pode se aposentar pois não atingiu a idade minima ou o tempo de contribuição"
        }



    }
}