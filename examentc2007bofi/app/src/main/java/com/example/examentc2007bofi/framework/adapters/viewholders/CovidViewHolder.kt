package com.example.secondrecycleview.framework.adapters.viewholders

import android.graphics.Color
import android.os.Build
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.databinding.ItemCovidDataBinding
import java.time.LocalDate

class CovidDataViewHolder(private val binding: ItemCovidDataBinding, private val average: Double) :
    RecyclerView.ViewHolder(binding.root) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun render(covidData: CovidData) {
        binding.tvCovidDataName.text = covidData.region
        binding.tvCountry.text = covidData.country
        binding.tvNewCases.text =  LocalDate.now().toString()

        val totalCases = covidData.cases.values.sumOf { it.total }
        when {
            totalCases < average * 0.8 -> binding.root.setBackgroundColor(Color.RED)
            totalCases.toDouble() in (average * 0.8)..(average * 1.2) -> binding.root.setBackgroundColor(Color.YELLOW) // Cerca
            totalCases > average * 1.2 -> binding.root.setBackgroundColor(Color.GREEN)
        }

        binding.root.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "Región: ${covidData.region}\nTotal de casos: $totalCases",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
