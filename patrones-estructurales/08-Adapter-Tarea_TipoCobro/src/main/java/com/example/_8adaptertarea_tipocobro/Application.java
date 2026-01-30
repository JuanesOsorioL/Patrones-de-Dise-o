package com.example._8adaptertarea_tipocobro;

import com.example._8adaptertarea_tipocobro.adaptadores.MercadoPagoAdapter;
import com.example._8adaptertarea_tipocobro.adaptadores.PaypalAdapter;
import com.example._8adaptertarea_tipocobro.adaptadores.StripeAdapter;
import com.example._8adaptertarea_tipocobro.common.PaymentProcessor;
import com.example._8adaptertarea_tipocobro.servicio.MercadoPagoService;
import com.example._8adaptertarea_tipocobro.servicio.PayPalService;
import com.example._8adaptertarea_tipocobro.servicio.StripeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    /**
     * ! Patrón Adapter
     * Permite que objetos con interfaces incompatibles trabajen juntos, también es muy
     * util para utilizar librerías de terceros en nuestra aplicación sin depender
     * directamente de ellas.
     * <p>
     * * Es útil cuando se quiere reutilizar una clase que no tiene la interfaz que
     * * necesitamos o cuando queremos crear una capa de abstracción para una librería
     * * de terceros.
     * <p>
     * https://refactoring.guru/es/design-patterns/adapter
     */


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        PayPalService paypalService = new PayPalService();
        StripeService stripeService = new StripeService();
        MercadoPagoService mercadoPagoService = new MercadoPagoService();

        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalService);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeService);
        PaymentProcessor mercadoPagoProcessor = new MercadoPagoAdapter(mercadoPagoService);

        Integer paymentAmount = 1000;

        log.info("usando paypal");
        paypalProcessor.processPayment(paymentAmount);

        log.info("usando stripe");
        stripeProcessor.processPayment(paymentAmount);

        log.info("usando Mercado pago");
        mercadoPagoProcessor.processPayment(paymentAmount);
    }
}
