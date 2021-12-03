package com.example.sqlite

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try{
            val veritabani=this.openOrCreateDatabase("Urunler", Context.MODE_PRIVATE,null)
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS urunler(id INTEGER PRIMARY KEY,isim VARCHAR,fiyat INT)")
            //veritabani.execSQL("INSERT INTO urunler(isim,fiyat)VALUES('Ayakkabi',100)")
            //veritabani.execSQL("UPDATE urunler SET fiyat=150 WHERE id=2)
            val cursor=veritabani.rawQuery("SELECT * FROM urunler",null)
            val corsor=veritabani.rawQuery("SELECT * FROM urunler WHERE isim LIKE '%e'",null)

            val idColumnIndex=cursor.getColumnIndex("id")
            val isimColumnIndex=cursor.getColumnIndex("isim")
            val fiyatColumnIndex=cursor.getColumnIndex("fiyat")

            while(cursor.moveToNext()){
                println("ID:${cursor.getInt(idColumnIndex)}")
                println("Isim:${cursor.getString(isimColumnIndex)}")
                println("Fiyat:${cursor.getInt(fiyatColumnIndex)}")

            }
            cursor.close()
        }
        catch (e:Exception){
            e.printStackTrace()
        }


    }

}