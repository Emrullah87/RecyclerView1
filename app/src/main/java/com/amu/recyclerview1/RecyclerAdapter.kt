package com.amu.recyclerview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //Für die Daten
    private var titles = arrayOf(
        "Chapter one", "Chapter two", "Chapter three",
        "Chapter four", "Chapter five", "Chapter six", "Chapter seven",
        "Chapter eight", "Chapter nine", "Chapter ten"
    )

    private var details = arrayOf(
        "Details for chapter one", "Details for chapter two",
        "Details for chapter three", "Details for chapter four", "Details for chapter five",
        "Details for chapter six", "Details for chapter seven", "Details for chapter eight",
        "Details for chapter nine", "Details for chapter ten"
    )

    private var images = intArrayOf(
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro,
        R.drawable.andro
    )

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
        //Es befüllt die Daten in die einzelnen UI-Elemente, die wir im ViewHolder definiert haben.
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    //Hier wird die Anzahl der Elemente in der RecyclerView zurückgegeben. Wie viele Elemente wir haben für den Holder
    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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