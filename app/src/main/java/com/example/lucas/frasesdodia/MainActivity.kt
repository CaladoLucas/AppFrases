package com.example.lucas.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var textoFrase: TextView
    lateinit var frases : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textoFrase = findViewById(R.id.textoFrase)

        frases = arrayOf(
                getString(R.string.frase1).toString(),
                getString(R.string.frase2).toString(),
                getString(R.string.frase3).toString(),
                getString(R.string.frase4).toString(),
                getString(R.string.frase5).toString()
        )

    }

    fun gerarFrase(view: View){

        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt( totalItensArray )

        textoFrase.text = frases[numeroAleatorio]

    }
}
