package com.example._2factorymethodtareaadicional_juego;

//creador
public abstract class Board {

    private Game game;
    private String[] player;


    public Board(String[] player) {
        this.player = player;
    }

    // Metodo fabrica - el encargado de construir los objectos
    abstract Game createGame();

    // Metodo plantilla
    public void initialize() {
        game = createGame();
        game.start();
    }

    public String[] getPlayer() {
        return player;
    }
}
