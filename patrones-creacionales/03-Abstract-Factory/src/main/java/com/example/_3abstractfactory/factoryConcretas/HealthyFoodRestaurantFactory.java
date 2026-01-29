package com.example._3abstractfactory.factoryConcretas;

import com.example._3abstractfactory.factory.RestaurantFactory;
import com.example._3abstractfactory.producto.Drink;
import com.example._3abstractfactory.producto.Hamburger;
import com.example._3abstractfactory.productoConcreto.ChickenHamburger;
import com.example._3abstractfactory.productoConcreto.Water;

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
