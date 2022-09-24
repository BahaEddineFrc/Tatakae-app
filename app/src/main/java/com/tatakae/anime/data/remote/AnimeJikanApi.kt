package com.tatakae.anime.data.remote

import com.tatakae.anime.data.remote.AnimeJikanEndpoints.ALL_ANIME
import com.tatakae.anime.data.remote.AnimeJikanEndpoints.ANIME_BY_ID
import com.tatakae.anime.domain.model.anime.Anime
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * An interface containing the remote api services
 */
interface AnimeJikanApi {
    @GET(ALL_ANIME)
    suspend fun getAllAnime(): List<Anime>

    @GET(ANIME_BY_ID)
    suspend fun getAnimeById(@Path("id") id: String): Anime
}