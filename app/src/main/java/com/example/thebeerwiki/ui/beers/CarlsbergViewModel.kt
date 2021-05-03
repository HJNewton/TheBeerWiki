package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarlsbergViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Carlsberg was first brewed in 1904 by Carl Jacobsen, son of Carlsberg's founder JC Jacobsen." +
                "\n" +
                "\nCarlsberg Group maintains a 155 brand portfolio, with Carlsberg Danish Pilsner as its primary product. " +
                "\n" +
                "\nThe iconic logo has remained unchanged since 1904." +
                "\n" +
                "\nCarlsberg Danish Pilsner is exported to 140 countries worldwide. "
    }
    val aboutText: LiveData<String> = _aboutText
}