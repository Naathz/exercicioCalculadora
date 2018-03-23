package com.fiap.nathalie.exerciciocalculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercicio.*

class exercicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio)


        btCalcular.setOnClickListener {
            val gasolina = etGasolina.text.toString().toDouble()
            val alcool = etAlcool.text.toString().toDouble()

            var resultado = alcool / gasolina

            if (resultado > 0.7) {
                tvResultado.text = resultado.toString() + " oi"


            }
        }
    }
}