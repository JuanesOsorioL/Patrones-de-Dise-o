package com.example._1builderreactivo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class Application {

    private final ComputerService computerService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner demo() {
        return args -> {
            log.info("Iniciando demo reactiva Builder...");

            computerService.creationComputer()
                    .block();

            log.info("Demo reactiva finalizada.");
        };
    }
}
