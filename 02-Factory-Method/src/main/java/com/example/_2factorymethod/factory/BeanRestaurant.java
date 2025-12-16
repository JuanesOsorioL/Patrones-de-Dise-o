package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.BeanHamburguer;
import com.example._2factorymethod.product.Hamburguer;

public class BeanRestaurant extends Restaurant {
    @Override
    Hamburguer createHamburguer() {
        return new BeanHamburguer();
    }
}
