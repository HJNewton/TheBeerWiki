package com.example.thebeerwiki.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.thebeerwiki.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val beersButton: ImageButton = root.findViewById(R.id.beerButton)
        beersButton.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_beer)
        }

        val randomButton: ImageButton = root.findViewById(R.id.randomButton)
        randomButton.setOnClickListener()
        {
            val possibleDestinations = listOf(
                R.id.nav_carling,
                R.id.nav_fosters,
                R.id.nav_carlsberg,
                R.id.nav_coors_light,
                R.id.nav_peroni,
                R.id.nav_stella_artois)

                Navigation.findNavController(root).navigate(possibleDestinations.random())
        }

        return root
    }
}