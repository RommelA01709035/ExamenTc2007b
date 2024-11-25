package com.example.secondrecycleview.domain


import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.data.CovidDataRepository

class CovidDataeRequirement(private val repository: CovidDataRepository) {

    suspend fun getCovidDataById(id: Int): CovidData? {
        return repository.getCovidDataById(id)
    }
}

