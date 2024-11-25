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
                    "2020-01-22" to CaseDetails(total = 10, new = 2),
                    "2020-01-23" to CaseDetails(total = 15, new = 5),
                    "2020-01-24" to CaseDetails(total = 25, new = 10),
                    "2020-01-25" to CaseDetails(total = 30, new = 5),
                    "2020-01-26" to CaseDetails(total = 35, new = 5)
                )
            ),
            CovidData(
                country = "Canada",
                region = "British Columbia",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 20, new = 10),
                    "2020-01-23" to CaseDetails(total = 30, new = 10),
                    "2020-01-24" to CaseDetails(total = 45, new = 15),
                    "2020-01-25" to CaseDetails(total = 50, new = 5),
                    "2020-01-26" to CaseDetails(total = 60, new = 10)
                )
            ),
            CovidData(
                country = "USA",
                region = "California",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 50, new = 15),
                    "2020-01-23" to CaseDetails(total = 70, new = 20),
                    "2020-01-24" to CaseDetails(total = 100, new = 30),
                    "2020-01-25" to CaseDetails(total = 120, new = 20),
                    "2020-01-26" to CaseDetails(total = 150, new = 30)
                )
            ),
            CovidData(
                country = "USA",
                region = "New York",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 100, new = 50),
                    "2020-01-23" to CaseDetails(total = 150, new = 50),
                    "2020-01-24" to CaseDetails(total = 200, new = 50),
                    "2020-01-25" to CaseDetails(total = 250, new = 50),
                    "2020-01-26" to CaseDetails(total = 300, new = 50)
                )
            ),
            CovidData(
                country = "Mexico",
                region = "Mexico City",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 80, new = 30),
                    "2020-01-23" to CaseDetails(total = 120, new = 40),
                    "2020-01-24" to CaseDetails(total = 170, new = 50),
                    "2020-01-25" to CaseDetails(total = 200, new = 30),
                    "2020-01-26" to CaseDetails(total = 250, new = 50)
                )
            ),
            CovidData(
                country = "Mexico",
                region = "Jalisco",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 10, new = 5),
                    "2020-01-23" to CaseDetails(total = 20, new = 10),
                    "2020-01-24" to CaseDetails(total = 30, new = 10),
                    "2020-01-25" to CaseDetails(total = 40, new = 10),
                    "2020-01-26" to CaseDetails(total = 50, new = 10)
                )
            ),
            CovidData(
                country = "Brazil",
                region = "São Paulo",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 200, new = 50),
                    "2020-01-23" to CaseDetails(total = 300, new = 100),
                    "2020-01-24" to CaseDetails(total = 450, new = 150),
                    "2020-01-25" to CaseDetails(total = 500, new = 50),
                    "2020-01-26" to CaseDetails(total = 600, new = 100)
                )
            ),
            CovidData(
                country = "Brazil",
                region = "Rio de Janeiro",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 150, new = 30),
                    "2020-01-23" to CaseDetails(total = 180, new = 30),
                    "2020-01-24" to CaseDetails(total = 220, new = 40),
                    "2020-01-25" to CaseDetails(total = 250, new = 30),
                    "2020-01-26" to CaseDetails(total = 300, new = 50)
                )
            ),
            CovidData(
                country = "UK",
                region = "London",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 80, new = 10),
                    "2020-01-23" to CaseDetails(total = 100, new = 20),
                    "2020-01-24" to CaseDetails(total = 150, new = 50),
                    "2020-01-25" to CaseDetails(total = 200, new = 50),
                    "2020-01-26" to CaseDetails(total = 250, new = 50)
                )
            ),
            CovidData(
                country = "India",
                region = "Delhi",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 90, new = 30),
                    "2020-01-23" to CaseDetails(total = 120, new = 30),
                    "2020-01-24" to CaseDetails(total = 170, new = 50),
                    "2020-01-25" to CaseDetails(total = 220, new = 50),
                    "2020-01-26" to CaseDetails(total = 300, new = 80)
                )
            ),
            CovidData(
                country = "Mexico",
                region = "Queretaro",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 10, new = 2),
                    "2020-01-23" to CaseDetails(total = 15, new = 5),
                    "2020-01-24" to CaseDetails(total = 25, new = 10),
                    "2020-01-25" to CaseDetails(total = 30, new = 5),
                    "2020-01-26" to CaseDetails(total = 35, new = 5)
                )
            ),
            CovidData(
                country = "Alemania",
                region = "Berlin",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 0, new = 10),
                    "2020-01-23" to CaseDetails(total = 0, new = 10),
                    "2020-01-24" to CaseDetails(total = 5, new = 15),
                    "2020-01-25" to CaseDetails(total = 10, new = 5),
                    "2020-01-26" to CaseDetails(total = 6, new = 10)
                )
            ),
            CovidData(
                country = "USA",
                region = "Los Angeles",
                cases = mapOf(
                    "2020-01-22" to CaseDetails(total = 50, new = 15),
                    "2020-01-23" to CaseDetails(total = 70, new = 20),
                    "2020-01-24" to CaseDetails(total = 100, new = 30),
                    "2020-01-25" to CaseDetails(total = 120, new = 20),
                    "2020-01-26" to CaseDetails(total = 150, new = 30)
                )
            )
        )
    }
}
