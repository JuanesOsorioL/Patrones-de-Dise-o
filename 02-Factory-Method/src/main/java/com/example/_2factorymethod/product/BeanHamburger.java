package com.example._2factorymethod.product;

import java.util.logging.Logger;

public class BeanHamburger implements Hamburger {

    Logger logger = Logger.getLogger(BeanHamburger.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Frijol");
    }
}
