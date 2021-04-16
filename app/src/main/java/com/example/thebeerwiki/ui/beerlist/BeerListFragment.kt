package com.example.thebeerwiki.ui.beerlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.thebeerwiki.R
import org.w3c.dom.Text

class BeerListFragment : Fragment() {

    private lateinit var beerListViewModel: BeerListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        beerListViewModel =
                ViewModelProvider(this).get(BeerListViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_beer_list, container, false)


        // LAGER
        val lagerImage: ImageView = root.findViewById(R.id.lager_image)
        lagerImage.setImageResource(R.drawable.lager_image)
        lagerImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_lager)
        }

        // ALE
        val aleImage: ImageView = root.findViewById(R.id.ale_image)
        aleImage.setImageResource(R.drawable.ale_image)
        aleImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_ale)
        }

        // STOUT
        val stoutImage: ImageView = root.findViewById(R.id.stout_image)
        stoutImage.setImageResource(R.drawable.stout_image)
        stoutImage.setOnClickListener()
        {
            Navigation.findNavController(root).navigate(R.id.nav_stout)
        }

        return root
    }
}