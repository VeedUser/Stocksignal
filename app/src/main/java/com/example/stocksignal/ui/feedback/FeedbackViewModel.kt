package com.example.stocksignal.ui.feedback


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class FeedbackViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is FeedbackFragment"
    }
    val text: LiveData<String> = _text
}