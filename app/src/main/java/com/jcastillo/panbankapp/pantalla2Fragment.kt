package com.jcastillo.panbankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import com.jcastillo.panbankapp.R.id.buttonCartao


class pantalla2Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_pantalla2, container, false)
        val bt = view.findViewById<Button>(buttonCartao)
        bt.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.pantalla3Fragment)
        }
        return view
    }

}