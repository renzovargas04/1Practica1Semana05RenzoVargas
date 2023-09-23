package com.example.practica1semana05renzovargas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etExParc: EditText = findViewById(R.id.etExParc)
        val NotParc:Double=etExParc.text.toString().toDouble()
        val etExFin: EditText = findViewById(R.id.etExFin)
        val NotFin:Double=etExFin.text.toString().toDouble()
        //etExFin.toString().toDouble()
        val etPEP: EditText = findViewById(R.id.etPEP)
        val NotPEP:Double=etPEP.text.toString().toDouble()
        //etPEP.toString().toDouble()
        val btnCal: Button = findViewById(R.id.btnCalcular)
        var prom: Double=(NotParc*0.2+NotFin*0.2+NotPEP*0.6)

        //if(prom>=10.5){
        // println("APROBADO")
        //}else{
        //    println("DESAPROBADO")
        //}

        btnCal.setOnClickListener {
            this.sendMessage(prom.toString())
        }
    }
    private fun sendMessage(message: String)
    {
        val intent = Intent(this, ResultadoNota::class.java)
        intent.putExtra("param",message)
        startActivity(intent)
    }
}