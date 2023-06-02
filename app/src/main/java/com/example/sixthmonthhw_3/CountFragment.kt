package com.example.sixthmonthhw_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sixthmonthhw_3.databinding.FragmentCountBinding

class CountFragment : Fragment() {

   private lateinit var binding: FragmentCountBinding
   private  lateinit var viewModel: MyViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentCountBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
         viewModel.counter.observe(viewLifecycleOwner, Observer { data->
             binding.tvNumber.text = data.toString()
         })
    }
}