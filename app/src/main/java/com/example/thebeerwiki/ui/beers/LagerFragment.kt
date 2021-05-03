package com.example.thebeerwiki.ui.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
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

        // FOSTERS
        val fostersImage: ImageView = root.findViewById(R.id.fosters_image)
        fostersImage.setImageResource(R.drawable.fosters_image)
        fostersImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_fosters)
        }

        // CARLSBERG
        val carlsbergImage: ImageView = root.findViewById(R.id.carlsberg_image)
        carlsbergImage.setImageResource(R.drawable.carlsberg_image)
        carlsbergImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_carlsberg)
        }


        // PERONI
        val peroniImage: ImageView = root.findViewById(R.id.peroni_image)
        peroniImage.setImageResource(R.drawable.peroni_image)
        peroniImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_peroni)
        }


        // COORS LIGHT
        val coorsLightImage: ImageView = root.findViewById(R.id.coors_light_image)
        coorsLightImage.setImageResource(R.drawable.coors_light_image)
        coorsLightImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_coors_light)
        }


        // STELLA ARTOIS
        val stellaArtoisImage: ImageView = root.findViewById(R.id.stella_artois_image)
        stellaArtoisImage.setImageResource(R.drawable.stella_artois_image)
        stellaArtoisImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_stella_artois)
        }

        return root
    }
}