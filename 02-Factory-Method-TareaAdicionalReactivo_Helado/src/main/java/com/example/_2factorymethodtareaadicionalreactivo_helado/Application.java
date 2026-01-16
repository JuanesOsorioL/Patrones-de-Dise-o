package com.example._2factorymethodtareaadicionalreactivo_helado;

import com.example._2factorymethodtareaadicionalreactivo_helado.factoriesConcretas.ChocolateFactory;
import com.example._2factorymethodtareaadicionalreactivo_helado.factoriesConcretas.VanillaFactory;
import com.example._2factorymethodtareaadicionalreactivo_helado.factoryMethod.IceCreamFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        IceCreamFactory chocolateFactory = new ChocolateFactory();
        IceCreamFactory vanillaFactory = new VanillaFactory();

        log.info("=== PEDIDO CHOCOLATE ===");
        chocolateFactory.serveIceCreamAsync()
                .subscribe();

        log.info("=== PEDIDO VAINILLA ===");
        vanillaFactory.serveIceCreamAsync()
                .subscribe();
    }

}
