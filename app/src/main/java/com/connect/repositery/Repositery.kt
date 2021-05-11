package com.connect.repositery

import com.connect.model.LoginRequest
import com.connect.model.LoginResponse
import com.connect.model.OtpRequest
import com.connect.model.OtpResponse
import com.ooredoo.new.RetrofitInstance
import retrofit2.Response

class Repositery {

    suspend fun getPost(id: String): Response<LoginResponse> = RetrofitInstance.api.getUser(id)

    suspend fun getLoginResponse(req: LoginRequest): Response<LoginResponse> =
        RetrofitInstance.api.getLoginResponse(req)


    suspend fun geOtpResponse(otpRequest: OtpRequest): Response<OtpResponse> =
        RetrofitInstance.api.getOtpResponse(otpRequest)


}