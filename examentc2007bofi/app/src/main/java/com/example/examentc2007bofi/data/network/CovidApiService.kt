package com.example.secondrecycleview.data.network

import com.example.secondrecycleview.CovidDataProvider
import com.example.secondrecycleview.data.network.model.CovidData

class CovidDataApiService {

    // It simulates that we have an Api
    suspend fun getCovidData(): List<CovidData> {
        return CovidDataProvider.covidDataList
    }
}
