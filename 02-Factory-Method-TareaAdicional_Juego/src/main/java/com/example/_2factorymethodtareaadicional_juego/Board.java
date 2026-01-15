package com.example._2factorymethodtareaadicional_juego;

import lombok.Getter;

//creador
public abstract class Board {

    private Game game;
    @Getter
    private String[] players;


    protected Board(String[] players) {
        this.players = players;
    }

    // Método fabrica - el encargado de construir los objectos
    protected abstract Game createGame();

    // Método plantilla
    public void initialize() {
        game = createGame();
        game.start();
    }
}
