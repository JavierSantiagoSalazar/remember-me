package com.example.rememberme.data.photo

import arrow.core.Either
import com.example.rememberme.domain.Error
import com.example.rememberme.domain.photo.Photo

interface PhotoRemoteDataSource {

    suspend fun getRandomPhoto(clientId: String, count: Int): Either<Error, Photo>
}
