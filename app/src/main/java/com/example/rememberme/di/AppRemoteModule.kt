package com.example.rememberme.di

import com.example.rememberme.BuildConfig
import com.example.rememberme.data.server.photo.PhotoRemoteService
import com.example.rememberme.di.annotations.ApiUrl
import com.example.rememberme.di.annotations.ClientId
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppRemoteModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = HttpLoggingInterceptor().run {
        level = HttpLoggingInterceptor.Level.BODY
        OkHttpClient.Builder().addInterceptor(this).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(@ApiUrl apiUrl: String, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(apiUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Reusable
    fun providePhotoService(retrofit: Retrofit): PhotoRemoteService {
        return retrofit.create(PhotoRemoteService::class.java)
    }

    @Provides
    @Reusable
    @ApiUrl
    fun provideApiUrl(): String = BuildConfig.BASE_URL
}
