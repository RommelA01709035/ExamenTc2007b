package com.example.secondrecycleview.framework.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondrecycleview.CovidDataProvider
import com.example.secondrecycleview.CovidDataProvider.Companion.covidDataList
import com.example.secondrecycleview.framework.adapters.CovidDataAdapter
import com.example.secondrecycleview.databinding.ActivityMainBinding
import com.example.secondrecycleview.utils.CellDecoration

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CovidDataAdapter
    private var isSorted = false
    private var average: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        average = calculateAverage()
        initRecyclerView(average)
        setupButtons()


        val adapter = CovidDataAdapter(covidDataList, average)
        binding.recycleCovidData.layoutManager =GridLayoutManager(this, 2)
        binding.recycleCovidData.adapter = adapter

        binding.recycleCovidData.addItemDecoration(CellDecoration())
    }

    private fun calculateAverage(): Double {
        val totalCases = CovidDataProvider.covidDataList.flatMap { it.cases.values }.sumOf { it.total }
        val numberOfCases = CovidDataProvider.covidDataList.flatMap { it.cases.values }.size
        return if (numberOfCases > 0) totalCases.toDouble() / numberOfCases else 0.0
    }

    private fun initRecyclerView(average: Double) {
        adapter = CovidDataAdapter(CovidDataProvider.covidDataList, average)
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

            adapter = CovidDataAdapter(CovidDataProvider.covidDataList, average)
            binding.recycleCovidData.adapter = adapter
            isSorted = false
        } else {
            val sortedList = CovidDataProvider.covidDataList.sortedBy { it.region }
            adapter = CovidDataAdapter(sortedList, average)
            binding.recycleCovidData.adapter = adapter
            isSorted = true
        }
    }
}

