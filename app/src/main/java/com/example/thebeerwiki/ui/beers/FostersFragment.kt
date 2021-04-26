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

class FostersFragment : Fragment()
{
    private lateinit var fostersViewModel: FostersViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fostersViewModel =
            ViewModelProvider(this).get(FostersViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fosters, container, false)

        val fostersImage: ImageView = root.findViewById(R.id.fosters_image)
        fostersImage.setImageResource(R.drawable.fosters_image)

        val fostersText: TextView = root.findViewById(R.id.fosters_trivia_text)
        fostersViewModel.aboutText.observe(viewLifecycleOwner, Observer { fostersText.text = it })
        
        return root
    }
}