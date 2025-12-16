package com.example._2factorymethod.product;

import java.util.logging.Logger;

public class BeefHamburguer implements Hamburguer {

    Logger logger = Logger.getLogger(BeefHamburguer.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Carne");
    }
}
