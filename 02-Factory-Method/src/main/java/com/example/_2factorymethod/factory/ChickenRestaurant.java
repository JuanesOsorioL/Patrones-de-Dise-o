package com.example._2factorymethod.factory;


import com.example._2factorymethod.product.ChickenHamburger;
import com.example._2factorymethod.product.Hamburger;

public class ChickenRestaurant extends Restaurant {
    @Override
    Hamburger createHamburger() {
        return new ChickenHamburger();
    }
}
