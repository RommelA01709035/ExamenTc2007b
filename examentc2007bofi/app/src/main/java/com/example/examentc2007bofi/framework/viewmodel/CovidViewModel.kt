package com.example.secondrecycleview.framework.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.secondrecycleview.data.CovidDataRepository
import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.domain.CovidDataeRequirement
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CovidDataViewModel() : ViewModel() {
    private val CovidDataRequirement = CovidDataeRequirement()
    private val _covidDataList = MutableLiveData<List<CovidData>>()
    val CovidDataList: LiveData<List<CovidData>> get() = _covidDataList


    fun getCovidData() {
        viewModelScope.launch {
            val schedule = CovidDataRequirement.invoke()
            println("ViewModel - Schedule received: $schedule")
            _covidDataList.postValue(schedule ?: emptyList())
        }
    }
}
