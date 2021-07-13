package com.example.pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.databinding.CardModelBinding
import com.example.pokemon.response.PokemonListResponse


class RecyclerViewAdapter(
    val pokemon: List<PokemonListResponse.Result>
) : RecyclerView.Adapter<PokemonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding: CardModelBinding =
            //CardModelBinding.inflate(LayoutInflater.from(parent.context), false)
            CardModelBinding.inflate(LayoutInflater.from(parent.context))
        return PokemonViewHolder(binding)


    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {

        holder.bind(pokemon[position])
    }

    override fun getItemCount(): Int {

        return pokemon.size
    }

    fun setPokemonListResponseItem(body: List<PokemonListResponse>) {

    }


}


