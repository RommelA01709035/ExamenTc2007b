package com.example.secondrecycleview.framework.adapters

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.databinding.ItemCovidDataBinding
import com.example.secondrecycleview.framework.adapters.viewholders.CovidDataViewHolder

class CovidDataAdapter(private val covidDataList: List<CovidData>, private val average: Double) :
    RecyclerView.Adapter<CovidDataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidDataViewHolder {
        val binding = ItemCovidDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CovidDataViewHolder(binding, average)
    }

    override fun getItemCount(): Int = covidDataList.size

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: CovidDataViewHolder, position: Int) {
        val item = covidDataList[position]
        holder.render(item)
    }
}
