package com.example.projectmanager.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectmanager.adapter.MyTeamAdapter
import com.example.projectmanager.adapter.ArchiveAdapter
import com.example.projectmanager.databinding.ActivityProfileBinding

import com.example.projectmanager.viewModel.ProfileViewModel


class ProfileActivity : AppCompatActivity() {

     lateinit var binding: ActivityProfileBinding
     val ProfileViewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            // Team Adapter setup
            val myTeamAdapter = MyTeamAdapter(ProfileViewModel.loadDataMyteam())
            viewTeam.apply {
                adapter = myTeamAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }

            // Archive Adapter setup
            val archiveAdapter = ArchiveAdapter(ProfileViewModel.loadDataArchive())
            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.HORIZONTAL ,
                    false
                )
            }
        }
    }
}
