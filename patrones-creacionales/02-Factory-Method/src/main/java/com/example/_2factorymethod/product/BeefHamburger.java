package com.example._2factorymethod.product;

import java.util.logging.Logger;

public class BeefHamburger implements Hamburger {

    Logger logger = Logger.getLogger(BeefHamburger.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Carne");
    }
}
