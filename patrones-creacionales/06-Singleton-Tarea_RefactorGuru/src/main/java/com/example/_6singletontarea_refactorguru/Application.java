package com.example._6singletontarea_refactorguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // Obtener la instancia del Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Comparar si ambas referencias apuntan a la misma instancia
        System.out.println(singleton1 == singleton2);  // Salida: true
    }

}
