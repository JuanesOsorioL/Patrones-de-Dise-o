package com.example._3abstractfactory_refactor.productoConcreto;


import com.example._3abstractfactory_refactor.producto.Hamburger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeefHamburger implements Hamburger {

    @Override
    public void prepare() {
        log.info("Preparando Hamburguesa de Carne");
    }
}
