package com.example._2factorymethodtareaadicional_juego;

//creador concreto
public class ChessBoard extends Board {

    public ChessBoard(String[] players) {
        super(players);
    }

    @Override
    protected Game createGame() {

        String[] players = getPlayers();

        String playerOne = players != null && players.length > 0 && players[0] != null && !players[0].isBlank() ? players[0] : "Blanco";
        String playerTwo = players != null && players.length > 1 && players[1] != null && !players[1].isBlank() ? players[1] : "Negro";

        return new ChessGame(playerOne, playerTwo);

    }
}
//control d , duplica linea