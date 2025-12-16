package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.BeefHamburguer;
import com.example._2factorymethod.product.Hamburguer;

public class BeefRestaurant extends Restaurant {
    @Override
    Hamburguer createHamburguer() {
        return new BeefHamburguer();
    }
}
