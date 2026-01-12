package com.example.counterapp.presentation.count

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counterapp.databinding.ActivityCountBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CountActivity : AppCompatActivity() {

    private val binding: ActivityCountBinding by lazy{
        ActivityCountBinding.inflate(layoutInflater)
    }
     private val viewModel: CountViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            viewModel.increment()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.decrement()
        }

        binding.btnReset.setOnClickListener {
            viewModel.reset()
        }

        viewModel.countData.observe(this) { count ->
            binding.tvCounter.text = count.count.toString()
        }
    }
}