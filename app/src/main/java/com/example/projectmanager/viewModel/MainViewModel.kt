package com.example.projectmanager.viewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanager.repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {

    constructor(): this(MainRepository())
    fun loadData()=repository.items


}