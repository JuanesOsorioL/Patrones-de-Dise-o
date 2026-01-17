package com.example._3abstractfactory_refactor;

import com.example._3abstractfactory_refactor.Enum.RestaurantType;
import com.example._3abstractfactory_refactor.factory.RestaurantFactory;
import com.example._3abstractfactory_refactor.factoryConcretas.FastFoodRestaurantFactory;
import com.example._3abstractfactory_refactor.factoryConcretas.HealthyFoodRestaurantFactory;
import com.example._3abstractfactory_refactor.producto.Drink;
import com.example._3abstractfactory_refactor.producto.Hamburger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example._3abstractfactory_refactor.Enum.RestaurantType.FAST_FOOD;
import static com.example._3abstractfactory_refactor.Enum.RestaurantType.HEALTHY;
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.info("=== PEDIDO SALUDABLE ===");
        RestaurantFactory healthyFactory = getFactory(RestaurantType.HEALTHY);
        serveMenu(healthyFactory);

        log.info("=== PEDIDO COMIDA RÁPIDA ===");
        RestaurantFactory fastFoodFactory = getFactory(RestaurantType.FAST_FOOD);
        serveMenu(fastFoodFactory);

    }

    private static void serveMenu(RestaurantFactory factory) {
        Hamburger hamburger = factory.createHamburger();
        Drink drink = factory.createDrink();

        hamburger.prepare();
        drink.pour();
    }


    static RestaurantFactory getFactory(RestaurantType type) {
        return switch (type) {
            case HEALTHY -> new HealthyFoodRestaurantFactory();
            case FAST_FOOD -> new FastFoodRestaurantFactory();
        };
    }
}
