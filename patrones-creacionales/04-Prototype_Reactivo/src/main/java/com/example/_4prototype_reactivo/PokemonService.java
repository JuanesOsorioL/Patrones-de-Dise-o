package com.example._4prototype_reactivo;

import reactor.core.publisher.Mono;

public class PokemonService {
    public Mono<Pokemon> clonarPokemon(Pokemon pokemon){
        return Mono.fromSupplier(pokemon::clonar);
    }
}
