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
    private val repository = CovidDataRepository()
    private val CovidDataRequirement = CovidDataeRequirement(repository)

    private val _CovidDataList = MutableLiveData<List<CovidData>>()
    val CovidDataList: LiveData<List<CovidData>> get() = _CovidDataList

    fun fetchCovidData(limit: Int = 20) {
        viewModelScope.launch(Dispatchers.IO) {
            val CovidDataes = (1..limit).mapNotNull { id ->
                CovidDataRequirement.getCovidDataById(id)
            }
            _CovidDataList.postValue(CovidDataes)
        }
    }
}
