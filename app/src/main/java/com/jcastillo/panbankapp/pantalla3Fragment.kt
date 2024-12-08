package com.jcastillo.panbankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation


class pantalla3Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pantalla3, container, false)
        val bi = view.findViewById<CardView>(R.id.invest_button)
        bi.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.pantallaPrincipalFragment)
        }
        return view
    }

}