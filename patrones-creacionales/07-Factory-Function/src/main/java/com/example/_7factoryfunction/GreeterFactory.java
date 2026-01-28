package com.example._7factoryfunction;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class GreeterFactory {
    public static Greeter createGreeter(TypeLanguage lang) {

        return name -> {
            Map<TypeLanguage, String> messages = Map.of(
                    TypeLanguage.ES, "Hola, %s!",
                    TypeLanguage.EN, "Hello, %s!",
                    TypeLanguage.FR, "Bonjour, %s!"
            );

            String message = messages.get(lang);
            log.info(String.format(message, name));
        };
    }
}
