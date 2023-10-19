package com.example.rememberme.data.server.photo

import arrow.core.Either
import com.example.rememberme.data.PhotoRemoteDataSource
import com.example.rememberme.data.tryCall
import com.example.rememberme.domain.Error
import com.example.rememberme.domain.photo.Photo
import com.example.rememberme.domain.photo.Urls
import javax.inject.Inject
import com.example.rememberme.data.server.photo.Urls as RemoteUrls

class PhotoRemoteDataSourceImpl @Inject constructor(
    private val photoRemoteService: PhotoRemoteService,
) : PhotoRemoteDataSource {

    override suspend fun getRandomPhoto(clientId: String, count: Int): Either<Error, Photo> =
        tryCall {
            photoRemoteService
                .getRandomPhoto(clientId, 1)
                .toDomainModel()
        }
}

private fun RemotePhoto.toDomainModel(): Photo =
    Photo(
        id,
        url.toDomainModel(),
    )

private fun RemoteUrls.toDomainModel(): Urls =
    Urls(
        small = small,
    )
