package com.example._3abstractfactorytarea_carro.Factory;

import com.example._3abstractfactorytarea_carro.Producto.Engine;
import com.example._3abstractfactorytarea_carro.Producto.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle();

    Engine createEngine();
}
