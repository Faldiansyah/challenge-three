package com.cowok.hijrah.challengechapter3

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_words.*

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
        holder.namaWrd.setOnClickListener {
            val searcing = "https://www.google.com/search?q=apa+itu+"
            var intent = Intent(Intent.ACTION_VIEW,
                Uri.parse(searcing+listWord[position].identitasBtn))
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listWord.size
    }
}