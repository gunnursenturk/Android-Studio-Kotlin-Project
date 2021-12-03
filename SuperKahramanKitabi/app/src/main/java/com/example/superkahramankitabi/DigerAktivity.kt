package com.example.superkahramankitabi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_diger_aktivity.*

class DigerAktivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diger_aktivity)

        val intent=intent
        val secilenKahramanIsmi=intent.getStringExtra("KahramanIsmi")
        textView.text=secilenKahramanIsmi
       /*
        val secilenKahraman=SingletonClass.SecilenKahraman
        val secilengorsel=secilenKahraman.gorsel
        imageView.setImageBitmap(secilengorsel)
        */

        val secilenGorsel=intent.getIntExtra("KahramanGorseli",0)
        val bitmap=BitmapFactory.decodeResource(applicationContext.resources,secilenGorsel)
        imageView.setImageBitmap(bitmap)
    }
}