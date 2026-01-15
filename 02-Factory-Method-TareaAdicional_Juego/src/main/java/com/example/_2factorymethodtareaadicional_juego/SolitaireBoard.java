package com.example._2factorymethodtareaadicional_juego;

public class SolitaireBoard extends Board {

    public SolitaireBoard(String[] player) {
        super(player);
    }

    @Override
    protected Game createGame() {

        String[] players = getPlayers();

        String player = players != null && players.length > 0 && players[0] != null && !players[0].isBlank() ? players[0] : "Jugador";

        return new SolitaireGame(player);
    }
}
