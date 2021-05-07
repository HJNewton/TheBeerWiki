package com.example.thebeerwiki.ui.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.thebeerwiki.R

class ContactFragment : Fragment() {

    private lateinit var contactViewModel: ContactViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        contactViewModel =
                ViewModelProvider(this).get(ContactViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contact, container, false)

        return root
    }
}