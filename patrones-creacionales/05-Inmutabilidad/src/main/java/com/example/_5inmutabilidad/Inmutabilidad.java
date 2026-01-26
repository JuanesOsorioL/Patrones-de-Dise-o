package com.example._5inmutabilidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Inmutabilidad {
    /**
     * ! Inmutabilidad con copia
     * Aunque la inmutabilidad es una buena práctica, no siempre es posible.
     * En estos casos, se puede hacer una copia del objeto y modificar la copia.
     *
     *  * Es útil para mantener un historial de estados en aplicaciones interactivas.
     *
     */

    public static void main(String[] args) {
        SpringApplication.run(Inmutabilidad.class, args);
    }

}
