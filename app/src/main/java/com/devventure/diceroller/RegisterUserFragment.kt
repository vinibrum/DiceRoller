package com.devventure.diceroller

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.devventure.diceroller.databinding.FragmentRegisterUserBinding


class RegisterUserFragment : Fragment() {
    private var binding: FragmentRegisterUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterUserBinding.inflate(inflater, container, false)

        val playerEditText = binding?.playerName
        val registerBttn = binding?.registerBttn

        registerBttn?.setOnClickListener {
            val playerName = playerEditText?.text.toString()

        }
        
        return binding?.root
    }
}