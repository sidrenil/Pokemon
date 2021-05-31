package com.example.pokemon.service

import com.example.pokemon.response.PokemonListResponse
import com.google.android.material.datepicker.SingleDateSelector
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.jar.Attributes

interface PokemonAPI {
    //https://pokeapi.co/api/v2/pokemon/

    @GET("pokemon")
    fun getNames(
        @Query ("limit") limit :Int=20,
        @Query ("offset") offset:Int = 0
    ): Call<PokemonListResponse>




}
