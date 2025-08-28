package com.example.projectmanager.viewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanager.repository.MainRepository
import com.example.projectmanager.repository.ProfileRepository
import com.example.projectmanager.viewModel.MainViewModel

class ProfileViewModel(val repository: ProfileRepository):ViewModel() {

    constructor(): this(ProfileRepository())
    fun loadDataMyteam()=repository.myteamItems
    fun loadDataArchive()=repository.archiveItems


}