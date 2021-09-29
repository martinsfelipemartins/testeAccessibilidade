package com.example.grid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemgrid.view.*

class AdapterGrid(private val list: List<Items>) : RecyclerView.Adapter<AdapterGrid.GridHolder>() {

    class GridHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var pizza: TextView = itemview.texto1
        var batata: TextView = itemview.texto2

        fun bind(item: Items) {
            pizza.text = item.pizza
            batata.text = item.batata
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGrid.GridHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemgrid, parent, false)

        return GridHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterGrid.GridHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}