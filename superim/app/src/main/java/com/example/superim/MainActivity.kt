package com.example.superim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun firstFragment(view: View)
    {
        val fragmentManager=supportFragmentManager
        //Fragmana erişmek için kullanılır
        val fragmentTransaction=fragmentManager.beginTransaction()
        //Yapacağımız işlemleri başlatmak için kullanılır

        val firstFragment=BlankFragment()
        //Fragmanı oluşturuyoruz obje oluşturduk
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()
        //fragmanı ekler
    }
    fun secondFragment(view:View)
    {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()

        val secondFragment=BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()

    }
}