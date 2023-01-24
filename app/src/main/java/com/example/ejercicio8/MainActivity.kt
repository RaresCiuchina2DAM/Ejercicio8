package com.example.ejercicio8

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.DrawableCompat.setTint
import com.example.ejercicio8.R.color.no_pulsado
import com.example.ejercicio8.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnElfo.setOnClickListener() {
            binding.imageView.setImageResource(R.drawable.elfo)

        }

        binding.BtnEnano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)



        }
        binding.BtnGoblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)

        }

        binding.BtnHumano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.persona)

        }

        binding.btnAceptar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }





    }

}

