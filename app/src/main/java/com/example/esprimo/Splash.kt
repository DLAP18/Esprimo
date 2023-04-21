package com.example.esprimo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esprimo.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class Splash : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        thread {
            Thread.sleep(2000) //Tiempo de espera de una activity
            //Manda a llamar a la siguiente pantalla
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            //Finaliza el hilo
            finish()
        }
    }
}