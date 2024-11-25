package com.example.secondrecycleview

import com.example.secondrecycleview.data.network.model.CaseDetails
import com.example.secondrecycleview.data.network.model.CovidData

class CovidDataProvider {
    companion object {
        val covidDataList: List<CovidData> = listOf(
            CovidData(
                country = "Canada",
                region = "Alberta",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 0, new = 0),
                    "2020-01-23" to CaseDetails(total = 0, new = 0),
                    "2020-01-24" to CaseDetails(total = 0, new = 0),
                    "2020-01-25" to CaseDetails(total = 0, new = 0),
                    "2020-01-26" to CaseDetails(total = 0, new = 0)

                )
            ),
            CovidData(
                country = "Canada",
                region = "British Columbia",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 0, new = 0),
                    "2020-01-23" to CaseDetails(total = 0, new = 0),
                    "2020-01-24" to CaseDetails(total = 0, new = 0),
                    "2020-01-25" to CaseDetails(total = 0, new = 0),
                    "2020-01-26" to CaseDetails(total = 0, new = 0)

                )
            )

        )
    }
}
