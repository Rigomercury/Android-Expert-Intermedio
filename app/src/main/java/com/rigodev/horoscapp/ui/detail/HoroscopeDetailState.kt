package com.rigodev.horoscapp.ui.detail

import com.rigodev.horoscapp.domain.model.HoroscopeModel
import dagger.hilt.android.AndroidEntryPoint


sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val prediction:String, val sign:String, val horoscopeModel: HoroscopeModel):HoroscopeDetailState()

}