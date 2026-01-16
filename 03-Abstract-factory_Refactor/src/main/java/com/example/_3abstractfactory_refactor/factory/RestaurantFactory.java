package com.example._3abstractfactory_refactor.factory;


import com.example._3abstractfactory_refactor.producto.Drink;
import com.example._3abstractfactory_refactor.producto.Hamburger;

public interface RestaurantFactory {
    Hamburger createHamburger();
    Drink createDrink();
}
