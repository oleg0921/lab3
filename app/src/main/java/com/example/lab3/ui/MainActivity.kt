package com.example.lab3.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.databinding.ActivityMainBinding
import com.example.lab3.ui.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        recyclerView = binding.userListRecyclerView
        itemAdapter = ItemAdapter()
        onChangeListener()
        initRcView()
    }

    @SuppressLint("SetTextI18n")
    private fun onChangeListener() {
        viewModel.loadUserList()
        viewModel.users.observe(this) {
            itemAdapter.setList(it)
            binding.countItem.text = "List: " + it.size.toString()
        }
    }

    private fun initRcView() = with(binding) {
        recyclerView.layoutManager = LinearLayoutManager(root.context)
        recyclerView.adapter = itemAdapter
    }
}