package dev.gilmario.ti.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dev.gilmario.ti.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        binding.countText.text = viewModel.getCount().toString()

        binding.button.setOnClickListener({
            viewModel.getIcrementCount()
            binding.countText.text = viewModel.getCount().toString()
        })

    }
}
