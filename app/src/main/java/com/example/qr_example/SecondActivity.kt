package com.example.qr_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var folio: String = intent.getStringExtra("folio")!!
       val  txtFolio = findViewById<TextView>(R.id.folioTxt)
        txtFolio.setText(folio)


    }
}