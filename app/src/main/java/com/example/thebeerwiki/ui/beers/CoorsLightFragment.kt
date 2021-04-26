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

class CoorsLightFragment : Fragment()
{
    private lateinit var coorsLightViewModel: CoorsLightViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        coorsLightViewModel =
            ViewModelProvider(this).get(CoorsLightViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_coors_light, container, false)

        val coorsLightImage: ImageView = root.findViewById(R.id.coors_light_image)
        coorsLightImage.setImageResource(R.drawable.coors_light_image)

        val coorsLightText: TextView = root.findViewById(R.id.coors_light_trivia_text)
        coorsLightViewModel.aboutText.observe(viewLifecycleOwner, Observer { coorsLightText.text = it })
        
        return root
    }
}