package com.example.secondrecycleview.domain


import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.data.CovidDataRepository

class CovidDataeRequirement() {
    private val repository =  CovidDataRepository()

    suspend operator fun invoke() : List<CovidData>? {
        return repository.getCovidData()
    }
}

