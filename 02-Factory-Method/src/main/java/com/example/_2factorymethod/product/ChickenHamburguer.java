package com.example._2factorymethod.product;

import java.util.logging.Logger;


public class ChickenHamburguer implements Hamburguer {
    Logger logger = Logger.getLogger(ChickenHamburguer.class.getName());

    @Override
    public void prepare() {
        logger.info("Preparando Hamburguesa de Pollo");
    }
}
