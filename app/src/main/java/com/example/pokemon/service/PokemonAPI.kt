package com.example.pokemon.service

import com.example.pokemon.response.PokemonDetailResponse
import com.example.pokemon.response.PokemonListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface PokemonAPI {
    //https://pokeapi.co/api/v2/pokemon/

    @GET("pokemon")
    fun getNames(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): Call<PokemonListResponse>

    @GET("pokemon/{name}")
    fun getPokemonDetailResponse(@Path("name") name:String): Call<PokemonDetailResponse>

}
