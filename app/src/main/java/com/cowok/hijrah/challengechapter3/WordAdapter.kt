package com.cowok.hijrah.challengechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(val listWord: ArrayList<ListData>)
    : RecyclerView.Adapter<WordAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var namaWrd = itemView.findViewById<Button>(R.id.namaWord)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_words, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaWrd.text = listWord[position].identitasBtn
    }

    override fun getItemCount(): Int {
        return listWord.size
    }
}