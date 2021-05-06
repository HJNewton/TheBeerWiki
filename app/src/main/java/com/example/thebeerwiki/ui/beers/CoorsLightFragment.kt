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

class CoorsLightFragment : Fragment()
{
    private lateinit var coorsLightViewModel: CoorsLightViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        coorsLightViewModel =
            ViewModelProvider(this).get(CoorsLightViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_coors_light, container, false)

        val sharedPref = activity?.getSharedPreferences("coors_drunk", Context.MODE_PRIVATE)
        var drunk = sharedPref?.getInt("coors_drunk", 0)

        val drunk_text: TextView = root.findViewById(R.id.coors_drunk_text)
        drunk_text.setText(sharedPref?.getInt("coors_drunk", 0).toString())

        val carlingPlusButton: Button = root.findViewById(R.id.plus_coors)

        carlingPlusButton.setOnClickListener()
        {
            if (drunk != null)
            {
                drunk = drunk!! + 1
                sharedPref?.edit()?.putInt("coors_drunk", drunk!!)?.apply()
                drunk_text.setText(sharedPref?.getInt("coors_drunk", 0).toString())
            }
        }
        
        return root
    }
}