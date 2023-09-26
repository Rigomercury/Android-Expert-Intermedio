package com.rigodev.horoscapp.domain

import com.rigodev.horoscapp.data.network.response.PredictionResponse
import com.rigodev.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String): PredictionModel?

}