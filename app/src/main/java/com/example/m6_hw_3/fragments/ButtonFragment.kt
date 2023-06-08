package com.example.m6_hw_3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m6_hw_3.MainActivity
import com.example.m6_hw_3.MainViewModel
import com.example.m6_hw_3.databinding.FragmentButtonBinding

class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding
    lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (requireActivity() as MainActivity).viewModel

        binding.plus.setOnClickListener {
            viewModel.increment()
            viewModel.operation.value += "+"
        }
        binding.minus.setOnClickListener {
            viewModel.decrement()
            viewModel.operation.value += "-"
        }
    }
}