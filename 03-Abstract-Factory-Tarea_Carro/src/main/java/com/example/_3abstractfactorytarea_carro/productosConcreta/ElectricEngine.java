package com.example._3abstractfactorytarea_carro.productosConcreta;

import com.example._3abstractfactorytarea_carro.Producto.Engine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        log.info("Arrancando motor eléctrico");
    }
}
