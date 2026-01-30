package com.example._8adaptertarea_tipocobro.servicio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MercadoPagoService {

    public void pay(Integer amount) {
        log.info("procesando pago de {} con MercadoPago ", amount);
    }

}
