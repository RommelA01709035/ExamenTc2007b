package com.example.secondrecycleview.data.network.model

data class CovidData(
    val country: String,
    val region: String,
    val cases: Map<String, CaseDetails>
)
