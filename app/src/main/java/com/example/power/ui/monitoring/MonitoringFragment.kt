package com.example.power.ui.monitoring

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.power.adapter.MonitorAdapter
import com.example.power.databinding.FragmentMonitoringBinding

class MonitoringFragment:Fragment() {

    private lateinit var binding: FragmentMonitoringBinding
    private lateinit var viewModel: MonitoringModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMonitoringBinding.inflate(layoutInflater)
        binding.recycleView.layoutManager = GridLayoutManager(requireContext(),3)
        val adapter = MonitorAdapter()
        binding.recycleView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MonitoringModel::class.java]
    }

}