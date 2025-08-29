package com.example.projectmanager.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.projectmanager.adapter.OngoingAdapter
import com.example.projectmanager.databinding.ActivityMainBinding
import com.example.projectmanager.viewModel.MainViewModel

class DashBoardActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val ongoingAdapter by lazy { OngoingAdapter(mainViewModel.loadData()) }
            viewOngoing.apply {
                adapter = ongoingAdapter
                layoutManager = GridLayoutManager(this@DashBoardActivity, 2)
            }

            // ✅ Correct intent to ProfileActivity
            profileBtn.setOnClickListener {
                val intent = Intent(this@DashBoardActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
