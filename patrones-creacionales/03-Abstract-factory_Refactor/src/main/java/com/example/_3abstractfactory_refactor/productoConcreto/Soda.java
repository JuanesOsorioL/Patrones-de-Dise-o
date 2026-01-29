package com.example._3abstractfactory_refactor.productoConcreto;


import com.example._3abstractfactory_refactor.producto.Drink;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Soda implements Drink {
    @Override
    public void pour() {
        log.info("sirviendo un vaso de gaseosa");
    }
}
