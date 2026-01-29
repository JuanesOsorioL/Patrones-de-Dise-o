package com.example._8adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        LoggerAdapter logger = new LoggerAdapter("Application_Adapter");

        logger.writeLog("prueba info");
        logger.writeError("prueba error");
        logger.writeWarning("prueba warning");
    }

}
