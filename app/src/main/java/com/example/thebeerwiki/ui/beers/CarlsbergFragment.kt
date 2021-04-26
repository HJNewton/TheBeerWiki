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

class CarlsbergFragment : Fragment()
{
    private lateinit var carlsbergViewModel: CarlsbergViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        carlsbergViewModel =
            ViewModelProvider(this).get(CarlsbergViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_carlsberg, container, false)

        val carlsbergImage: ImageView = root.findViewById(R.id.carlsberg_image)
        carlsbergImage.setImageResource(R.drawable.carlsberg_image)

        val carlsbergText: TextView = root.findViewById(R.id.carlsberg_trivia_text)
        carlsbergViewModel.aboutText.observe(viewLifecycleOwner, Observer { carlsbergText.text = it })
        
        return root
    }
}