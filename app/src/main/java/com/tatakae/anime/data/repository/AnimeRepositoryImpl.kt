package com.tatakae.anime.data.repository

import com.tatakae.anime.data.remote.AnimeJikanApi
import com.tatakae.anime.domain.model.anime.Anime
import com.tatakae.anime.domain.repository.AnimeRepository
import io.reactivex.Single
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val api: AnimeJikanApi
) : AnimeRepository {
    override suspend fun getAllAnime(): List<Anime> = api.getAllAnime()

    override suspend fun getAnimeById(id: String): Anime = api.getAnimeById(id)
}