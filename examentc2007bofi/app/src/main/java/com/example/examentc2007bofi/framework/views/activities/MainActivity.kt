package com.example.secondrecycleview.framework.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.secondrecycleview.CovidDataProvider
import com.example.secondrecycleview.framework.adapters.CovidDataAdapter
import com.example.secondrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CovidDataAdapter
    private var isSorted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        setupButtons()
    }

    private fun initRecyclerView() {
        adapter = CovidDataAdapter(CovidDataProvider.covidDataList)
        binding.recycleCovidData.layoutManager = GridLayoutManager(this, 2) // Grid con 2 columnas
        binding.recycleCovidData.adapter = adapter
    }

    private fun setupButtons() {

        binding.btnSortAlphabetically.setOnClickListener {
            toggleSort()
        }
    }

    private fun toggleSort() {
        if (isSorted) {
            adapter = CovidDataAdapter(CovidDataProvider.covidDataList)
            binding.recycleCovidData.adapter = adapter
            isSorted = false
        } else {
            val sortedList = CovidDataProvider.covidDataList.sortedBy { it.region }
            adapter = CovidDataAdapter(sortedList)
            binding.recycleCovidData.adapter = adapter
            isSorted = true
        }
    }
}
