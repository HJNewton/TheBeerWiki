package com.example.thebeerwiki.ui.beers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StellaArtoisViewModel : ViewModel()
{
    private val _aboutText = MutableLiveData<String>().apply {
        value = "Fosters was created by two American brothers who moved to Melbourne from  New York." +
                "\n" +
                "\nIt was first exported in 1901 to soldiers fighting in the Boer War." +
                "\n" +
                "\nFosters was first imported into the UK in 1971 and first brewed here 10 years later in 1981." +
                "\n" +
                "\nFosters remains the most popular Australian beer worldwide, however it is not regularly consumed in Australia."
    }
    val aboutText: LiveData<String> = _aboutText
}