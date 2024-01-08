package com.example.aplikasisewapacar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class strukActivity : AppCompatActivity() {
    private lateinit var nama_penyewa: TextView
    private lateinit var ad_listtalent: TextView
    private lateinit var lama_sewa: TextView
    private lateinit var total: TextView
    private lateinit var uang_bayar: TextView
    private lateinit var uang_kembali: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_struk)

        nama_penyewa = findViewById(R.id.nama_penyewa)
        ad_listtalent = findViewById(R.id.jenis_talent)
        lama_sewa = findViewById(R.id.lama_sewa)
        total = findViewById(R.id.total)
        uang_bayar = findViewById(R.id.uang_bayar)
        uang_kembali = findViewById(R.id.uang_kembali)

        nama_penyewa.text = intent.getStringExtra("nama")
        ad_listtalent.text = intent.getStringExtra("talent")
        lama_sewa.text = intent.getIntExtra("lama", 0).toString()
        total.text = intent.getIntExtra("total", 0).toString()
        uang_bayar.text = intent.getIntExtra("uang", 0).toString()
        uang_kembali.text = intent.getIntExtra("kembalian", 0).toString()
    }

    fun halUtama(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
