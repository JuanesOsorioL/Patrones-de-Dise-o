package com.example._9bridge;

import com.example._9bridge.habilidades.AxeAttack;
import com.example._9bridge.habilidades.SwordAttack;
import com.example._9bridge.tipo.Warrior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * ! Patrón Bridge
     * Este patrón nos permite desacoplar una abstracción de su implementación,
     * de tal forma que ambas puedan variar independientemente.
     * <p>
     * * Es útil cuando se tienen múltiples implementaciones de una abstracción
     * * Se puede utilizar para separar la lógica de negocio de la lógica de presentación
     * * Se puede utilizar para separar la lógica de la interfaz de usuario también.
     * <p>
     * https://refactoring.guru/es/design-patterns/bridge
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        SwordAttack habilidadswordAttack = new SwordAttack();
        AxeAttack habilidadAxeAttack = new AxeAttack();

        Warrior warrior = new Warrior(habilidadswordAttack);
        warrior.performAbility();

        warrior.setAbility(habilidadAxeAttack);
        warrior.performAbility();



    }

}
