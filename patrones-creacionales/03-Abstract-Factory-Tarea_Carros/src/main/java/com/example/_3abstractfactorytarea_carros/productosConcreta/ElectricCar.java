package com.example._3abstractfactorytarea_carros.productosConcreta;


import com.example._3abstractfactorytarea_carros.Producto.Vehicle;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ElectricCar implements Vehicle {
    @Override
    public void assemble() {
        log.info("Ensamblando un carro eléctrico");
    }
}
