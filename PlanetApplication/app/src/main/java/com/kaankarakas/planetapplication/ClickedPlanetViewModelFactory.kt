package com.kaankarakas.planetapplication

import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ClickedPlanetViewModelFactory(private val planetId:Int,
                                    private val planetName:String)
    :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ClickedPlanetViewModel::class.java)){
            return ClickedPlanetViewModel(planetId, planetName) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}