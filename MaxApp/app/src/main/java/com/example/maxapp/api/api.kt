package com.example.maxapp.api

import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class api {

    fun iniciar(){
        Retrofit.Builder()
            .baseUrl("https://api.myjson.com/bins/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}