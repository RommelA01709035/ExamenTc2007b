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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val average = calculateAverage()

        initRecyclerView(average)
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
}
