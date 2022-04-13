package com.example.stocksignal.ui.signal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is signal Fragment"
    }
    val text: LiveData<String> = _text
}