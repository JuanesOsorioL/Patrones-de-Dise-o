package com.example._3abstractfactory.factoryConcretas;

import com.example._3abstractfactory.factory.RestaurantFactory;
import com.example._3abstractfactory.producto.Drink;
import com.example._3abstractfactory.producto.Hamburger;
import com.example._3abstractfactory.productoConcreto.BeefHamburger;
import com.example._3abstractfactory.productoConcreto.Soda;

public class FastFoodRestaurantFactory implements RestaurantFactory {
    @Override
    public Hamburger createHamburger() {
        return new BeefHamburger();
    }

    @Override
    public Drink createDrink() {
        return new Soda();
    }
}
