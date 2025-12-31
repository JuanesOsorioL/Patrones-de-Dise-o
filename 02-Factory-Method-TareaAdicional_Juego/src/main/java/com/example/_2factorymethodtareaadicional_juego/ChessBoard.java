package com.example._2factorymethodtareaadicional_juego;

public class ChessBoard extends Board {

    public ChessBoard(String[] player) {
        super(player);
    }

    @Override
    Game createGame() {

        String[] player = getPlayer();

        String playerOne = "Blanco";
        String playerTwo = "Negro";

        if (player[0].equals(playerOne) && player[1].equals(playerTwo)) {

        }


        return new ChessGame(playerOne,playerTwo);

    }
}
//control d , duplica linea