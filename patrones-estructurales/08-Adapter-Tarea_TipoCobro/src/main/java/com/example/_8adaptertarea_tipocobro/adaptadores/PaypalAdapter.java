package com.example._8adaptertarea_tipocobro.adaptadores;

import com.example._8adaptertarea_tipocobro.common.PaymentProcessor;
import com.example._8adaptertarea_tipocobro.servicio.PayPalService;
import org.springframework.stereotype.Component;

@Component
public class PaypalAdapter implements PaymentProcessor {

    private final PayPalService payPalService;

    public PaypalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }


    @Override
    public void processPayment(Integer amount) {
        payPalService.sendPayment(amount);
    }
}
