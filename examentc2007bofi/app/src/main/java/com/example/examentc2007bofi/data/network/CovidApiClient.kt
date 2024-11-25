package com.example.secondrecycleview.data.network

import com.example.secondrecycleview.data.network.model.CovidData

class CovidDataApiClient() {
    private lateinit var apiService: CovidDataApiService

    suspend fun getCovidDataById(id: Int): CovidData? {
        return try {
            apiService.getCovidDataById(id)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}