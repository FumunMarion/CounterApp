package com.marion.counterapp.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    private val _isDarkMode = MutableStateFlow(false)
    val isDarkMode: StateFlow<Boolean> = _isDarkMode

    fun increment() {
        _count.value++
    }

    fun decrement() {
        if (_count.value > 0) _count.value--
    }

    fun toggleTheme() {
        _isDarkMode.value = !_isDarkMode.value
    }
}