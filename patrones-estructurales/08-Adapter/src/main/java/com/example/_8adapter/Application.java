package com.example._8adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * ! Patrón Adapter
     *  Permite que objetos con interfaces incompatibles trabajen juntos, también es muy
     *  util para utilizar librerías de terceros en nuestra aplicación sin depender
     *  directamente de ellas.
     *
     * * Es útil cuando se quiere reutilizar una clase que no tiene la interfaz que
     * * necesitamos o cuando queremos crear una capa de abstracción para una librería
     * * de terceros.
     *
     * https://refactoring.guru/es/design-patterns/adapter
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        LoggerAdapter logger = new LoggerAdapter("Application_Adapter");

        logger.writeLog("prueba info");
        logger.writeError("prueba error");
        logger.writeWarning("prueba warning");
    }

}
