package com.example._3abstractfactory_refactor.factoryConcretas;


import com.example._3abstractfactory_refactor.factory.RestaurantFactory;
import com.example._3abstractfactory_refactor.producto.Drink;
import com.example._3abstractfactory_refactor.producto.Hamburger;
import com.example._3abstractfactory_refactor.productoConcreto.BeefHamburger;
import com.example._3abstractfactory_refactor.productoConcreto.Soda;

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
