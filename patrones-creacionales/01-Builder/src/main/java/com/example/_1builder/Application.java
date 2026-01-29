package com.example._1builder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
        @Bean
        CommandLineRunner demoBuilder() {
            return args -> {
                Computer basicComputer = new ComputerBuilder()
                        .setCpu("intel core 2 duo")
                        .setRam("4GB")
                        .setDisk("64GB")
                        .build();

                log.info("basicComputer = {}", basicComputer);

                Computer fullComputer = new ComputerBuilder()
                        .setCpu("intel core 2 duo")
                        .setRam("4GB")
                        .setDisk("64GB")
                        .setGpu("trx8090")
                        .build();

                log.info("fullComputer = {}", fullComputer);
            };
        }
    }