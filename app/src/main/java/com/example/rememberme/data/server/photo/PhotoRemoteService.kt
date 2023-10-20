package com.example.rememberme.data.server.photo

import com.example.rememberme.data.server.photo.remoteModel.RemotePhoto
import com.example.rememberme.di.annotations.ClientId
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoRemoteService {

    @GET("photos/random")
    fun getRandomPhoto(
        @Query("client_id") @ClientId clientId: String,
        @Query("count") count: Int,
    ): RemotePhoto
}
