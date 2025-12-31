package com.example._2factorymethodtareaadicional_juego;

import lombok.extern.slf4j.Slf4j;

//producto concreto
@Slf4j
public class SolitaireGame implements Game {

    private String player;

    public SolitaireGame(String player) {
        this.player = player;
    }

    @Override
    public void start() {
        log.info("Iniciando juego de solitario");
    }
}
