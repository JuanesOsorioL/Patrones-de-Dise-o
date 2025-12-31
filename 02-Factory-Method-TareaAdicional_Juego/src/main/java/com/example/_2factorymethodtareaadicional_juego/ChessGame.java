package com.example._2factorymethodtareaadicional_juego;

import lombok.extern.slf4j.Slf4j;

//producto concreto
@Slf4j
public class ChessGame implements Game {

    private String playerOne;
    private String playerTwo;

    public ChessGame(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public void start() {
        log.info("Iniciando juego de ajedrez");
    }
}
