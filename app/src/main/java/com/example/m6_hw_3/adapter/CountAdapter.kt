package com.example.m6_hw_3.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.m6_hw_3.MainViewModel
import com.example.m6_hw_3.fragments.ButtonFragment
import com.example.m6_hw_3.fragments.CountFragment
import com.example.m6_hw_3.fragments.HistoryFragment

class CountAdapter(fragment: FragmentActivity, private val viewModel: MainViewModel): FragmentStateAdapter(fragment) {



    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ButtonFragment().apply { this.viewModel = this@CountAdapter.viewModel }
            1 -> CountFragment().apply { this.viewModel = this@CountAdapter.viewModel }
            2 -> HistoryFragment().apply { this.viewModel = this@CountAdapter.viewModel }
            else -> ButtonFragment().apply { this.viewModel = this@CountAdapter.viewModel }
        }
    }


}