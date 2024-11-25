
package com.example.secondrecycleview.framework.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.secondrecycleview.R
import com.example.secondrecycleview.data.network.model.CovidData
import com.example.secondrecycleview.framework.adapters.viewholders.CovidDataViewHolder

class CovidDataAdapter :
    RecyclerView.Adapter<CovidDataViewHolder> {
    private val CovidDataList: List<CovidData>
    constructor(CovidDataList: List<CovidData>)
            : super() {
        this.CovidDataList = CovidDataList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidDataViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_covid_data, parent, false)
        return CovidDataViewHolder(view)
    }

    override fun getItemCount(): Int = CovidDataList.size

    override fun onBindViewHolder(holder: CovidDataViewHolder, position: Int) {
        val item = CovidDataList[position]
        holder.render(item)
    }
}
