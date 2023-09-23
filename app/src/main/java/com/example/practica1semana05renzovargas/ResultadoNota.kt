package com.example.practica1semana05renzovargas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_nota)

        val message = intent.getStringExtra("param")
        val textView = findViewById<TextView>(R.id.txtNotita)
        textView.text = message




    }
}