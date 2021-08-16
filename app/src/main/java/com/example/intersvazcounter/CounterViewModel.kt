package com.example.intersvazcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count: MutableLiveData<Int> = MutableLiveData(0)
    val count: LiveData<Int> get() = _count

    fun increment() {
        var privious = _count.value
        _count.value = privious?.plus(1)
    }
}