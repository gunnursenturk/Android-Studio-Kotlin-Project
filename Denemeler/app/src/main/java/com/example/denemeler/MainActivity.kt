package com.example.denemeler

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciAdi :String ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        sharedPreferences=this.getSharedPreferences("com.example.denemeler", MODE_PRIVATE)
        alinanKullaniciAdi=sharedPreferences.getString("kullanici","")
        if (alinanKullaniciAdi!=null)
        {
            textView2.text="Kaydedilen Kullanıcı Adı:${alinanKullaniciAdi}"
        }

    }

    fun sayac(view: View)
    {
        val intent=Intent(applicationContext,IkinciAktivite::class.java)
        startActivity(intent)
    }

    fun ekle(view: View)
    {
        val kullaniciAdi=editText.text.toString()
        if (kullaniciAdi=="")
        {
            Toast.makeText(this,"Lütfen bir değer giriniz!",Toast.LENGTH_LONG).show()
        }
        else{
            sharedPreferences.edit().putString("kullanici",kullaniciAdi).apply()
            textView2.text="Kaydedilen Kullanıcı Adı:${kullaniciAdi}"
        }
    }
    fun sil (view: View)
    {
        alinanKullaniciAdi=sharedPreferences.getString("kullanici","")

        if(alinanKullaniciAdi!=null)
        {
            textView2.text="Kaydedilen Kullanıcı Adı:"
            sharedPreferences.edit().remove("kullanici").apply()

        }


    }

}