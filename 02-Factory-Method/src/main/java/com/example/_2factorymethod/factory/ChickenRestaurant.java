package com.example._2factorymethod.factory;


import com.example._2factorymethod.product.ChickenHamburguer;
import com.example._2factorymethod.product.Hamburguer;

public class ChickenRestaurant extends Restaurant {
    @Override
    Hamburguer createHamburguer() {
        return new ChickenHamburguer();
    }
}
