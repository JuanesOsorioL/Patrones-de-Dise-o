package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.Hamburguer;

public abstract class Restaurant {
    abstract Hamburguer createHamburguer();

    public void orderHamburger() {
        Hamburguer hamburguer = this.createHamburguer();
        hamburguer.prepare();
    }
}
