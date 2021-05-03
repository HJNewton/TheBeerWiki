package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StellaArtoisViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Stella Artois was originally launched as a Christmas beer, named after the Christmas star." +
                "\n" +
                "\nBy 1960, after a break in production during World War 2, about 100 million gallons of Stella Artois were being produced per year." +
                "\n" +
                "\n1976 was the first year Stella Artois was brewed under contract in the UK." +
                "\n" +
                "\nIn 2020, AB InBev, the brewer of Stella Artois, reduced the alcohol content of Stella Artois from 5.2% to 4.6%; a move that proved controversial amongst consumers."
    }
    val aboutText: LiveData<String> = _aboutText
}