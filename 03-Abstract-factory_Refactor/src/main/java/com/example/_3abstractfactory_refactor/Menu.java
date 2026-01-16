package com.example._3abstractfactory_refactor;

import com.example._3abstractfactory_refactor.producto.Drink;
import com.example._3abstractfactory_refactor.producto.Hamburger;

public class Menu {
    private final Hamburger hamburger;
    private final Drink drink;

    public Menu(Hamburger hamburger, Drink drink) {
        this.hamburger = hamburger;
        this.drink = drink;
    }

    public void serve() {
        hamburger.prepare();
        drink.pour();
    }
}
