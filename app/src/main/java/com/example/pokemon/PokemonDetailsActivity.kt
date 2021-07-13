package com.example.pokemon

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.pokemon.client.ApiClient
import com.example.pokemon.databinding.ActivityPokemonDetailsBinding
import com.example.pokemon.response.PokemonDetailResponse
import com.example.pokemon.service.PokemonAPI
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class PokemonDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPokemonDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pokemon_details)

        binding.back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val detailsName = intent.getStringExtra("name")
        binding.pokemonDetailsName.text = detailsName

    }

    private fun fetchDetailData(name: String) {
        ApiClient.create(PokemonAPI::class.java)
            .getPokemonDetailResponse(name)
            .enqueue(object : Callback<PokemonDetailResponse>,
                retrofit2.Callback<PokemonDetailResponse> {
                override fun onResponse(
                    call: Call<PokemonDetailResponse>,
                    response: Response<PokemonDetailResponse>
                ) {
                    val pokemonResponseDetail = response.body()

                    binding.pokemonWeightText.text = pokemonResponseDetail?.id.toString()
                    binding.pokemonHeightText.text = pokemonResponseDetail?.id.toString()


                    val pokemonHp =
                        pokemonResponseDetail?.stats?.find { it?.stat?.name == Stats.HP.statName }
                    binding.pokemonHpProgress.labelText =
                        pokemonHp?.baseStat.toString()
                    binding.pokemonHpProgress.progress =
                        pokemonHp?.baseStat?.toFloat() ?: 0f

                    val pokemonAttack =
                        pokemonResponseDetail?.stats?.find { it?.stat?.name == Stats.ATTACK.statName }

                    binding.pokemonAttackProgress.labelText =
                        pokemonAttack?.baseStat.toString()
                    binding.pokemonAttackProgress.progress =
                        pokemonAttack?.baseStat?.toFloat() ?: 0f

                    val pokemonDefensive =
                        pokemonResponseDetail?.stats?.find { it?.stat?.name == Stats.DEFENSİVE.statName }
                    binding.pokemonDefensiveProgress.labelText =
                        pokemonDefensive?.baseStat.toString()
                    binding.pokemonDefensiveProgress.progress =
                        pokemonDefensive?.baseStat?.toFloat() ?: 0f

                    val pokemonSpeed =
                        pokemonResponseDetail?.stats?.find { it?.stat?.name == Stats.SPEED.statName }
                    binding.pokemonSpeedProgress.labelText =
                        pokemonSpeed?.baseStat.toString()
                    binding.pokemonSpeedProgress.progress =
                        pokemonSpeed?.baseStat?.toFloat() ?: 0f

                    binding.pokemonExpProgress.labelText =
                        pokemonResponseDetail?.baseExperience.toString()
                    binding.pokemonExpProgress.progress =
                        pokemonResponseDetail?.baseExperience?.toFloat() ?: 0f
                }

                override fun onFailure(call: Call<PokemonDetailResponse>, t: Throwable) {
                    t.message?.let { Log.d("error", it) }
                }
                })
    }
}