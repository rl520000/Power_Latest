package com.example.power.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.power.databinding.ItemMonitoringBinding
import com.example.power.ui.monitoring.MonitoringModel

class MonitorAdapter():RecyclerView.Adapter<MonitorAdapter.ViewHolder> (){

    inner class ViewHolder(val binding:ItemMonitoringBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMonitoringBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
    }

    override fun getItemCount(): Int {
        return 20
    }

}