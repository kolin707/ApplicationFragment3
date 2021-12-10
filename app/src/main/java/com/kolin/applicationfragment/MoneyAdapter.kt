package com.kolin.applicationfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoneyAdapter (private val MoneyNames:List<String>): RecyclerView.Adapter<MoneyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoneyViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.aboutmoney_list_item,parent,false)
        return MoneyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MoneyViewHolder, position: Int) {
        val name=MoneyNames[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return MoneyNames.size
    }
}