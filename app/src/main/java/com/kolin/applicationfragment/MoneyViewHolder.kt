package com.kolin.applicationfragment

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoneyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

    private val aboutmoneyNameTextView: TextView =
        itemView.findViewById(R.id.about_money_name_view)

    fun bind (name: String){
        aboutmoneyNameTextView.text = name
    }


}