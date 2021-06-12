package com.devventure.diceroller

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.devventure.diceroller.databinding.FragmentRollDiceBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RollDiceFragment : Fragment() {
    private var binding: FragmentRollDiceBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRollDiceBinding.inflate(inflater, container, false)

        val dado1 = binding?.dice1
        val dado2 = binding?.dice2
        val btn = binding?.button
        val shareBttn = binding?.shareBttn

        val text = binding?.goodLuckMessage
        val playerName = "playerName"

        //text.text = "${resources.getString(R.string.good_luck_message)}, $playerName!"
        text?.text = getString(R.string.good_luck_message, playerName)

        val images = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_5,
            R.drawable.dice_6)

        btn?.setOnClickListener {
            dado1?.setImageResource(images.random())
            dado2?.setImageResource(images.random())
        }

        shareBttn?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "You are lucky!")
            intent.type = "text/plain"

            intent.setPackage("com.whatsapp")

            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null){
                    startActivity(intent)
                } else {
                    Toast.makeText(context, "Você não tem o WhatsApp instalado!", Toast.LENGTH_LONG).show()
                }
            }
        }

        return binding?.root
    }
}