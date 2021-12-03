package com.example.kullanici
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciAdi: String ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences= this.getSharedPreferences("com.example.kullanici", Context.MODE_PRIVATE)
        alinanKullaniciAdi=sharedPreferences.getString("kullaniciadi","")
        if(alinanKullaniciAdi!=null)
            denemeText.text="Kaaydedilen kullanici adi "+alinanKullaniciAdi
    }
    fun kaydet(view: View){
       val kullaniciAdi=editText.text.toString()
        if(kullaniciAdi=="")
            Toast.makeText(applicationContext,"Bir deger giriniz",Toast.LENGTH_LONG).show()
        else
        {
            sharedPreferences.edit().putString("kullaniciadi",kullaniciAdi).apply()
            denemeText.text="Kaydedilen Kullanıcı Adı:"+kullaniciAdi
        }
    }
    fun sil(view: View){
        denemeText.text="Kaydedilen Kullanıcı Adı:"
    }
}