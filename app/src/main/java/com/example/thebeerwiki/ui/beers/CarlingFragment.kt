package com.example.thebeerwiki.ui.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.example.thebeerwiki.R

class CarlingFragment : Fragment()
{
    private lateinit var carlingViewModel: CarlingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        carlingViewModel =
            ViewModelProvider(this).get(CarlingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_carling, container, false)

        // CARLING
        val carlingImage: ImageView = root.findViewById(R.id.carling_image)
        carlingImage.setImageResource(R.drawable.carling_image)

        val carlingText: TextView = root.findViewById(R.id.carling_trivia_text)
        carlingViewModel.aboutText.observe(viewLifecycleOwner, Observer { carlingText.text = it })

        return root
    }
}