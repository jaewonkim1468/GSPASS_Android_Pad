package com.semicolon.gspass_android_pad.viewmodel

import androidx.lifecycle.ViewModel
import com.semicolon.gspass_android_pad.data.local.SharedPreferenceStorage

class SettingViewModel(private val sharedPreferenceStorage: SharedPreferenceStorage) : ViewModel() {

    fun loadSettings(){
        sharedPreferenceStorage.getInfo()
    }
}