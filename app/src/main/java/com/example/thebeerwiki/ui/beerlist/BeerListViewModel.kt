package com.example.thebeerwiki.ui.beerlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeerListViewModel : ViewModel()
{
    private val _lagerText = MutableLiveData<String>().apply {
        value = "A lager is a type of beer that is conditioned at a low temperature. They can be pale, amber or dark."
    }
    val lagerText: LiveData<String> = _lagerText
}