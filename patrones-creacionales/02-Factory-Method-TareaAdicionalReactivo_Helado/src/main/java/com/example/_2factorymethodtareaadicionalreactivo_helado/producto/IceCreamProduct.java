package com.example._2factorymethodtareaadicionalreactivo_helado.producto;

import com.example._2factorymethodtareaadicionalreactivo_helado.modelo.IceCream;
import reactor.core.publisher.Mono;

public interface IceCreamProduct {
    Mono<IceCream> prepareAsync();
}
