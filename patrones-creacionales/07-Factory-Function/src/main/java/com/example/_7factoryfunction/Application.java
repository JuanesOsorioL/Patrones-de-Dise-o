package com.example._7factoryfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    Greeter spanishGreeter = GreeterFactory.createGreeter(TypeLanguage.ES);
    Greeter englishGreeter = GreeterFactory.createGreeter(TypeLanguage.EN);


        spanishGreeter.greet("Juanito");
        englishGreeter.greet("jhon");


    }

}
