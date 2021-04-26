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

class PeroniFragment : Fragment()
{
    private lateinit var peroniViewModel: PeroniViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        peroniViewModel =
            ViewModelProvider(this).get(PeroniViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_peroni, container, false)

        val peroniImage: ImageView = root.findViewById(R.id.peroni_image)
        peroniImage.setImageResource(R.drawable.peroni_image)

        val peroniText: TextView = root.findViewById(R.id.peroni_trivia_text)
        peroniViewModel.aboutText.observe(viewLifecycleOwner, Observer { peroniText.text = it })
        
        return root
    }
}