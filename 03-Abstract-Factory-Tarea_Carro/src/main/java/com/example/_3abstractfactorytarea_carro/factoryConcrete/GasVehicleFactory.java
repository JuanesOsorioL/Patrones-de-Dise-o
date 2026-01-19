package com.example._3abstractfactorytarea_carro.factoryConcrete;

import com.example._3abstractfactorytarea_carro.Factory.VehicleFactory;
import com.example._3abstractfactorytarea_carro.Producto.Engine;
import com.example._3abstractfactorytarea_carro.Producto.Vehicle;
import com.example._3abstractfactorytarea_carro.productosConcreta.GasCar;
import com.example._3abstractfactorytarea_carro.productosConcreta.GasEngine;

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
