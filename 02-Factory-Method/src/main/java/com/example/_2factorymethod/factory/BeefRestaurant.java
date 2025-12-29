package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.BeefHamburger;
import com.example._2factorymethod.product.Hamburger;

public class BeefRestaurant extends Restaurant {
    @Override
    Hamburger createHamburger() {
        return new BeefHamburger();
    }
}
