package com.example._3abstractfactory_refactor.factoryConcretas;


import com.example._3abstractfactory_refactor.factory.RestaurantFactory;
import com.example._3abstractfactory_refactor.producto.Drink;
import com.example._3abstractfactory_refactor.producto.Hamburger;
import com.example._3abstractfactory_refactor.productoConcreto.ChickenHamburger;
import com.example._3abstractfactory_refactor.productoConcreto.Water;

public class HealthyFoodRestaurantFactory implements RestaurantFactory {
    @Override
    public Hamburger createHamburger() {
        return new ChickenHamburger();
    }

    @Override
    public Drink createDrink() {
        return new Water();
    }
}
