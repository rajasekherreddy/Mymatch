package com.ooredoo.new

import com.connect.model.LoginRequest
import com.connect.model.LoginResponse
import com.connect.model.OtpRequest
import com.connect.model.OtpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserApi {

    @GET("posts/1")
    suspend fun getUserAsync(): Response<LoginResponse>

    @GET("posts/{id}")
    suspend fun getUser(@Path("id") id: String): Response<LoginResponse>

    @POST("login")
    suspend fun getLoginResponse(@Body req: LoginRequest): Response<LoginResponse>

    @POST("otp")
    suspend fun getOtpResponse(@Body otpRequest: OtpRequest): Response<OtpResponse>

}