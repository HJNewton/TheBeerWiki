package com.example.thebeerwiki.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
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

        val carlingsSharedPref = activity?.getSharedPreferences("carlings_drunk", Context.MODE_PRIVATE)

        var carlingsDrunk = carlingsSharedPref?.getInt("carlings_drunk", 0)
        val carlingText: TextView = root.findViewById(R.id.carlings_home)

        if(carlingsDrunk != null)
        {
            carlingText.setText(carlingsSharedPref?.getInt("carlings_drunk", 0).toString())
        }

        val fostersSharedPref = activity?.getSharedPreferences("fosters_drunk", Context.MODE_PRIVATE)

        var fostersDrunk = fostersSharedPref?.getInt("fosters_drunk", 0)
        val fostersText: TextView = root.findViewById(R.id.fosters_home)

        if(fostersDrunk != null)
        {
            fostersText.setText(fostersSharedPref?.getInt("fosters_drunk", 0).toString())
        }

        val carlsbergSharedPref = activity?.getSharedPreferences("carlsberg_drunk", Context.MODE_PRIVATE)

        var carlsbergsDrunk = carlsbergSharedPref?.getInt("carlsberg_drunk", 0)
        val carlsbergText: TextView = root.findViewById(R.id.carlsberg_home)

        if(carlsbergsDrunk != null)
        {
            carlsbergText.setText(carlsbergSharedPref?.getInt("carlsberg_drunk", 0).toString())
        }

        val peroniSharedPref = activity?.getSharedPreferences("peroni_drunk", Context.MODE_PRIVATE)

        var peronisDrunk = peroniSharedPref?.getInt("peroni_drunk", 0)
        val peroniText: TextView = root.findViewById(R.id.peronis_home)

        if(peronisDrunk != null)
        {
            peroniText.setText(peroniSharedPref?.getInt("peroni_drunk", 0).toString())
        }

        val coorsSharedPref = activity?.getSharedPreferences("coors_drunk", Context.MODE_PRIVATE)

        var coorsDrunk = coorsSharedPref?.getInt("coors_drunk", 0)
        val coorsText: TextView = root.findViewById(R.id.coors_home)

        if(coorsDrunk != null)
        {
            coorsText.setText(coorsSharedPref?.getInt("coors_drunk", 0).toString())
        }

        val stellaSharedPref = activity?.getSharedPreferences("stella_drunk", Context.MODE_PRIVATE)

        var stellasDrunk = stellaSharedPref?.getInt("stella_drunk", 0)
        val stellaText: TextView = root.findViewById(R.id.stellas_home)

        if(stellasDrunk != null)
        {
            stellaText.setText(stellaSharedPref?.getInt("stella_drunk", 0).toString())
        }

        return root
    }
}