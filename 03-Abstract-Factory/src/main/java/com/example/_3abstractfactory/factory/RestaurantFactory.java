package com.example._3abstractfactory.factory;

import com.example._3abstractfactory.producto.Drink;
import com.example._3abstractfactory.producto.Hamburger;

public interface RestaurantFactory {
    Hamburger createHamburger();
    Drink createDrink();
}
