package com.example._6singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonEsferasDelDragonApplication {

    /**
     * ! Singleton:
     * Es un patrón de diseño creacional que garantiza que una clase
     * tenga una única instancia y proporciona un punto de acceso global a ella.
     *
     * * Es útil cuando necesitas controlar el acceso a una única instancia
     * * de una clase, como por ejemplo, en un objeto de base de datos o en un
     * * objeto de configuración.
     *
     * https://refactoring.guru/es/design-patterns/singleton
     */


    public static void main(String[] args) {
        SpringApplication.run(SingletonEsferasDelDragonApplication.class, args);

        DragonBalls goku = DragonBalls.getInstance();
        goku.collectDragonBall();
        goku.collectDragonBall();
        goku.collectDragonBall();
        goku.summonShenLong();

        DragonBalls vegueta = DragonBalls.getInstance();
        vegueta.collectDragonBall();
        vegueta.collectDragonBall();
        vegueta.collectDragonBall();
        vegueta.collectDragonBall();

        goku.collectDragonBall();
        vegueta.collectDragonBall();

        goku.summonShenLong();
        vegueta.summonShenLong();




    }

}
