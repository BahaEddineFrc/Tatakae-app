package com.tatakae.anime.domain.repository

import com.tatakae.anime.domain.model.anime.Anime

interface AnimeRepository {
    suspend fun getAllAnime(): List<Anime>
    suspend fun getAnimeById(id: String): Anime
}