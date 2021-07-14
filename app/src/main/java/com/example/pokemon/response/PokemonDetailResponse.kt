package com.example.pokemon.response


import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    @SerializedName("abilities")
    val abilities: List<Ability?>?,
    @SerializedName("base_experience")
    val baseExperience: Int?,
    @SerializedName("forms")
    val forms: List<Form?>?,
    @SerializedName("game_indices")
    val gameİndices: List<Gameİndice?>?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("held_items")
    val heldİtems: List<Any?>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Boolean?,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,
    @SerializedName("moves")
    val moves: List<Move?>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("past_types")
    val pastTypes: List<Any?>?,
    @SerializedName("species")
    val species: Species?,
    @SerializedName("sprites")
    val sprites: Sprites?,
    @SerializedName("stats")
    val stats: List<Stat?>?,
    @SerializedName("types")
    val types: List<Type?>?,
    @SerializedName("weight")
    val weight: Int?
) {
    data class Ability(
        @SerializedName("ability")
        val ability: Ability?,
        @SerializedName("is_hidden")
        val isHidden: Boolean?,
        @SerializedName("slot")
        val slot: Int?
    ) {
        data class Ability(
            @SerializedName("name")
            val name: String?,
            @SerializedName("url")
            val url: String?
        )
    }

    data class Form(
        @SerializedName("name")
        val name: String?,
        @SerializedName("url")
        val url: String?
    )

    data class Gameİndice(
        @SerializedName("game_index")
        val gameİndex: Int?,
        @SerializedName("version")
        val version: Version?
    ) {
        data class Version(
            @SerializedName("name")
            val name: String?,
            @SerializedName("url")
            val url: String?
        )
    }

    data class Move(
        @SerializedName("move")
        val move: Move?,
        @SerializedName("version_group_details")
        val versionGroupDetails: List<VersionGroupDetail?>?
    ) {
        data class Move(
            @SerializedName("name")
            val name: String?,
            @SerializedName("url")
            val url: String?
        )

        data class VersionGroupDetail(
            @SerializedName("level_learned_at")
            val levelLearnedAt: Int?,
            @SerializedName("move_learn_method")
            val moveLearnMethod: MoveLearnMethod?,
            @SerializedName("version_group")
            val versionGroup: VersionGroup?
        ) {
            data class MoveLearnMethod(
                @SerializedName("name")
                val name: String?,
                @SerializedName("url")
                val url: String?
            )

            data class VersionGroup(
                @SerializedName("name")
                val name: String?,
                @SerializedName("url")
                val url: String?
            )
        }
    }

    data class Species(
        @SerializedName("name")
        val name: String?,
        @SerializedName("url")
        val url: String?
    )

    data class Sprites(
        @SerializedName("back_default")
        val backDefault: String?,
        @SerializedName("back_female")
        val backFemale: String?,
        @SerializedName("back_shiny")
        val backShiny: String?,
        @SerializedName("back_shiny_female")
        val backShinyFemale: String?,
        @SerializedName("front_default")
        val frontDefault: String?,
        @SerializedName("front_female")
        val frontFemale: String?,
        @SerializedName("front_shiny")
        val frontShiny: String?,
        @SerializedName("front_shiny_female")
        val frontShinyFemale: String?,
        @SerializedName("other")
        val other: Other?,
        @SerializedName("versions")
        val versions: Versions?
    ) {
        data class Other(
            @SerializedName("dream_world")
            val dreamWorld: DreamWorld?,
            @SerializedName("official-artwork")
            val officialArtwork: OfficialArtwork?
        ) {
            data class DreamWorld(
                @SerializedName("front_default")
                val frontDefault: String?,
                @SerializedName("front_female")
                val frontFemale: Any?
            )

            data class OfficialArtwork(
                @SerializedName("front_default")
                val frontDefault: String?
            )
        }

        data class Versions(
            @SerializedName("generation-i")
            val generationİ: Generationİ?,
            @SerializedName("generation-ii")
            val generationİi: Generationİi?,
            @SerializedName("generation-iii")
            val generationİii: Generationİii?,
            @SerializedName("generation-iv")
            val generationİv: Generationİv?,
            @SerializedName("generation-v")
            val generationV: GenerationV?,
            @SerializedName("generation-vi")
            val generationVi: GenerationVi?,
            @SerializedName("generation-vii")
            val generationVii: GenerationVii?,
            @SerializedName("generation-viii")
            val generationViii: GenerationViii?
        ) {
            data class Generationİ(
                @SerializedName("red-blue")
                val redBlue: RedBlue?,
                @SerializedName("yellow")
                val yellow: Yellow?
            ) {
                data class RedBlue(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_gray")
                    val backGray: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_gray")
                    val frontGray: String?
                )

                data class Yellow(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_gray")
                    val backGray: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_gray")
                    val frontGray: String?
                )
            }

            data class Generationİi(
                @SerializedName("crystal")
                val crystal: Crystal?,
                @SerializedName("gold")
                val gold: Gold?,
                @SerializedName("silver")
                val silver: Silver?
            ) {
                data class Crystal(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )

                data class Gold(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )

                data class Silver(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )
            }

            data class Generationİii(
                @SerializedName("emerald")
                val emerald: Emerald?,
                @SerializedName("firered-leafgreen")
                val fireredLeafgreen: FireredLeafgreen?,
                @SerializedName("ruby-sapphire")
                val rubySapphire: RubySapphire?
            ) {
                data class Emerald(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )

                data class FireredLeafgreen(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )

                data class RubySapphire(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?
                )
            }

            data class Generationİv(
                @SerializedName("diamond-pearl")
                val diamondPearl: DiamondPearl?,
                @SerializedName("heartgold-soulsilver")
                val heartgoldSoulsilver: HeartgoldSoulsilver?,
                @SerializedName("platinum")
                val platinum: Platinum?
            ) {
                data class DiamondPearl(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_female")
                    val backFemale: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )

                data class HeartgoldSoulsilver(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_female")
                    val backFemale: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )

                data class Platinum(
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_female")
                    val backFemale: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )
            }

            data class GenerationV(
                @SerializedName("black-white")
                val blackWhite: BlackWhite?
            ) {
                data class BlackWhite(
                    @SerializedName("animated")
                    val animated: Animated?,
                    @SerializedName("back_default")
                    val backDefault: String?,
                    @SerializedName("back_female")
                    val backFemale: String?,
                    @SerializedName("back_shiny")
                    val backShiny: String?,
                    @SerializedName("back_shiny_female")
                    val backShinyFemale: String?,
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                ) {
                    data class Animated(
                        @SerializedName("back_default")
                        val backDefault: String?,
                        @SerializedName("back_female")
                        val backFemale: String?,
                        @SerializedName("back_shiny")
                        val backShiny: String?,
                        @SerializedName("back_shiny_female")
                        val backShinyFemale: String?,
                        @SerializedName("front_default")
                        val frontDefault: String?,
                        @SerializedName("front_female")
                        val frontFemale: String?,
                        @SerializedName("front_shiny")
                        val frontShiny: String?,
                        @SerializedName("front_shiny_female")
                        val frontShinyFemale: String?
                    )
                }
            }

            data class GenerationVi(
                @SerializedName("omegaruby-alphasapphire")
                val omegarubyAlphasapphire: OmegarubyAlphasapphire?,
                @SerializedName("x-y")
                val xY: XY?
            ) {
                data class OmegarubyAlphasapphire(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )

                data class XY(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )
            }

            data class GenerationVii(
                @SerializedName("icons")
                val icons: İcons?,
                @SerializedName("ultra-sun-ultra-moon")
                val ultraSunUltraMoon: UltraSunUltraMoon?
            ) {
                data class İcons(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: Any?
                )

                data class UltraSunUltraMoon(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: String?,
                    @SerializedName("front_shiny")
                    val frontShiny: String?,
                    @SerializedName("front_shiny_female")
                    val frontShinyFemale: String?
                )
            }

            data class GenerationViii(
                @SerializedName("icons")
                val icons: İcons?
            ) {
                data class İcons(
                    @SerializedName("front_default")
                    val frontDefault: String?,
                    @SerializedName("front_female")
                    val frontFemale: Any?
                )
            }
        }
    }

    data class Stat(
        @SerializedName("base_stat")
        val baseStat: Int?,
        @SerializedName("effort")
        val effort: Int?,
        @SerializedName("stat")
        val stat: Stat?
    ) {
        data class Stat(
            @SerializedName("name")
            val name: String?,
            @SerializedName("url")
            val url: String?
        )
    }

    data class Type(
        @SerializedName("slot")
        val slot: Int?,
        @SerializedName("type")
        val type: Type?
    ) {
        data class Type(
            @SerializedName("name")
            val name: String?,
            @SerializedName("url")
            val url: String?
        )
    }
}