package com.tatakae.anime.domain.usecase.getAllAnime

import com.tatakae.anime.common.Resource
import com.tatakae.anime.domain.model.anime.Anime
import com.tatakae.anime.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAllAnimeUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    operator fun invoke(): Flow<Resource<List<Anime>>> = flow {
        try {
            emit(Resource.Loading())
            val allAnime = repository.getAllAnime()
            emit(Resource.Success(allAnime))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Could not reach server"))
        }
    }
}