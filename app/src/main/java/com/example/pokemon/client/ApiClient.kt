package com.example.pokemon.client

import android.telecom.Call
import com.example.pokemon.response.PokemonListResponse
import com.example.pokemon.service.PokemonAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.gson.GsonConverterFactory.create


class ApiClient {
    companion object {
        var BASE_URL = "https://pokeapi.co/api/v2/"
        fun create(): PokemonAPI {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(PokemonAPI::class.java)

        }
    }
}

