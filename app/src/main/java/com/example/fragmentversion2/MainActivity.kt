package com.example.fragmentversion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentversion2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var counterFragment: CounterFragment
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            initFragment()
        initListener()
    }
    private fun initFragment() {
        counterFragment=supportFragmentManager.findFragmentById(R.id.counterFragment)as CounterFragment

    }
    private fun initListener() {
      binding.btnReset.setOnClickListener{

      }
    }
}