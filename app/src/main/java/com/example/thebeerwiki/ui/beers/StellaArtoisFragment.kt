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

class StellaArtoisFragment : Fragment()
{
    private lateinit var stellaArtoisViewModel: StellaArtoisViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        stellaArtoisViewModel =
            ViewModelProvider(this).get(StellaArtoisViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_stella_artois, container, false)

        val stellaArtoisImage: ImageView = root.findViewById(R.id.stella_artois_image)
        stellaArtoisImage.setImageResource(R.drawable.stella_artois_image)

        val stellaArtoisText: TextView = root.findViewById(R.id.stella_artois_trivia_text)
        stellaArtoisViewModel.aboutText.observe(viewLifecycleOwner, Observer { stellaArtoisText.text = it })
        
        return root
    }
}