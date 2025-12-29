package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.BeanHamburger;
import com.example._2factorymethod.product.Hamburger;

public class BeanRestaurant extends Restaurant {
    @Override
    Hamburger createHamburger() {
        return new BeanHamburger();
    }
}
