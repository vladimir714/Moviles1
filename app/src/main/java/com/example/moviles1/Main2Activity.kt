package com.example.moviles1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.moviles1.R

class Main2Activity : AppCompatActivity() {
    private var editTxtNroIdent: EditText? = null
    private var edtTxtEmail: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        editTxtNroIdent = findViewById(R.id.edtTxtNroIdent)
        edtTxtEmail = findViewById(R.id.edtTxtEmail)
    }
    fun onCancelar (view : View){
        val  intento = Intent(this, LoginActicity::class.java)
        startActivity(intento)
    }

    fun onContinuar (view : View){
        if (edtTxtEmail!!.text.toString() =="LEPE@gmail.com"){
            if (editTxtNroIdent!!.text.toString()=="123") {
                val intento = Intent(this, newPassword::class.java)
                startActivity(intento)
            }
        }
        else {
            Toast.makeText(this,"Incorrect Email or Number identification", Toast.LENGTH_LONG).show()
        }
    }
}
