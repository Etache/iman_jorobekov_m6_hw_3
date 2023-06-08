package com.example.m6_hw_3

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel {

    private var count = 0
    private var plus = ""

    val counter = MediatorLiveData<String>()
    val operation = MediatorLiveData<String>()

    fun increment(){
        ++count
        counter.value = count.toString()
        plus = "\n +$plus"
        operation.value = plus
    }

    fun decrement(){
        --count
        counter.value = count.toString()
        plus = "\n -$plus"
        operation.value = plus
    }

}