package com.example._2factorymethodtareaadicionalreactivo_helado.factoryMethod;

import com.example._2factorymethodtareaadicionalreactivo_helado.modelo.IceCream;
import com.example._2factorymethodtareaadicionalreactivo_helado.producto.IceCreamProduct;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public abstract class IceCreamFactory {

    // 🔴 FACTORY METHOD
    protected abstract Mono<IceCreamProduct> createIceCreamAsync();

    // 🟢 TEMPLATE METHOD
    public Mono<String> serveIceCreamAsync() {
        log.info("🏭 Fábrica lista (nada ejecutado aún)");

        return createIceCreamAsync()                 // decide QUÉ crear
                .flatMap(IceCreamProduct::prepareAsync) // prepara
                .map(IceCream::serve)   // sirve
                .doOnNext(result ->
                        log.info("✅ Servido: {}", result)
                );
    }
}

