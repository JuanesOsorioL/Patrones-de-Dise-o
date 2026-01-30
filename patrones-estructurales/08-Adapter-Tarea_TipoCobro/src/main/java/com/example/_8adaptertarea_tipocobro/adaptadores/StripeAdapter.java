package com.example._8adaptertarea_tipocobro.adaptadores;

import com.example._8adaptertarea_tipocobro.common.PaymentProcessor;
import com.example._8adaptertarea_tipocobro.servicio.StripeService;
import org.springframework.stereotype.Component;

@Component
public class StripeAdapter implements PaymentProcessor {

    private final StripeService stripeService;

    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }


    @Override
    public void processPayment(Integer amount) {
        stripeService.makeCharge(amount);
    }
}
