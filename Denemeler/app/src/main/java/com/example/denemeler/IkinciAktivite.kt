package com.example.denemeler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*
import kotlinx.android.synthetic.main.activity_main.*

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)
        object : CountDownTimer(15000,1000){
            override fun onFinish() {
                textView4.text="Kalan:0"
            }

            override fun onTick(millisUntilFinished: Long) {
                textView4.text="Kalan:${millisUntilFinished/1000}"

            }
        }.start()
    }
}
