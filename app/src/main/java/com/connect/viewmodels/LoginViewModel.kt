package com.connect.viewmodels

import android.widget.EditText
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.connect.model.LoginRequest
import com.connect.model.LoginResponse
import com.connect.model.OtpRequest
import com.connect.model.OtpResponse
import com.connect.repositery.Repositery
import kotlinx.coroutines.launch
import retrofit2.Response

class LoginViewModel : ViewModel() {

    lateinit var repositery: Repositery
    val myResponse: MutableLiveData<Response<LoginResponse>> = MutableLiveData()
    val myOtpResponse: MutableLiveData<Response<OtpResponse>> = MutableLiveData()

    var login: LoginFields? = null

    fun init() {
        login = LoginFields()

    }

    fun onButtonClick() {
        if (login?.isNumberValid(true) == true) {
            val loginreq = login?.number?.let { LoginRequest(it) }
            loginreq?.let { getLoginResponse(it) }
        }
    }

    fun onOtpButtonClick() {
        if (login?.otp?.length!! > 3) {
            val otpReq = login?.number?.let { login?.otp?.let { it1 -> OtpRequest(it, it1) } }
            //var otpr=OtpRequest(login?.number!!, login?.otp!!)
            otpReq?.let { getOTPResponse(it) }
        }
    }


    @BindingAdapter("error")
    fun setError(editText: EditText, strOrResId: Int?) {
        if (strOrResId is Int) {
            editText.error = editText.context.getString((strOrResId as Int?)!!)
        } else {
            editText.error = strOrResId as String?
        }


    }

    fun getLoginResponse(loginRequest: LoginRequest) {
        viewModelScope.launch {
            myResponse.value = repositery.getLoginResponse(loginRequest)
        }
    }

    fun getOTPResponse(otpRequest: OtpRequest) {
        viewModelScope.launch {
            myOtpResponse.value = repositery.geOtpResponse(otpRequest)
        }
    }
}