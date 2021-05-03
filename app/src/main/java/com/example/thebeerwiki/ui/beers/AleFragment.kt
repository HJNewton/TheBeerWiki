package com.example.thebeerwiki.ui.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.thebeerwiki.R

class AleFragment : Fragment() {

    private lateinit var aleViewModel: AleViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        aleViewModel =
                ViewModelProvider(this).get(AleViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contact, container, false)

        return root
    }
}