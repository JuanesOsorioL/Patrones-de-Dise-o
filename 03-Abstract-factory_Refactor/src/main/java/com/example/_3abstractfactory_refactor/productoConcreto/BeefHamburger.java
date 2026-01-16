package com.example._3abstractfactory.productoConcreto;

import com.example._3abstractfactory.producto.Hamburger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeefHamburger implements Hamburger {

    @Override
    public void prepare() {
        log.info("Preparando Hamburguesa de Carne");
    }
}
