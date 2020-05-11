package com.example.moviles1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.moviles1.R

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun onRegistrar (view : View){
        //Esto deberia registrar y redirigir al inicio DEBERIA!!
        val  intento = Intent(this, LoginActicity::class.java)
        startActivity(intento)
    }
    fun onCancelar (view : View){
        //este solo redirige al inicio
        val  intento = Intent(this, LoginActicity::class.java)
        startActivity(intento)
    }
}
