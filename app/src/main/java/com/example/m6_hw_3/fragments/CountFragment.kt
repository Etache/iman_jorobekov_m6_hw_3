package com.example.m6_hw_3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.m6_hw_3.MainActivity
import com.example.m6_hw_3.MainViewModel
import com.example.m6_hw_3.databinding.FragmentCountBinding

class CountFragment : Fragment() {

    private lateinit var binding: FragmentCountBinding
    lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (requireActivity() as MainActivity).viewModel

        viewModel.counter.observe(viewLifecycleOwner, Observer {
            binding.tvCount.text = it.toString()
        })
    }
}