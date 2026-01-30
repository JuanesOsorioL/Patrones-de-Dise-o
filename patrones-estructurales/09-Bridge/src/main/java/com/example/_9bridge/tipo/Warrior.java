package com.example._9bridge.tipo;

import com.example._9bridge.Character;
import com.example._9bridge.habilidades.base.Ability;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Warrior extends Character {

    public Warrior(Ability ability) {
        super(ability);
    }

    @Override
    public void performAbility() {
        log.info("El guerrero está listo para luchar");
        ability.use();
    }
}
