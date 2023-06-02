package com.example.sixthmonthhw_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var count = 0
    private var plus = ""

    val counter = MutableLiveData<String>()
    val transition = MutableLiveData<String>()

    fun increment() {
        count++
        counter.value = count.toString()
        plus = "\n +$plus"
        transition.value = plus
    }

    fun decrement() {
        count--
        counter.value = count.toString()
        plus = "\n -" + plus
        transition.value = plus
    }
}

