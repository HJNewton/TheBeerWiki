package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PeroniViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Peroni Nastro Azzuro is the full name of the beer commonly referred to as 'Peroni' in the UK." +
                "\n" +
                "\nThe name means 'Blue Ribbon' in Italian." +
                "\n" +
                "\nNastro Azzuro has sponsored teams in Grand Prix motorcycle racing, sponsoring Valentino Rossi in 1997 who went on to win the championship that season." +
                "\n" +
                "\nThe Peroni company was first formed in 1846."
    }
    val aboutText: LiveData<String> = _aboutText
}