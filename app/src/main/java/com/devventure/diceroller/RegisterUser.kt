package com.devventure.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val playerEditText = findViewById<EditText>(R.id.playerName)
        val registerBttn = findViewById<Button>(R.id.registerBttn)

        registerBttn.setOnClickListener {
            val playerName = playerEditText.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("player_name", playerName)
            startActivity(intent)
        }
    }
}