package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarlingViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Carling was first introduced to the U.K in 1952 under the name: Carling Black Label as a bottle-only beer. " +
                "\n" +
                "\nIt was first offered on draught in The Hill Top, Sheffield in 1965." +
                "\n" +
                "\nSince 1985, Carling has been the best selling beer throughout the entirety of Britain" +
                "\n" +
                "\nIn 1997 the name 'Black Label' was no longer used in Britain, however it is still known as such in Canada and South Africa."
    }
    val aboutText: LiveData<String> = _aboutText
}