package com.example._2factorymethod.factory;

import com.example._2factorymethod.product.Hamburger;

public abstract class Restaurant {
    protected  abstract Hamburger createHamburger();

    public void orderHamburger() {
        Hamburger hamburger = this.createHamburger();
        hamburger.prepare();
    }
}
