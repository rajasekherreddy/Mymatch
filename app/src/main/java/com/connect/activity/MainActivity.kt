package com.connect.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.connect.activity.databinding.LayoutMainBinding
import com.connect.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: LayoutMainBinding
    lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.layout_main)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()

    }

}