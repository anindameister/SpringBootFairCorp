package com.faircorp.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://app-420ce9e6-69f1-4afa-8c93-613ae8951e47.cleverapps.io/api/")
            .build()
            .create(WindowApiService::class.java)
    }
}