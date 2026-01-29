package com.example._4prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class Application {

    /**
     * ! Patrón Prototype:

     * Es un patrón de diseño creacional que nos permite copiar objetos existentes sin hacer
     * que el código dependa de sus clases.

     * * Es útil cuando queremos duplicar el contenido,
     * * el título y el autor de un documento, por ejemplo o cualquier objeto complejo.

     * https://refactoring.guru/es/design-patterns/prototype
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Document document1=new Document("cotizacion", "500 dolares", "Fernando");
        log.info("Document: {}", document1);
        document1.displayInfo();

        Document document2 = document1.clone();
        log.info("Document: {}", document2);
        document2.displayInfo();

    }

}
