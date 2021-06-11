package com.devventure.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<ImageView>(R.id.dice1)
        val dado2 = findViewById<ImageView>(R.id.dice2)
        val btn = findViewById<Button>(R.id.button)

        val text = findViewById<TextView>(R.id.goodLuckMessage)
        val playerName = intent.getStringExtra("player_name")

        //text.text = "${resources.getString(R.string.good_luck_message)}, $playerName!"
        text.text = getString(R.string.good_luck_message, playerName)

        val images = listOf(
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_5,
                R.drawable.dice_6)

        btn.setOnClickListener {
            dado1.setImageResource(images.random())
            dado2.setImageResource(images.random())
        }
        Log.i("CICLO DE VIDA", "ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO DE VIDA", "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO DE VIDA", "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO DE VIDA", "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO DE VIDA", "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO DE VIDA", "ON DESTROY")
    }

    private fun getNumber() : Int {
        return (1..6).random()
    }
}