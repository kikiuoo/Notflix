package com.vickikbt.data.repository

import com.vickikbt.data.sources.CastDataSource
import com.vickikbt.data.sources.MovieDetailsDataSource
import com.vickikbt.domain.repositories.IMovieDetailsRepository

class MovieDetailsRepository constructor(
    private val movieDetailsDetailsDataSource: MovieDetailsDataSource,
    private val castDataSource: CastDataSource
) :
    IMovieDetailsRepository {

    override suspend fun getMovieDetails(movieId: Int) =
        movieDetailsDetailsDataSource.getMovieDetails(movieId)

    override suspend fun getMovieCast(movieId: Int) = castDataSource.getMovieCast(movieId)
}