package com.example._9bridge.habilidades;

import com.example._9bridge.Ability;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FireballSpell implements Ability {
    @Override
    public void use() {
        log.info("Lanza una bola de fuego");
    }
}
