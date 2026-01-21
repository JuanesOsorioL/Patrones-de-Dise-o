package com.example._4prototypetarea_pokemon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {
    /**
     * ! Patrón Prototype:
     * <p>
     * Es un patrón de diseño creacional que nos permite copiar objetos existentes sin hacer
     * que el código dependa de sus clases.
     * <p>
     * * Es útil cuando queremos duplicar el contenido,
     * * el título y el autor de un documento, por ejemplo o cualquier objeto complejo.
     * <p>
     * https://refactoring.guru/es/design-patterns/prototype
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Pokemon basePokemon = new Pokemon("Charmeleon", "Fuego", 16, List.of("LLamarada", "Arañazo"));

        Pokemon pokemonClone = basePokemon.clonar();
        pokemonClone.setAtaques("Patada de Fuego");

        log.info("Pokemon Base  {}", basePokemon);
        log.info("Pokemon clonado{}", pokemonClone);


    }

}
