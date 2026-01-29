package com.example._2factorymethod.product;

import java.util.logging.Logger;


public class ChickenHamburger implements Hamburger {
    Logger logger = Logger.getLogger(ChickenHamburger.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Pollo");
    }
}
