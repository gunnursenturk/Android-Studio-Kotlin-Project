package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri=ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Ironman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Superman")
        val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50)

        /*
        val aquamanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.gunnurrr)
        val batmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.emre)
        val ironmanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.emre2)
        val spidermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.emre3)
        val supermanBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.rte)
        //bitmapfactory görsel haline dönüştürme
        //decoderesource kaynakların yerini belirtmek resource ile bu dosyaya eklenen kaynakları belirtiriz
        //decodebytearray ise internetten aldığımız görsellerin kaynaklarını belirtmek için kullanılır
        //r.drawable görsellerin bulunduğu dosya

        var superKahramanGorseleri=ArrayList<Bitmap>()
        superKahramanGorseleri.add(aquamanBitmap)
        superKahramanGorseleri.add(batmanBitmap)
        superKahramanGorseleri.add(ironmanBitmap)
        superKahramanGorseleri.add(spidermanBitmap)
        superKahramanGorseleri.add(supermanBitmap)

    */
        val batmanId=R.drawable.batman
        val aquamanId=R.drawable.aquaman
        val ironmanId=R.drawable.ironman
        val spidermanId=R.drawable.spiderman
        val supermanId=R.drawable.superman

        var SuperKahramanGorselleri= ArrayList <Int>()
        SuperKahramanGorselleri.add(batmanId)
        SuperKahramanGorselleri.add(aquamanId)
        SuperKahramanGorselleri.add(ironmanId)
        SuperKahramanGorselleri.add(spidermanId)
        SuperKahramanGorselleri.add(supermanId)



        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        val adapter=RecyclerAdapter(superKahramanIsimleri,SuperKahramanGorselleri)
        recyclerView.adapter=adapter

    }
}