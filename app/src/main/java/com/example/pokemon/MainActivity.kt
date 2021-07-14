package com.example.pokemon

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.databinding.DataBindingUtil
import com.example.pokemon.client.ApiClient
import com.example.pokemon.databinding.ActivityMainBinding
import com.example.pokemon.response.PokemonListResponse
import com.example.pokemon.service.PokemonAPI
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var page = 0
    val limit = 20
    val pokemon = ArrayList<PokemonListResponse.Result>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        fetchPokemonData(0)
    }

    private fun fetchPokemonData(offset: Int) {
        ApiClient.create().getNames(limit, offset)
            .enqueue(object : retrofit2.Callback<PokemonListResponse> {
                override fun onResponse(
                    call: retrofit2.Call<PokemonListResponse>,
                    response: Response<PokemonListResponse>,
                ) {
                    val pokemonResponse = response.body()
                    pokemonResponse?.results?.let {
                        if (response.isSuccessful && response.body() != null) {
                            pokemon.addAll(it)
                            setAdapter(pokemon)
                            setNestedScrollView()
                        }
                    }
                }

                override fun onFailure(call: retrofit2.Call<PokemonListResponse>, t: Throwable) {
                    t.message?.let { Log.d("Error", it) }
                }

            })

    }

    private fun setNestedScrollView() {
        binding.scrollNested.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener {
                v,
                scrollX,
                scrollY,
                oldScrollX,
                oldScrollY,
            ->
            if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
                page++
                fetchPokemonData(limit * page)
            }
        })
    }

    private fun setAdapter(pokemon: List<PokemonListResponse.Result>) {

        val adapter = RecyclerViewAdapter(pokemon)
        binding.recyclerView.adapter = adapter
    }
}

