package com.example._2factorymethodtareaadicionalreactivo_helado.productoconcreto;

import com.example._2factorymethodtareaadicionalreactivo_helado.modelo.IceCream;
import com.example._2factorymethodtareaadicionalreactivo_helado.producto.IceCreamProduct;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class VanillaIceCream implements IceCreamProduct {
    @Override
    public Mono<IceCream> prepareAsync() {
        return Mono.fromCallable(() -> {
            log.info("🍦 Preparando vainilla...");
            // System.out.println("🍫 Preparando vainilla...");
            return new IceCream("vainilla", 4.5);
        });
    }
}
