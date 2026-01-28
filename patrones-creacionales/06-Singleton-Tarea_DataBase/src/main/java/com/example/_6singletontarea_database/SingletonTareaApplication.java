package com.example._6singletontarea_database;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SingletonTareaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonTareaApplication.class, args);

        DatabaseConnection bd1 = DatabaseConnection.getInstance();
        // Debería conectar a la base de datos
        bd1.connect();

        DatabaseConnection bd2 = DatabaseConnection.getInstance();
        // Debería mostrar que ya existe una conexión activa
        bd2.connect();

        log.info("son iguales db1==db2 {}", bd1.equals(bd2));

        bd1.disconnect();
        // Debería cerrar la conexión
        bd2.disconnect();

        // Ahora debería conectar de nuevo, ya que se cerró la anterior
        bd2.connect();

    }

}
