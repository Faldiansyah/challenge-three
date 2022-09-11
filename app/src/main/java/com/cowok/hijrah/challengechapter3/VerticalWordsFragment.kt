package com.cowok.hijrah.challengechapter3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_vertical_char.*
import kotlinx.android.synthetic.main.fragment_vertical_words.*
import kotlinx.android.synthetic.main.item_words.*

class VerticalWordsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vertical_words, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listWordA = arrayListOf(
            ListData("Awal"), ListData("Angka"),
            ListData("Ampun"), ListData("Akhir"))
        val listWordB = arrayListOf(
            ListData("Bulan"), ListData("Bintang"),
            ListData("Berisik"), ListData("Bukan"))
        val listWordC = arrayListOf(
            ListData("Cemilan"), ListData("Cuka"),
            ListData("Cantik"), ListData("Cerdik"))
        val listWordD = arrayListOf(
            ListData("Delima"), ListData("Durian"),
            ListData("Denah"), ListData("Dunia"))
        val listWordE = arrayListOf(
            ListData("Empati"), ListData("Efisien"),
            ListData("Emosi"), ListData("Edukasi"))
        val listWordF = arrayListOf(
            ListData("Favorit"), ListData("Faqih"),
            ListData("Fakir Miskin"), ListData("Fajar"))
        val listWordG = arrayListOf(
            ListData("Generasi"), ListData("Gesit"),
            ListData("Gigih"), ListData("Gagah"))
        val listWordH = arrayListOf(
            ListData("Hijrah"), ListData("Hafalan"),
            ListData("Hadiah"), ListData("Haji"))
        val listWordI = arrayListOf(
            ListData("Indah"), ListData("Imut"),
            ListData("Ilustrasi"), ListData("Impas"))
        val listWordJ = arrayListOf(
            ListData("Jodoh"), ListData("Jembatan"),
            ListData("Jualan"), ListData("Jaringan"))
        val listWordK = arrayListOf(
            ListData("Kembali"), ListData("Kenangan"),
            ListData("Khitbah"), ListData("Kolaborasi"))
        val listWordL = arrayListOf(
            ListData("Lamaran"), ListData("Laki-laki"),
            ListData("Lari"), ListData("Luka"))
        val listWordM = arrayListOf(
            ListData("Mutiara"), ListData("Mawar"),
            ListData("Manis"), ListData("Melamun"))
        val listWordN = arrayListOf(
            ListData("Nikah"), ListData("Nasihat"),
            ListData("Nyaman"), ListData("Neraka"))
        val listWordO = arrayListOf(
            ListData("Obat"), ListData("Olimpiade"),
            ListData("Orbit"), ListData("Ongkos"))
        val listWordP = arrayListOf(
            ListData("Pelangi"), ListData("Perempuan"),
            ListData("Pintar"), ListData("Percaya"))
        val listWordQ = arrayListOf(
            ListData("Qiamulail"), ListData("Qiraat"),
            ListData("Qabul"), ListData("Qur'an"))
        val listWordR = arrayListOf(
            ListData("Rampasan"), ListData("Rusak"),
            ListData("Rupawan"), ListData("Remaja"))
        val listWordS = arrayListOf(
            ListData("Sakit"), ListData("Sedih"),
            ListData("Susah"), ListData("Sumpek"))
        val listWordT = arrayListOf(
            ListData("Tahan"), ListData("Terpaksa"),
            ListData("Tunangan"), ListData("Terpisah"))
        val listWordU = arrayListOf(
            ListData("Umpan"), ListData("Uang"),
            ListData("Ulangi"), ListData("Usap"))
        val listWordV = arrayListOf(
            ListData("Vulkanik"), ListData("Vitamin"),
            ListData("Vampir"), ListData("Vakum"))
        val listWordW = arrayListOf(
            ListData("Wanita"), ListData("Wawasan"),
            ListData("Wilayah"), ListData("Waspada"))
        val listWordX = arrayListOf(
            ListData("Xerofit"), ListData("Xilografi"),
            ListData("Xerofil"), ListData("Xenomania"))
        val listWordY = arrayListOf(
            ListData("Yayasan"), ListData("Yatim"),
            ListData("Yakin"), ListData("Yuwana"))
        val listWordZ = arrayListOf(
            ListData("Ziarah"), ListData("Zikir"),
            ListData("Zionis"), ListData("Zaman"))

        var getBtn = arguments?.getSerializable("dataBtn") as ListData
        var data = getBtn.identitasBtn

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter = if (data == "A"){
            WordAdapter(listWordA)
        } else if (data == "B"){
            WordAdapter(listWordB)
        } else if (data == "C"){
            WordAdapter(listWordC)
        } else if (data == "D"){
            WordAdapter(listWordD)
        } else if (data == "E"){
            WordAdapter(listWordE)
        } else if (data == "F"){
            WordAdapter(listWordF)
        } else if (data == "G"){
            WordAdapter(listWordG)
        } else if (data == "H"){
            WordAdapter(listWordH)
        } else if (data == "I"){
            WordAdapter(listWordI)
        } else if (data == "J"){
            WordAdapter(listWordJ)
        } else if (data == "K"){
            WordAdapter(listWordK)
        } else if (data == "L"){
            WordAdapter(listWordL)
        } else if (data == "M"){
            WordAdapter(listWordM)
        } else if (data == "N"){
            WordAdapter(listWordN)
        } else if (data == "O"){
            WordAdapter(listWordO)
        } else if (data == "P"){
            WordAdapter(listWordP)
        } else if (data == "Q"){
            WordAdapter(listWordQ)
        } else if (data == "R"){
            WordAdapter(listWordR)
        } else if (data == "S"){
            WordAdapter(listWordS)
        } else if (data == "T"){
            WordAdapter(listWordT)
        } else if (data == "U"){
            WordAdapter(listWordU)
        } else if (data == "V"){
            WordAdapter(listWordV)
        } else if (data == "W"){
            WordAdapter(listWordW)
        } else if (data == "X"){
            WordAdapter(listWordX)
        } else if (data == "Y"){
            WordAdapter(listWordY)
        } else {
            WordAdapter(listWordZ)
        }

        recyclerViewWord.adapter = adapter
        recyclerViewWord.layoutManager = layoutManager
        val searcing = "https://www.google.com/search?q=apa+itu+"

        adapter.onClick2 = {
            var dataBtn = namaWord.text.toString()
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(searcing+dataBtn))
            startActivity(intent)
        }

    }
}