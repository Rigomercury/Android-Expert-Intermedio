package com.rigodev.horoscapp.data

import android.util.Log
import com.rigodev.horoscapp.data.network.HoroscopeApiService
import com.rigodev.horoscapp.data.network.response.PredictionResponse
import com.rigodev.horoscapp.domain.Repository
import com.rigodev.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RespositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) :
    Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Roro","Ha ocurrido un error ${it.message}") }
        return null
    }
}