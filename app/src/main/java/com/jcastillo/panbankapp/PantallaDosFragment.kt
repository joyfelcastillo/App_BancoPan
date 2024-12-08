package com.jcastillo.panbankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class PantallaDosFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pantalla_dos, container, false)
        val btn = view.findViewById<Button>(R.id.btnCartao)
        btn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.pantallaTresFragment)
        }
        return view
    }

}