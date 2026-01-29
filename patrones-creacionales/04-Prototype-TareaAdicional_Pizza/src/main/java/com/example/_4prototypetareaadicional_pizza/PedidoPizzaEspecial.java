package com.example._4prototypetareaadicional_pizza;

import java.util.List;

public class PedidoPizzaEspecial extends PedidoPizza {

    private Boolean bordeRelleno;

    public PedidoPizzaEspecial(String tamanio, String tipoMasa, List<String> ingredientes, Boolean bordeRelleno) {
        super(tamanio, tipoMasa, ingredientes);
        this.bordeRelleno = bordeRelleno;
    }

    public PedidoPizzaEspecial(PedidoPizzaEspecial prototipo) {
        super(prototipo);
        this.bordeRelleno = prototipo.bordeRelleno;
    }

    @Override
    public PedidoPizzaEspecial clonar() {
        return new PedidoPizzaEspecial(this);
    }


    @Override
    public String toString() {
        return "Pedido Pizza Especial {" +
                "Borde Relleno = " + bordeRelleno +
                " } " + super.toString() +
                " } ";
    }
}
