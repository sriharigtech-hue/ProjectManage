package com.example.projectmanager.repository

import com.example.projectmanager.domain.TeamDomain

class ProfileRepository {
    val myteamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food app Application", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project in Progress"),
        TeamDomain("Kotlin Developers", "Project in Progress"),
        TeamDomain("Food app Application", "Project in Progress"),



    )
    val archiveItems: MutableList<String> = mutableListOf("UI/UX Screenshot","Kotlin Source code ","Source code")





}