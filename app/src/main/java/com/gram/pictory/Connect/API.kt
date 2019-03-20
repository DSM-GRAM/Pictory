package com.gram.pictory.Connect

import com.gram.pictory.Model.LoginModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface API {
    @POST("/signup/")
    @Headers("Content-Type:application/json")
    fun signUp(@Body body: Any?): Call<Unit>

    @POST("/login/")
    @Headers("Content-Type:application/json")
    fun login(@Body body: Any?): Call<LoginModel>

    @POST("/post/")
    @Headers("Content-Type:application/json")
    fun post(@Body body: Any?): Call<Unit>
}