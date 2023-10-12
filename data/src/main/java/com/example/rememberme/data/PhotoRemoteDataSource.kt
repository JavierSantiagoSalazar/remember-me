package com.example.rememberme.data

import com.example.rememberme.domain.photo.Photo

interface PhotoRemoteDataSource {

    fun getRandomPhoto(): Photo
}