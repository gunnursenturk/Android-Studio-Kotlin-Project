package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_deneme.view.*

class RecyclerAdapter(val kahramanListesi : ArrayList<String>, val kahramanGorseli :ArrayList<Int>)
    :RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>(){
    class SuperKahramanVH(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.row_deneme,parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.itemView.TextViewRecycler.text=kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val deneme=Intent(holder.itemView.context,DigerAktivity::class.java)
            deneme.putExtra("KahramanIsmi",kahramanListesi.get(position))
            deneme.putExtra("KahramanGorseli",kahramanGorseli.get(position))
          /*  val singleton=SingletonClass.SecilenKahraman
            singleton.gorsel=kahramanGorseli.get(position)*/
            holder.itemView.context.startActivity(deneme)

        }
    }

    override fun getItemCount(): Int {
            return kahramanListesi.size
    }
}