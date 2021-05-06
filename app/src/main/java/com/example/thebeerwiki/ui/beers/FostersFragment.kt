package com.example.thebeerwiki.ui.beers

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.example.thebeerwiki.R

class FostersFragment : Fragment()
{
    private lateinit var fostersViewModel: FostersViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fostersViewModel =
            ViewModelProvider(this).get(FostersViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fosters, container, false)

        val sharedPref = activity?.getSharedPreferences("fosters_drunk", Context.MODE_PRIVATE)
        var drunk = sharedPref?.getInt("fosters_drunk", 0)

        val drunk_text: TextView = root.findViewById(R.id.fosters_drunk_text)
        drunk_text.setText(sharedPref?.getInt("fosters_drunk", 0).toString())

        val carlingPlusButton: Button = root.findViewById(R.id.plus_fosters)

        carlingPlusButton.setOnClickListener()
        {
            if (drunk != null)
            {
                drunk = drunk!! + 1
                sharedPref?.edit()?.putInt("fosters_drunk", drunk!!)?.apply()
                drunk_text.setText(sharedPref?.getInt("fosters_drunk", 0).toString())
            }
        }
        
        return root
    }
}