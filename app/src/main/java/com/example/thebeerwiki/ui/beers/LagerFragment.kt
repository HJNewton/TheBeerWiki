package com.example.thebeerwiki.ui.beers

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.thebeerwiki.R

class LagerFragment : Fragment()
{
    private lateinit var lagerViewModel: LagerViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        lagerViewModel =
                ViewModelProvider(this).get(LagerViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_lager, container, false)

        // CARLING
        val carlingImage: ImageView = root.findViewById(R.id.carling_image)
        carlingImage.setImageResource(R.drawable.carling_image)
        carlingImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_carling)
        }

        return root
    }
}