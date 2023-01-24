package com.fastthink.sales.newsales

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastthink.sales.databinding.FragmentHomeBinding
import com.fastthink.sales.databinding.FragmentNewSalesBinding
import java.util.logging.Logger


class NewSalesFragment : Fragment() {

    private var _binding: FragmentNewSalesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNewSalesBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initView() {
        addRequestButton()
    }

    private fun addRequestButton() {
        binding.addRequest.setOnClickListener {
            Log.w("info", "Adding new item")
        }
    }
}