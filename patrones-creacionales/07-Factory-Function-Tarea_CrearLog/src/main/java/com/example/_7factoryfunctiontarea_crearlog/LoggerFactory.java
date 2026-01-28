package com.example._7factoryfunctiontarea_crearlog;

import java.time.LocalDateTime;
import java.util.Map;

public class LoggerFactory {


    public static String fechatoString(LocalDateTime fecha) {
        return fecha.toString();
    }


    public static Logger createLogger(LogLevel level) {

        return (String contenido) -> {

            LocalDateTime now = LocalDateTime.now();
            String fecha = fechatoString(now);

            Map<LogLevel, String> prefijo = Map.of(
                    LogLevel.INFO, "INFO",
                    LogLevel.WARN, "WARNING",
                    LogLevel.ERROR, "ERROR"
            );

            System.out.println("[" + prefijo.get(level) + ":" + fecha + "]" + contenido);

        };
    }
}


