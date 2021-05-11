package com.connect.repositery

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.connect.viewmodels.LoginViewModel

class ViewModerFactory(val repositery: Repositery) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        //return MainViewmodel(repositery) as T
        return LoginViewModel() as T
    }

}