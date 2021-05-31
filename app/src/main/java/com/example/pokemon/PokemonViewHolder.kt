package com.example.pokemon

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide

import com.example.pokemon.databinding.CardModelBinding
import com.example.pokemon.response.PokemonListResponse
import java.net.URL

class PokemonViewHolder(val binding: CardModelBinding) : RecyclerView.ViewHolder(
    binding.root
) {

    fun bind(pokemonModel: PokemonListResponse.Result) {

        pokemonModel.let {
            binding.pokemonname.text = it.name

            val circularProgressDrawable = CircularProgressDrawable(itemView.context)
            circularProgressDrawable.strokeWidth = 5f
            circularProgressDrawable.centerRadius = 30f
            circularProgressDrawable.start()

            Glide.with(itemView)
                .load(getImageUrl(pokemonModel.url))
                .placeholder(circularProgressDrawable)
                .into(binding.imageView)
        }

    }

    private fun getImageUrl(url: String?): String {
        val index = url?.split("/".toRegex())?.dropLast(1)?.last() ?: "0"
        return "https://pokeres.bastionbot.org/images/pokemon/$index.png"
    }
}