package com.example.rememberme.data.server.photo

import arrow.core.Either
import com.example.rememberme.data.photo.PhotoRemoteDataSource
import com.example.rememberme.data.photo.PhotoRepository
import com.example.rememberme.domain.Error
import com.example.rememberme.domain.photo.Photo
import javax.inject.Inject

class PhotoRepositoryImpl @Inject constructor(
    private val remoteDataSource: PhotoRemoteDataSource,
) : PhotoRepository {

    override suspend fun requestPhoto(clientId: String, count: Int): Either<Error, Photo> {
        return remoteDataSource.getRandomPhoto(clientId, count)
    }
}
