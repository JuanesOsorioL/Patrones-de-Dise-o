package com.example._3abstractfactorytarea_carro.productosConcreta;

import com.example._3abstractfactorytarea_carro.Producto.Vehicle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ElectricCar implements Vehicle {
    @Override
    public void assemble() {
        log.info("Ensamblando un carro eléctrico");
    }
}
