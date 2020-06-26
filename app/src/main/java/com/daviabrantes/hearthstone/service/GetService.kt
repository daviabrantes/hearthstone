package com.daviabrantes.hearthstone.service

import com.daviabrantes.hearthstone.entities.CardResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface GetService {

    @GET("/cards/classes/Druid")
    fun getDruids(): Call<List<CardResponseModel>>

    @GET("/cards/classes/Hunter")
    fun getHunters(): Call<List<CardResponseModel>>

    @GET("/cards/classes/Mage")
    fun getMages(): Call<List<CardResponseModel>>

    @GET("/cards/types/Spell")
    fun getSpells(): Call<List<CardResponseModel>>

    @GET("/cards/types/Weapon")
    fun getWeapons(): Call<List<CardResponseModel>>

    @GET("/cards/types/Hero")
    fun getHeroes(): Call<List<CardResponseModel>>

    @GET("/cards/qualities/Common")
    fun getCommon(): Call<List<CardResponseModel>>

    @GET("/cards/qualities/Epic")
    fun getEpics(): Call<List<CardResponseModel>>

    @GET("/cards/qualities/Legendary")
    fun getLegendary(): Call<List<CardResponseModel>>
}
