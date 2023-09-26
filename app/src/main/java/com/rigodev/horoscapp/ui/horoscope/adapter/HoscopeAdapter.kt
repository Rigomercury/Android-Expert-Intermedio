package com.rigodev.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rigodev.horoscapp.R
import com.rigodev.horoscapp.domain.model.HoroscopeInfo

class HoscopeAdapter(private var horoscopeList: List<HoroscopeInfo> = emptyList(),
    private val onItemSelected:(HoroscopeInfo)-> Unit) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {

    fun updateList(list:List<HoroscopeInfo>){
        horoscopeList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope,parent,false)
        )
    }

    override fun getItemCount() = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        holder.render(horoscopeList[position], onItemSelected)
    }
}