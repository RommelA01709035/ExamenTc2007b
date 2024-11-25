package com.example.secondrecycleview.framework.adapters.viewholders

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.databinding.ItemCovidDataBinding

class CovidDataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var binding = ItemCovidDataBinding.bind(view)

    fun render(CovidDataModel: CovidData) {
        binding.tvCovidDataName.text = CovidDataModel.region
        binding.tvRealName.text = CovidDataModel.country

        itemView.setOnClickListener({
            Toast.makeText(binding.ivCovidData.context, CovidDataModel.country, Toast.LENGTH_LONG).show()
        })

    }
}
