package com.example._6singletontarea_database;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean connected = false;

    private DatabaseConnection() {
        log.info("DatabaseConnection creada");
    }

    // Método estático para obtener la instancia única
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para conectar a la base de datos
    public void connect() {
        if (connected) {
            log.info("Ya estábamos conectados a la BD");
            return;
        }
        log.info("Ya estamos conectados a la BD");
        connected = true;

    }

    // Método para desconectar de la base de datos
    public void disconnect() {
        if (connected) {
            log.info("Desconectamos la conexión a la BD");
            connected = false;
            return;
        }
        log.info("No hay conexión activa");
    }




}
