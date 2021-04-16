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

class StoutFragment : Fragment()
{
    private lateinit var stoutViewModel: StoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        stoutViewModel =
            ViewModelProvider(this).get(StoutViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_stout, container, false)

        return root
    }
}