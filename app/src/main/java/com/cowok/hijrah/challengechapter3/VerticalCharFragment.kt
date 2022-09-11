package com.cowok.hijrah.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_vertical_char.*
import kotlinx.android.synthetic.main.item_button.*

class VerticalCharFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vertical_char, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listChar = arrayListOf(
            ListData("A"), ListData("B"), ListData("C"),
            ListData("D"), ListData("E"), ListData("F"),
            ListData("G"), ListData("H"), ListData("I"),
            ListData("J"), ListData("K"), ListData("L"),
            ListData("M"), ListData("N"), ListData("O"),
            ListData("P"), ListData("Q"), ListData("R"),
            ListData("S"), ListData("T"), ListData("U"),
            ListData("V"), ListData("W"), ListData("X"),
            ListData("Y"), ListData("Z")
        )

        val adapter = ButtonAdapter(listChar)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        recyclerViewChar.layoutManager = layoutManager
        recyclerViewChar.adapter = adapter

        adapter.onClick = {
            var dataButton = namaButton.text.toString()
            var bund = Bundle()
            bund.putString("dataBtn", dataButton)

            Navigation.findNavController(view)
                .navigate(R.id.action_verticalCharFragment_to_verticalWordsFragment, bund)
        }

    }

}