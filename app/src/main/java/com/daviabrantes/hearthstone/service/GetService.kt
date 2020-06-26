package com.daviabrantes.hearthstone.service

import com.daviabrantes.hearthstone.entities.CardResponseModel
import io.reactivex.Observable
import io.reactivex.internal.operators.observable.ObservableError
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface GetService {

    @Headers("x-rapidapi-host: omgvamp-hearthstone-v1.p.rapidapi.com", "x-rapidapi-key: 7bc1bc89d2mshecbb9cd881f6e3fp126269jsn7320795a8b0f")
    @GET("cards/{param1}/{param2}")
    fun getCards(@Path("param1") param1 : String, @Path("param2") param2 : String): Observable<List<CardResponseModel>>


}
