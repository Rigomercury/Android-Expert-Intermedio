package com.rigodev.horoscapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val tokenmanager: Tokenmanager) :Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain
            .request()
            .newBuilder()
            .header("Autorization",tokenmanager.getToken())
            .build()

        return chain.proceed(request)
    }
    class Tokenmanager @Inject constructor(){
        fun getToken():String = "SUSCRIBETE"
    }
}