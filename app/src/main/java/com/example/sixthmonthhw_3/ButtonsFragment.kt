package com.example.sixthmonthhw_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.sixthmonthhw_3.databinding.FragmentButtonsBinding


class ButtonsFragment : Fragment() {

  private  lateinit var binding: FragmentButtonsBinding
    private lateinit var viewModel:MyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
        binding.btnPlus.setOnClickListener{
           viewModel.increment()
        }

        binding.btnMinus.setOnClickListener{
            viewModel.decrement()
        }

    }

}


// private fun initClickers() {
//        with(binding) {
//            incrementBtn.setOnClickListener {
//                presenter.increment()
//
//            }
//            decrementBtn.setOnClickListener {
//                presenter.decrement()
//
//            }