package com.example.secondrecycleview.data.network

import com.example.secondrecycleview.data.network.model.CovidData
import retrofit2.http.GET
import retrofit2.http.Path

interface CovidDataApiService {

    @GET("{id}")
    suspend fun getCovidDataById(@Path("id") id: Int): CovidData
}

