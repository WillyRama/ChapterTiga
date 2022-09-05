package com.willyramad.chaptertiga.topicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.fragment_tiga2.*

class FragmentTiga : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnpindah3.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentTiga_to_fragmentSatu)
        }
        //ambildata
        var ambildata = arguments?.getString("dataumur")
        //set data umur dalam textview
        text3.text = ambildata

        //menampilkam text popup
        Toast.makeText(context,"$ambildata Hollo",Toast.LENGTH_SHORT).show()

    }
}