package com.example.aplikasisewapacar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class SewaPacarActivity : AppCompatActivity() {
    var harga_sewa_pacar = 0
    var jml_lmsw = 0
    var ttl_hargasewa = 0
    var jml_uang = 0
    var s_nama: String? = null

    lateinit var ad_listtalent: Spinner
    lateinit var harga_pacar: TextView
    lateinit var lama_sewa: EditText
    lateinit var uangbayar: EditText
    lateinit var nama_penyewa: EditText

    val list_talent = arrayOf("Budi", "Gebi Chan", "Vonzy", "Kanina")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewa_pacar)

        nama_penyewa = findViewById(R.id.nama_penyewa)
        ad_listtalent = findViewById(R.id.ad_listtalent)
        harga_pacar = findViewById(R.id.harga_sewa)
        lama_sewa = findViewById(R.id.lama_sewa)
        uangbayar = findViewById(R.id.uangbayar)

        ad_listtalent.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list_talent)
        ad_listtalent.setSelection(0)
    }


    fun tmbl_OK(view: View) {
        jml_lmsw = lama_sewa.text.toString().toInt()
        s_nama = nama_penyewa.text.toString()

        when (ad_listtalent.selectedItem.toString()) {
            "Budi" -> {
                harga_sewa_pacar = 200000
                ttl_hargasewa = jml_lmsw * harga_sewa_pacar
                harga_pacar.text = ttl_hargasewa.toString()
            }
            "Gebi Chan" -> {
                harga_sewa_pacar = 300000
                ttl_hargasewa = jml_lmsw * harga_sewa_pacar
                harga_pacar.text = ttl_hargasewa.toString()
            }
            "Vonzy" -> {
                harga_sewa_pacar = 400000
                ttl_hargasewa = jml_lmsw * harga_sewa_pacar
                harga_pacar.text = ttl_hargasewa.toString()
            }
            "Kanina" -> {
                harga_sewa_pacar = 500000
                ttl_hargasewa = jml_lmsw * harga_sewa_pacar
                harga_pacar.text = ttl_hargasewa.toString()
            }
        }
    }

    fun tombol_sewa2(view: View) {
        jml_uang = uangbayar.text.toString().toInt()
        if (jml_uang < ttl_hargasewa) {
            Toast.makeText(this, "Uang Kurang", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, strukActivity::class.java)

            intent.putExtra("nama", s_nama)
            intent.putExtra("talent", ad_listtalent.selectedItem.toString())
            intent.putExtra("lama", jml_lmsw)
            intent.putExtra("total", ttl_hargasewa)
            intent.putExtra("uang", jml_uang)
            intent.putExtra("kembalian", jml_uang - ttl_hargasewa)

            startActivity(intent)
        }
    }

    fun hal_utama(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

