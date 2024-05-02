package com.example.power.ui.event

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.power.R
import com.example.power.adapter.DarkAdapter
import com.example.power.databinding.FragmentEventBinding
import com.example.power.model.Event


class EventFragment:Fragment() {

    private lateinit var binding: FragmentEventBinding
    private lateinit var adapter: DarkAdapter
    private  var darkList=ArrayList<Event>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEventBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        darkList.add(Event("人脸识别","2024-4-15 20:50:20","人脸抓拍机","已解除",R.drawable.people,"-"))
        darkList.add(Event("区域入侵","2024-4-15 20:50:16","辐射探伤设备1","未确认",R.drawable.factory,"-"))
        darkList.add(Event("辐射探测值超限","2024-4-15 13:33:20","辐射探伤设备2","未确认",R.drawable.factory,"0.6"))
        darkList.add(Event("区域入侵","2024-4-15 12:20:50","辐射探伤设备3","未确认",R.drawable.factory,"-"))
        darkList.add(Event("辐射探测值超限","2024-4-15 11:20:30","辐射探伤设备4","未确认",R.drawable.factory,"0.7"))
        adapter= DarkAdapter(darkList)
        binding.recyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adapter
    }

}