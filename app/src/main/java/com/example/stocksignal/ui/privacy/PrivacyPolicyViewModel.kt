package com.example.stocksignal.ui.privacy


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class PrivacyPolicyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Privacy Policy Fragment"
    }
    val text: LiveData<String> = _text
}