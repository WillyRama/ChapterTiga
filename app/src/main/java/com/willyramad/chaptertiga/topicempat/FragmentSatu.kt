package com.willyramad.chaptertiga.topicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.fragment_satu2.*

class FragmentSatu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnpindah1.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentHome)
        }
        btnlupapass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentTiga)
        }
        chat.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_fragmentDua2)
        }
        help.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_helpFragment)
        }
        btnregister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSatu_to_registerFragment)
        }
    }
}