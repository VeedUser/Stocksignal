package com.example.stocksignal.ui.disclaimer


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class DisclaimerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is DisclaimerFragment"
    }
    val text: LiveData<String> = _text

}