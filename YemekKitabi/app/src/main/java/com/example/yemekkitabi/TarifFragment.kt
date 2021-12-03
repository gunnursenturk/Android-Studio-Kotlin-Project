package com.example.yemekkitabi

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_tarif.*


class TarifFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener({
            kaydet(it)

        })
        imageView.setOnClickListener({
            gorselSec(it)
        })

    }
    fun kaydet(view: View)
    {//SQL kaydetme
        println("tıklandı")
    }
    fun gorselSec(view: View)
    {//println("gorsel tıklandı")
        activity?.let {
            if(ContextCompat.checkSelfPermission(it.applicationContext.applicationContext, Manifest.permission.READ_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED)
            {
                //context compat versiyonlar arası uyumsuzluğu gidermek için kullanılır
                //checkself iznimizi kontrol ediyoruz
                //it.application context belirledik hangi izni kontrol ettiğimize baktık
                //izin verilmiyorsa izin istememiz gerekir
                requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)

            }else{
                //izin berilmiş tekrar istemeye gerek yok
                val galeriIntent= Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivityForResult(galeriIntent,2)
            }
        }

    }
}