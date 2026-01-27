package com.example._6singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DragonBalls {
    private static DragonBalls instance;
    private Integer dragonBallsCollected;

    private DragonBalls() {
        this.dragonBallsCollected = 0;
    }

    public static DragonBalls getInstance() {
        if (instance == null) {
            instance = new DragonBalls();
            log.info("Las esferas del dragón han sido creadas");
        }
        return instance;
    }

    public void collectDragonBall() {
        if (dragonBallsCollected >= 7) {
            log.warn("No se puede recolectar más esferas, ya están completas");
            return;
        }

        dragonBallsCollected++;
        log.info("Esfera recolectada. Total actual: {}", dragonBallsCollected);
    }

    public void summonShenLong() {
        if (dragonBallsCollected < 7) {
            int missing = 7 - dragonBallsCollected;
            log.warn("No se puede invocar a Shenlong. Faltan {} esferas del dragón", missing);
            return;
        }

        log.info("¡Shenlong ha sido invocado! Pide tu deseo.");
        dragonBallsCollected = 0;
    }

}
