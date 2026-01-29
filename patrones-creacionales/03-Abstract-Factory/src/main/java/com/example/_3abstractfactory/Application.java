package com.example._3abstractfactory;

import com.example._3abstractfactory.factory.RestaurantFactory;
import com.example._3abstractfactory.factoryConcretas.FastFoodRestaurantFactory;
import com.example._3abstractfactory.factoryConcretas.HealthyFoodRestaurantFactory;
import com.example._3abstractfactory.producto.Drink;
import com.example._3abstractfactory.producto.Hamburger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    /**
     * ! Abstract Factory:
     * Es un patrón de diseño que permite crear familias de objetos relacionados
     * sin especificar sus clases concretas.
     *
     * En lugar de crear objetos individuales directamente,
     * creamos fábricas que producen un conjunto de objetos relacionados.
     *
     * * Es útil cuando necesitas crear objetos que son parte de una familia
     * * y quieres asegurarte de que estos objetos se complementen entre sí.
     *
     * https://refactoring.guru/es/design-patterns/abstract-factory
     */

    /**
     *  El propósito del Abstract Factory es crear familias de objetos relacionados
     *  (en este caso, hamburguesas y bebidas) sin especificar las clases concretas
     *  de cada uno de esos objetos en el código principal.
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // Elegimos la fábrica (familia completa)
        RestaurantFactory healthyFactory = new HealthyFoodRestaurantFactory();
        RestaurantFactory fastFoodFactory = new FastFoodRestaurantFactory();

        log.info("=== PEDIDO SALUDABLE ===");
        serveMenu(healthyFactory);

        log.info("=== PEDIDO COMIDA RÁPIDA ===");
        serveMenu(fastFoodFactory);
    }

    private static void serveMenu(RestaurantFactory factory) {
        Hamburger hamburger = factory.createHamburger();
        Drink drink = factory.createDrink();

        hamburger.prepare();
        drink.pour();
    }


}
