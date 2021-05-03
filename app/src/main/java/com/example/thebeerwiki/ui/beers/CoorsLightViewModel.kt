package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CoorsLightViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Molson Coors, the brewer that owns Coors Light, is the world's sixth-largest brewer." +
                "\n" +
                "\nIn 2005, Coors Light was awarded a silver medal in the Great American Beer Festival in the American-Style Light Lager catergory." +
                "\n" +
                "\nCoors Light became the Official Beer of NASCAR in 2008, succeeding Budweiser." +
                "\n" +
                "\nIn 2011 the company signed a $375m deal with the National Hockey League."
    }
    val aboutText: LiveData<String> = _aboutText
}