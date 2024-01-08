package com.example.aplikasisewapacar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DaftarTalent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_talent)

        val buttonSewa = findViewById<View>(R.id.btn_sewa2)

        buttonSewa.setOnClickListener {
            hal_sewa()
        }
    }

    fun hal_sewa() {
        val intent = Intent(this, SewaPacarActivity::class.java)
        startActivity(intent)
    }
}