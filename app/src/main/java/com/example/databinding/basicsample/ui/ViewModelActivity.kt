package com.example.databinding.basicsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.basicsample.R
import com.example.databinding.basicsample.data.ProfileLiveDataViewModel
import com.example.databinding.basicsample.databinding.ViewmodelProfileBinding


class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this).get(ProfileLiveDataViewModel::class.java)

        val binding: ViewmodelProfileBinding =
            DataBindingUtil.setContentView(this, R.layout.viewmodel_profile)

        binding.viewmodel = viewModel

        binding.lifecycleOwner = this
    }
}
