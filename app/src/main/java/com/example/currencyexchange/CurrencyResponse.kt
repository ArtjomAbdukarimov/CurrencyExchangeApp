package com.example.currencyexchange

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Map<String, Double>
)