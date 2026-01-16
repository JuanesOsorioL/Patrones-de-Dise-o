package com.example._2factorymethodtareaadicionalreactivo_helado.factoriesConcretas;

import com.example._2factorymethodtareaadicionalreactivo_helado.factoryMethod.IceCreamFactory;
import com.example._2factorymethodtareaadicionalreactivo_helado.producto.IceCreamProduct;
import com.example._2factorymethodtareaadicionalreactivo_helado.productoconcreto.VanillaIceCream;
import reactor.core.publisher.Mono;

public class VanillaFactory extends IceCreamFactory {
    @Override
    protected Mono<IceCreamProduct> createIceCreamAsync() {
        return Mono.fromSupplier(VanillaIceCream::new);
    }
}
