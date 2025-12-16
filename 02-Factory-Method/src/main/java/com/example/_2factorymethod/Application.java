package com.example._2factorymethod;

import com.example._2factorymethod.factory.BeanRestaurant;
import com.example._2factorymethod.factory.BeefRestaurant;
import com.example._2factorymethod.factory.ChickenRestaurant;
import com.example._2factorymethod.factory.Restaurant;
import com.example._2factorymethod.model.BurgerType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;
import java.util.logging.Logger;

@SpringBootApplication
public class Application {

    Logger logger = Logger.getLogger(Application.class.getName());


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner demo() {
        Scanner sc = new Scanner(System.in);

        return args -> {


            logger.info("Tipo de hamburguesa (beef/chicken/bean): ");
            String input = sc.nextLine().trim().toUpperCase();

            BurgerType type;
            try {
                type = BurgerType.valueOf(input);
            } catch (IllegalArgumentException e) {
                logger.info("Tipo inválido, se usará BEEF por defecto.");
                type = BurgerType.BEEF;
            }

            Restaurant restaurant = switch (type) {
                case BEEF -> new BeefRestaurant();
                case CHICKEN -> new ChickenRestaurant();
                case BEAN -> new BeanRestaurant();
                default -> throw new IllegalStateException("Tipo no soportado: " + type);
            };

            restaurant.orderHamburger();

        };
    }
}
