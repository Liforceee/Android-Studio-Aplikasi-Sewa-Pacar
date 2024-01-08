package com.example.aplikasisewapacar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInfo = findViewById<android.view.View>(R.id.btn_info)
        val buttonSewa = findViewById<android.view.View>(R.id.btn_sewa)
        val buttonContact = findViewById<android.view.View>(R.id.btn_contact)

        buttonInfo.setOnClickListener {
            tombol_info()
        }

        buttonSewa.setOnClickListener {
            tombol_sewa()
        }

        buttonContact.setOnClickListener {
            tombol_contact()
        }
    }

    fun tombol_info() {
        val intent = Intent(this, DaftarTalent::class.java)
        startActivity(intent)
    }

    fun tombol_sewa() {
        val intent = Intent(this, SewaPacarActivity::class.java)
        startActivity(intent)
    }

    fun tombol_contact() {
        val intent = Intent(this, strukActivity::class.java)
        startActivity(intent)
    }
}