package com.example.thebeerwiki.ui.beers

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.thebeerwiki.R
import org.w3c.dom.Text

class CarlingFragment : Fragment()
{
    private lateinit var carlingViewModel: CarlingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        carlingViewModel =
            ViewModelProvider(this).get(CarlingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_carling, container, false)

        val sharedPref = activity?.getSharedPreferences("carlings_drunk", Context.MODE_PRIVATE)
        var drunk = sharedPref?.getInt("carlings_drunk", 0)

        val drunk_text: TextView = root.findViewById(R.id.carlings_drunk_text)
        drunk_text.setText(sharedPref?.getInt("carlings_drunk", 0).toString())

        val carlingPlusButton: Button = root.findViewById(R.id.plus_carling)

        carlingPlusButton.setOnClickListener()
        {
            if (drunk != null)
            {
                drunk = drunk!! + 1
                sharedPref?.edit()?.putInt("carlings_drunk", drunk!!)?.apply()
                drunk_text.setText(sharedPref?.getInt("carlings_drunk", 0).toString())
            }
        }

        return root
    }
}