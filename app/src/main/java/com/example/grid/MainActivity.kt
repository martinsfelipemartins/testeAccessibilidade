package com.example.grid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        setRecycler()
    }

    fun setRecycler(){
        val arrayList = ArrayList<Items>()
        val item1 = Items("mussarela", "assada")
        val item2 = Items("pan", "frita")
        val item3 = Items("veg", "assada")
        val item4 = Items("calabra", "crua")
        arrayList.add(item1)
        arrayList.add(item2)
        arrayList.add(item3)
        arrayList.add(item4)
        val adapter = AdapterGrid(arrayList)
        val layoutManager= GridLayoutManager(this, 2)
        val recuclerview = recycler as RecyclerView
        recuclerview.adapter = adapter
        recuclerview.layoutManager = layoutManager

    }
}