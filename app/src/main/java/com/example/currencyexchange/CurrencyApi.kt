package com.example.currencyexchange

import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {
    @GET("v4/latest/EUR")
    suspend fun getRates(): Response<CurrencyResponse>
}