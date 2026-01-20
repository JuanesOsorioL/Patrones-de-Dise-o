package com.example._3abstractfactorytarea_carros.factoryConcrete;

import com.example._3abstractfactorytarea_carros.Factory.VehicleFactory;
import com.example._3abstractfactorytarea_carros.Producto.Engine;
import com.example._3abstractfactorytarea_carros.Producto.Vehicle;
import com.example._3abstractfactorytarea_carros.productosConcreta.ElectricCar;
import com.example._3abstractfactorytarea_carros.productosConcreta.ElectricEngine;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricCar();
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
