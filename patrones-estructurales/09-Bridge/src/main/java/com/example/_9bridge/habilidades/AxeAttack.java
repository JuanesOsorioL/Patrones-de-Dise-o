package com.example._9bridge.habilidades;

import com.example._9bridge.habilidades.base.Ability;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AxeAttack implements Ability {
    @Override
    public void use() {
        log.info("Ataca con una hacha brutalmente");
    }
}
