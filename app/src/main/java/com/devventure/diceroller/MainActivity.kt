package com.devventure.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<TextView>(R.id.textView)
        val dado2 = findViewById<TextView>(R.id.textView2)
        val btn = findViewById<Button>(R.id.button)

        dado1.text = gerarAleatorio().toString()
        dado2.text = gerarAleatorio().toString()

        btn.setOnClickListener {
            dado1.text = gerarAleatorio().toString()
            dado2.text = gerarAleatorio().toString()
        }

    }

    fun gerarAleatorio() : Int {
        return (1..6).random()
    }
}