package com.example._9bridge.habilidades;

import com.example._9bridge.Ability;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwordAttack implements Ability {
    @Override
    public void use() {
        log.info("ataca con espada ferozmente");
    }
}
