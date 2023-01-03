package com.kaankarakas.planetapplication

import androidx.recyclerview.widget.DiffUtil

class PlanetDiffListCallback:DiffUtil.ItemCallback<PlanetData>(){
    override fun areItemsTheSame(oldItem: PlanetData, newItem: PlanetData)
    =(oldItem.planetNames == newItem.planetNames)

    override fun areContentsTheSame(oldItem: PlanetData, newItem: PlanetData) = (oldItem == newItem)
}