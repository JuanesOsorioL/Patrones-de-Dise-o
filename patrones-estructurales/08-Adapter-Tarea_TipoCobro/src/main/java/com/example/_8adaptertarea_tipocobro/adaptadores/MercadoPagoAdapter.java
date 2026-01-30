package com.example._8adaptertarea_tipocobro.adaptadores;

import com.example._8adaptertarea_tipocobro.common.PaymentProcessor;
import com.example._8adaptertarea_tipocobro.servicio.MercadoPagoService;
import org.springframework.stereotype.Component;

@Component
public class MercadoPagoAdapter implements PaymentProcessor {

    private final MercadoPagoService mercadoPagoService;

    public MercadoPagoAdapter(MercadoPagoService mercadoPagoService) {
        this.mercadoPagoService = mercadoPagoService;
    }


    @Override
    public void processPayment(Integer amount) {
        mercadoPagoService.pay(amount);
    }
}
