package com.example._4prototype_reactivo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Pokemon pokemonBase = new Pokemon("Charmeleon",
                "Fuego",
                16,
                List.of("Llamarada", "Arañazo")
        );
        log.info("Pokemon Base: {}", pokemonBase);

        PokemonService service = new PokemonService();
        service.clonarPokemon(pokemonBase)
                .doOnNext(pokemonClonado -> pokemonClonado.setAtaques("Patada de Fuego"))
                .doOnNext(pokemonClo -> log.info("Pokemon clonado {}", pokemonClo))
                .subscribe();

        log.info("Pokemon Base: {}", pokemonBase);

    }

}
