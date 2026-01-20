package com.example._4prototypetareaadicional_pizza;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // 1- Crear un prototipo base
        PedidoPizza pizza = new PedidoPizza("Grande", "Normal", List.of("Muzarela", "Salsa de tomate"));

        // 2 - variante clon con aceitunas
        PedidoPizza pizzaConAceituna = pizza.clonar();
        pizzaConAceituna.agregarIngredientes("Aceituna");

        // 3 - Variante con jamon sin aceitunas
        PedidoPizza pizzaConJamon = pizza.clonar();
        pizzaConJamon.agregarIngredientes("Jamon");


        //4 - variante "Especial"
        PedidoPizzaEspecial pizzaEspecial = new PedidoPizzaEspecial("Mediana", "Fina", List.of("Muzarela", "Salsa"), true);

        //5 - Variante especial con rucula
        PedidoPizzaEspecial pizzaEspecialConRucula = pizzaEspecial.clonar();
        pizzaEspecialConRucula.agregarIngredientes("Rucula");


        //Resultados
        log.info("Pizza base {}", pizza);
        log.info("variante con aceituna {}", pizzaConAceituna);
        log.info("variante con jamon {}", pizzaConJamon);
        log.info("pizza especial {}", pizzaEspecial);
        log.info("Especial con variante de ricula {}", pizzaEspecialConRucula);


    }

}
