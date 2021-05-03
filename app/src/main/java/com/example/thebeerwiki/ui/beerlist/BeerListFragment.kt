package com.example.thebeerwiki.ui.beerlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.thebeerwiki.R

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

        return root
    }
}