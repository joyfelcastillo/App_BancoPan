package com.jcastillo.panbankapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class PantallaTresFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pantalla_tres, container, false)
        val bi = view.findViewById<Button>(R.id.invest_button)
        bi.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_principalFragment_to_pantallaDosFragment)
        }
        return view
    }

}