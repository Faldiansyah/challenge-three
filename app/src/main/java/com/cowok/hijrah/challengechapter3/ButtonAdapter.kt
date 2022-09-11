package com.cowok.hijrah.challengechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class ButtonAdapter(val listChar: ArrayList<ListData>)
    : RecyclerView.Adapter<ButtonAdapter.ViewHolder>(){

    var onClick: ((ListData) -> Unit)? = null

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var namaBtn = itemView.findViewById<Button>(R.id.namaButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_button, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaBtn.text = listChar[position].identitasBtn
        holder.namaBtn.setOnClickListener {
            onClick?.invoke(listChar[position])
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }
}