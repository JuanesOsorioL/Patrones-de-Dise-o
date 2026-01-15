package com.example._2factorymethodtareaadicional_juego;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner demo() {
        String[] jugadores = {"carlos", "mario"};
        String[] jugadores1 = {};

        return args -> {
            Board chessBoard = new ChessBoard(jugadores);
            chessBoard.initialize();

            Board solitarioBoard = new SolitaireBoard(jugadores);
            solitarioBoard.initialize();

            Board chessBoard1 = new ChessBoard(jugadores1);
            chessBoard1.initialize();

            Board solitarioBoard1 = new SolitaireBoard(jugadores1);
            solitarioBoard1.initialize();
        };
    }



}
