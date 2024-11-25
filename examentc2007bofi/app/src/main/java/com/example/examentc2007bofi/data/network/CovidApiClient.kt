package com.example.secondrecycleview.data.network

import com.example.secondrecycleview.data.network.model.CovidData

class CovidDataApiClient() {
    private lateinit var apiService: CovidDataApiService

    suspend fun getCovidData(): List<CovidData>? {
        return try {
            val data = apiService.getCovidData()
            data
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}