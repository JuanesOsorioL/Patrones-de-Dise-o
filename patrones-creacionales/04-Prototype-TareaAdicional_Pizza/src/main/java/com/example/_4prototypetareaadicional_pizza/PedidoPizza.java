package com.example._4prototypetareaadicional_pizza;

import java.util.ArrayList;
import java.util.List;

public class PedidoPizza implements PrototipePizza<PedidoPizza> {

    private String tamanio;
    private String tipoMasa;
    private List<String> ingredientes;

    //Constructor normal
    public PedidoPizza(String tamanio, String tipoMasa, List<String> ingredientes) {
        this.tamanio = tamanio;
        this.tipoMasa = tipoMasa;
        this.ingredientes = new ArrayList<>(ingredientes);
    }

    //Constructor copia
    public PedidoPizza(PedidoPizza pedidoPizza) {
        this.tamanio = pedidoPizza.tamanio;
        this.tipoMasa = pedidoPizza.tipoMasa;
        this.ingredientes = new ArrayList<>(pedidoPizza.ingredientes);
    }

    @Override
    public PedidoPizza clonar() {
        return new PedidoPizza(this);
    }

    // metodo para agregar ingredientes
    public void agregarIngredientes(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "PedidoPizza { " +
                "Tamaño = '" + tamanio + '\'' +
                ", TipoMasa = '" + tipoMasa + '\'' +
                ", Ingredientes = " + ingredientes +
                '}';
    }
}
