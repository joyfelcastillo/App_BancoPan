package com.jcastillo.panbankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation


class pantallaPrincipalFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pantalla_principal, container, false)
        val cd = view.findViewById<CardView>(R.id.cardCartao)
        cd.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.pantalla2Fragment)
        }
        return view
    }

}