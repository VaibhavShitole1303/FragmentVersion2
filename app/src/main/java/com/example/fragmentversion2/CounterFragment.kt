package com.example.fragmentversion2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentversion2.databinding.CounterfragmentViewBinding

class CounterFragment:Fragment() {
    private lateinit var binding: CounterfragmentViewBinding
    var count=0
    set(value) {
        field=value
        binding.txtCount.text="$count"
    }
    var title:String=""
    set(value) {
        field=value
        binding.txtTitle.text=value
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=CounterfragmentViewBinding.inflate(inflater)
        if (arguments!=null){
            binding.txtTitle.text=requireArguments().getString("title")
            binding.txtCount.text="${requireArguments().getInt("count")}"
        }
        initListener()
        return binding.root
    }

    private fun initListener() {
        binding.btnIncrementCount.setOnClickListener{
            binding.txtCount.text="${++count}"

        }

        binding.btnDecrementCount.setOnClickListener{
            binding.txtCount.text="${--count}"
            if (count<0){
                binding.txtCount.text="${0}"
            }
        }


    }
}