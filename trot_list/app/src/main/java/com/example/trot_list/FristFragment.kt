package com.example.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class FristFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frist, container, false);

        val btn2 = view.findViewById<Button>(R.id.btn2);
        btn2.setOnClickListener {
            it.findNavController().navigate(R.id.action_fristFragment_to_secondFragment)
        }

        val btn3 = view.findViewById<Button>(R.id.btn3);
        btn3.setOnClickListener {
            it.findNavController().navigate(R.id.action_fristFragment_to_thirdFragment)
        }

        return view
    }
}