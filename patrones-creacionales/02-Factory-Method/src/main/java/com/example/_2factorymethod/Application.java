package com.example._2factorymethod;

import com.example._2factorymethod.factory.BeanRestaurant;
import com.example._2factorymethod.factory.BeefRestaurant;
import com.example._2factorymethod.factory.ChickenRestaurant;
import com.example._2factorymethod.factory.Restaurant;
import com.example._2factorymethod.model.BurgerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner demo() {
        Scanner sc = new Scanner(System.in);

        return args -> {

            log.info("Tipo de hamburguesa (beef/chicken/bean): ");
            String input = sc.nextLine().trim().toUpperCase();

            BurgerType type = tryParseBurgerType(input);

            Restaurant restaurant = switch (type) {
                case BEEF -> new BeefRestaurant();
                case CHICKEN -> new ChickenRestaurant();
                case BEAN -> new BeanRestaurant();
            };
            log.info("Cliente ordenó: {}", type);
            restaurant.orderHamburger();
        };
    }


    private BurgerType tryParseBurgerType(String input) {
        try {
            return BurgerType.valueOf(input);
        } catch (IllegalArgumentException e) {
            log.warn("Tipo inválido '{}', usando BEEF", input);
            return BurgerType.BEEF;
        }
    }


}

