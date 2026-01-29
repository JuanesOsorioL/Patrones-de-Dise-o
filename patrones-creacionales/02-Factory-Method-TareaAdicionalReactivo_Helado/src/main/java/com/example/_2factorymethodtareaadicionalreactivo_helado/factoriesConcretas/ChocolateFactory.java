package com.example._2factorymethodtareaadicionalreactivo_helado.factoriesConcretas;

import com.example._2factorymethodtareaadicionalreactivo_helado.factoryMethod.IceCreamFactory;
import com.example._2factorymethodtareaadicionalreactivo_helado.producto.IceCreamProduct;
import com.example._2factorymethodtareaadicionalreactivo_helado.productoconcreto.ChocolateIceCream;
import reactor.core.publisher.Mono;

public class ChocolateFactory extends IceCreamFactory {
    @Override
    protected Mono<IceCreamProduct> createIceCreamAsync() {
        return Mono.fromSupplier(ChocolateIceCream::new);
    }
}
