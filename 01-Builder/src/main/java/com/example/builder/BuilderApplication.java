package com.example.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BuilderApplication {


    private static final Logger log = LoggerFactory.getLogger(BuilderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);
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
