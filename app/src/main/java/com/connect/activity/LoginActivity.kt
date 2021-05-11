package com.connect.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.connect.activity.databinding.ActivityLoginBinding
import com.connect.repositery.Repositery
import com.connect.viewmodels.LoginViewModel

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var mViewmodel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        //val newViewModerFactory = ViewModerFactory(Repositery())
        mViewmodel =
            ViewModelProvider(this/*, newViewModerFactory*/).get(LoginViewModel::class.java)
        mViewmodel.repositery = Repositery()
        mViewmodel.init()

        binding.lifecycleOwner = this
        binding.model = mViewmodel

    }

    override fun onResume() {
        super.onResume()


        mViewmodel.myResponse.observe(this, { mResponse ->
            if (mResponse.isSuccessful) {
                Toast.makeText(this, "success " + mResponse.code().toString(), Toast.LENGTH_SHORT)
                    .show()

            } else {
                Toast.makeText(this, "error " + mResponse.code().toString(), Toast.LENGTH_SHORT)
                    .show()
            }
            binding.loginlayout.root.visibility=View.GONE
            binding.otplayout.root.visibility=View.VISIBLE
        })

        mViewmodel.myOtpResponse.observe(this, { mResponse ->
            if (mResponse.isSuccessful) {
                Toast.makeText(this, "success " + mResponse.code().toString(), Toast.LENGTH_SHORT)
                    .show()

            } else {
                Toast.makeText(this, "error " + mResponse.code().toString(), Toast.LENGTH_SHORT)
                    .show()
            }
            startActivity(Intent(this,MainActivity::class.java))
        })


    }

}