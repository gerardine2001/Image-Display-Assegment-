package com.example.imagedisplay

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface apiInterface {
    @POST("/view/image")
    fun imagedisplay(@Body imageResponse: imageResponse): Call<imageResponse>

}