package com.example._7factoryfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * ! Patrón Prototype:

     * Es un patrón de diseño creacional que nos permite copiar objetos existentes sin hacer
     * que el código dependa de sus clases.
     *
     * * Es útil cuando queremos duplicar el contenido,
     * * el título y el autor de un documento, por ejemplo o cualquier objeto complejo.
     *
     * https://refactoring.guru/es/design-patterns/prototype
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    Greeter spanishGreeter = GreeterFactory.createGreeter(TypeLanguage.ES);
    Greeter englishGreeter = GreeterFactory.createGreeter(TypeLanguage.EN);


        spanishGreeter.greet("Juanito");
        englishGreeter.greet("jhon");


    }

}
