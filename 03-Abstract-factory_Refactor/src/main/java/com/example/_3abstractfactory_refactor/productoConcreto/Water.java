package com.example._3abstractfactory_refactor.productoConcreto;


import com.example._3abstractfactory_refactor.producto.Drink;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Water implements Drink {
    @Override
    public void pour() {
        log.info("Sirviendo un vaso con agua");
    }
}
