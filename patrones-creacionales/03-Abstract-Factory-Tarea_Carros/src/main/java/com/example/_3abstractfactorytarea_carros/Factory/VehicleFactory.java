package com.example._3abstractfactorytarea_carros.Factory;


import com.example._3abstractfactorytarea_carros.Producto.Engine;
import com.example._3abstractfactorytarea_carros.Producto.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle();

    Engine createEngine();
}
