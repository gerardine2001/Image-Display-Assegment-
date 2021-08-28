package com.example.imagedisplay

import com.google.gson.annotations.SerializedName

data class imageResponsevar(
    var name:String,
    @SerializedName("likes") var likes:String,
@SerializedName("access_token") var accesToken:String,
@SerializedName("imageUrl") var imageUrl:String
)
