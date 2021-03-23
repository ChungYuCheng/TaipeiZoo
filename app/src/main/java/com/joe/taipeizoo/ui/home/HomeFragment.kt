package com.joe.taipeizoo.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.joe.taipeizoo.adapter.FieldListAdapter
import com.joe.taipeizoo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    companion object {
        val TAG = HomeFragment :: class.java.simpleName
    }
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        homeViewModel.fields.observe(viewLifecycleOwner, Observer {
            binding.recycler.layoutManager = LinearLayoutManager(context)
            binding.recycler.setHasFixedSize(true)
            binding.recycler.adapter = FieldListAdapter(it.result.results)
        })

        return binding.root
    }
}