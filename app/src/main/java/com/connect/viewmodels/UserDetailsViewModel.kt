package com.connect.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.connect.model.OtpResponse
import com.connect.model.UserResponse
import retrofit2.Response

class UserDetailsViewModel : ViewModel() {

    val usersList= MutableLiveData<Response<UserResponse>>()


    val myOtpResponse: MutableLiveData<Response<OtpResponse>> = MutableLiveData()

}