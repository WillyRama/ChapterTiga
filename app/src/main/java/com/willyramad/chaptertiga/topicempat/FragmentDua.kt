package com.willyramad.chaptertiga.topicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.fragment_dua2.*

class FragmentDua : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnpindah2.setOnClickListener{
            var dataumur = edumur.text.toString()
            var bund = Bundle()
            bund.putString("dataumur",dataumur)
            Navigation.findNavController(view).navigate(R.id.action_fragmentDua_to_fragmentTiga, bund)
        }
    }
}