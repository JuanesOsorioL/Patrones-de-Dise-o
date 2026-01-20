package com.example._3abstractfactorytarea_carros.factoryConcrete;


import com.example._3abstractfactorytarea_carros.Factory.VehicleFactory;
import com.example._3abstractfactorytarea_carros.Producto.Engine;
import com.example._3abstractfactorytarea_carros.Producto.Vehicle;
import com.example._3abstractfactorytarea_carros.productosConcreta.GasCar;
import com.example._3abstractfactorytarea_carros.productosConcreta.GasEngine;

public class GasVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasCar();
    }

    @Override
    public Engine createEngine() {
        return new GasEngine();
    }
}
