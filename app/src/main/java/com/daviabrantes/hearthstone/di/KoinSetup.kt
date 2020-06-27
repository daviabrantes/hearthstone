package com.daviabrantes.hearthstone.di

import com.daviabrantes.hearthstone.service.GetService
import com.daviabrantes.hearthstone.ui.results.ResultsPresenter
import com.daviabrantes.hearthstone.ui.results.ResultsPresenterContract
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
        factory { provideOkHttpClient() }
        single { provideRetrofit(okHttpClient = get()) }
        factory { provideGetService(retrofit = get()) }
    }

    val presenterModule = module {
        factory { ResultsPresenter(get()) as ResultsPresenterContract }
    }

    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://omgvamp-hearthstone-v1.p.rapidapi.com/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .build()
    }

    fun provideGetService(retrofit: Retrofit): GetService = retrofit.create(GetService::class.java)