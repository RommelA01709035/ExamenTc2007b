package com.example.secondrecycleview.data

import com.example.secondrecycleview.data.network.CovidDataApiClient
import com.example.secondrecycleview.data.network.model.CovidData

class CovidDataRepository() {
    private val apiClient = CovidDataApiClient()
    suspend fun getCovidData(): List<CovidData>? {
        return apiClient.getCovidData()
    }
}