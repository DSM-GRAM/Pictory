package com.gram.pictory.Connect

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface API {
    @POST("/signup/")
    @Headers("Content-Type:application/json")
    fun signUp(@Body body: Any?): Call<Unit>
}