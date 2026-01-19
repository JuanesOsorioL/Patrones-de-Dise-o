package com.example._3abstractfactorytarea_carro.factoryConcrete;

import com.example._3abstractfactorytarea_carro.Factory.VehicleFactory;
import com.example._3abstractfactorytarea_carro.Producto.Engine;
import com.example._3abstractfactorytarea_carro.Producto.Vehicle;
import com.example._3abstractfactorytarea_carro.productosConcreta.ElectricCar;
import com.example._3abstractfactorytarea_carro.productosConcreta.ElectricEngine;

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
