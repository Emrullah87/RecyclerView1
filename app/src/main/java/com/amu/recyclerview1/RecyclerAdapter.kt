package com.amu.recyclerview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //Was genau passiert hier?
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        //Hier werden die einzelnen UI-Elemente für die RecyclerView erstellt.
        //Das LayoutInflater-Objekt wird verwendet, um das XML-Layout in ein View-Objekt zu konvertieren.
        //Es ist nur die Hülle der Elemente ohne Daten.
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    //Für unsere Daten. Dafür müssen wir die Datenquelle definieren, z.B. eine Liste von Objekten.
    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init { //Bei jeder Initialisierung des ViewHolder wird dieser Code ausgeführt.
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

}