package com.example._3abstractfactory.productoConcreto;

import com.example._3abstractfactory.producto.Drink;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Water implements Drink {
    @Override
    public void pour() {
        log.info("Sirviendo un vaso con agua");
    }
}
