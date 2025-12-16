package com.example._2factorymethod.product;

import java.util.logging.Logger;

public class BeanHamburguer implements Hamburguer {

    Logger logger = Logger.getLogger(BeanHamburguer.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Frijol");
    }
}
