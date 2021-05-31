package com.example.pokemon.response


import com.google.gson.annotations.SerializedName

data class PokemonListResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("previous")
    val previous: Any?,
    @SerializedName("results")
    val results: List<Result>?
) {
    data class Result(
        @SerializedName("name")
        var name: String?,
        @SerializedName("url")
        var url: String?
    )
}